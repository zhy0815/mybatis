package com.zhy.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.zhy.mapper.EmployeeMapper;
import com.zhy.model.Employee;

public class DynamicSqlTest {

	public static void main(String[] args) throws IOException {
		InputStream is=Resources.getResourceAsStream("mybatis-config.xml");
		SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(is);
		SqlSession session=factory.openSession();
		/*--id="selectEmployeeByIdLike":
		EmployeeMapper em=session.getMapper(EmployeeMapper.class);
		HashMap<String, Object> params=new HashMap<>();
//		params.put("id", 1);
		List<Employee> list=em.selectEmployeeByIdLike(params);
		list.forEach(employee->System.out.println(employee));
//		System.out.println(list);*/
		/*---id="selectEmployeeByLoginLike":
		EmployeeMapper em=session.getMapper(EmployeeMapper.class);
		HashMap<String, Object> params=new HashMap<>();
		params.put("loginname", "zhy");
		params.put("password", "123");
		List<Employee> list=em.selectEmployeeByLoginLike(params);
		list.forEach(e->System.out.print(e));*/
		/*---id="selectEmployeeChoose":
		EmployeeMapper em=session.getMapper(EmployeeMapper.class);
		HashMap<String, Object> params=new HashMap<>();
		params.put("loginname", "aaa");
		params.put("password", "123");
		params.put("id", 1);
		List<Employee> list=em.selectEmployeeChoose(params);
		list.forEach(employee->System.out.println(employee));*/
		/*---id="selectEmployeeLike":
		EmployeeMapper em=session.getMapper(EmployeeMapper.class);
		HashMap<String, Object> params=new HashMap<>();
		params.put("loginname", "aaa");
		params.put("password", "123");
//		params.put("id", 1);
		List<Employee> list=em.selectEmployeeLike(params);
		list.forEach(employee->System.out.println(employee));*/
		/*---id="updateEmployeeIfNecessary":
		EmployeeMapper em=session.getMapper(EmployeeMapper.class);
		Employee e=em.selectEmployeeWithId(1);
		e.setName("市中心");
		em.updateEmployeeIfNecessary(e);*/
		/*---id="selectEmployeeLikeName":*/
		EmployeeMapper em=session.getMapper(EmployeeMapper.class);
		Employee e=new Employee();
		e.setLoginname("b");
		List<Employee> list=em.selectEmployeeLikeName(e);
		list.forEach(employee->System.out.println(employee));
		session.commit();
		session.close();
	}

}
