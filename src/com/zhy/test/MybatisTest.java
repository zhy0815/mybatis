package com.zhy.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.zhy.mapper.BookMapper;
import com.zhy.mapper.CategoryMapper;
import com.zhy.mapper.CustomerMapper;
import com.zhy.mapper.OrderMapper;
import com.zhy.mapper.PersonMapper;
import com.zhy.model.Book;
import com.zhy.model.Category;
import com.zhy.model.Customer;
import com.zhy.model.Order;
import com.zhy.model.Person;
import com.zhy.model.Student;
import com.zhy.model.User;
public class MybatisTest {
	private static final Log logger=LogFactory.getLog(MybatisTest.class);
	public static void main(String[] args) {
		InputStream inputStream=null;
		try {
			inputStream=Resources.getResourceAsStream("mybatis-config.xml");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(inputStream);
		SqlSession session=factory.openSession();
		/*---id="saveUser"
		String saveUser="com.zhy.mapper.userMapper.saveUser";
		User user=new User("zhy", "男", 24);
		session.insert(saveUser, user);---*/
		/*---id="saveUser2":
		int a=session.insert("com.zhy.mapper.userMapper.saveUser2");
		logger.info("插入数量："+a);*/
		/*---id="updateUser":
		session.update("com.zhy.mapper.userMapper.updateUser");*/
		/*---id="updateUser2"
		User user=new User("王帅", "男", 24);
		user.setId(1);
		session.update("com.zhy.mapper.userMapper.updateUser2", user);*/
		/**---id="updateUser3":
		session.update("com.zhy.mapper.userMapper.updateUser3", 8);*/
		/**---id="deleteUser":
		session.delete("com.zhy.mapper.userMapper.deleteUser");*/
		/*--id="deleteUser2":
		User user=new User();
		user.setId(7);
		session.delete("com.zhy.mapper.userMapper.deleteUser2", user);*/
		/*--id="deleteUser3":
		session.delete("com.zhy.mapper.userMapper.deleteUser3", 6);*/
		/*---id="selectOneUser":
		User user=session.selectOne("com.zhy.mapper.userMapper.selectOneUser");
		System.out.println(user);*/
		/*---id="selectOneUser2":
		User user=session.selectOne("com.zhy.mapper.userMapper.selectOneUser2", 8);
		System.out.println(user);*/
		/*---id="selectList":
		List<User> userList=session.selectList("com.zhy.mapper.userMapper.selectList");
		for(User user:userList){
			System.out.println(user);
		}*/
		/*---id="selectList2":
		List<User> userList=session.selectList("com.zhy.mapper.userMapper.selectList2");
		for(User user:userList){
			System.out.println(user);
		}*/
		/*---id="selectList3" :
		List<User> userList=session.selectList("com.zhy.mapper.userMapper.selectList3", "女");
		for(User user:userList){
			System.out.println(user);
		}*/
		/*---id="selectList4":
		RowBounds rowBound=new RowBounds(1, 2);//offset:当前页数,limit:每页显示的数量
		List<User> userList=session.selectList("com.zhy.mapper.userMapper.selectList4", null, rowBound);
		for(User user:userList){
			System.out.println(user);
		}*/
		/*---id="resultmap":
		List<Map<String, Object>> list=session.selectList("com.zhy.mapper.userMapper.resultmap");
		for(Map<String, Object> map:list){
			System.out.println(map);
		}*/
		/*---映射学生对象的resultMap:
		List<Student> stus=session.selectList("com.zhy.mapper.studentMapper.selectStudent");
		for(Student s:stus){
			System.out.println(s);
		}*/
		/*---映射班级对象的resultMap:
		List<com.zhy.model.Class> classes=session.selectList("com.zhy.mapper.studentMapper.selectClass");
		for(com.zhy.model.Class clazz:classes){
			System.out.println(clazz);
			System.out.println(classes.size());//
			List<Student> stus=clazz.getStudents();
			System.out.println(stus.size());//
			for(Student stu:stus){
				System.out.println(stu.printInfor());
			}
		}*/
		/*Person类与Card类一对一：
		// 获得mapper接口的代理对象
		PersonMapper pm=session.getMapper(PersonMapper.class);
		// 直接调用接口的方法，查询id为1的Peson数据
		Person p=pm.selectPersonById(1);
		System.out.println(p);
		System.out.println(p.getCard());*/
		/*---Category类与Book类一对多：
		CategoryMapper cm=session.getMapper(CategoryMapper.class);
		Category c=cm.selectCategoryById(1);
		System.out.println(c);
		System.out.println(c.getBooks());
		System.out.println("----------------");
		BookMapper bm=session.getMapper(BookMapper.class);
		Book b=bm.selectBookById(1);
		System.out.println(b);
		System.out.println(b.getCategory());*/
		/*---一对多：
		CustomerMapper cm=session.getMapper(CustomerMapper.class);
		Customer c=cm.selectCustomerById(1);
		System.out.println(c);
		System.out.println(c.getOrders());
		System.out.println("--------------");
		OrderMapper om=session.getMapper(OrderMapper.class);
		Order o=om.selectOrderById(2);
		System.out.println(o);
		System.out.println(o.getCustomer());*/
		session.commit();
		session.close();
	}
}
