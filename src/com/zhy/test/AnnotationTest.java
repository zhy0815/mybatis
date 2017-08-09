package com.zhy.test;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.zhy.model.User;

public class AnnotationTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		InputStream is=Resources.getResourceAsStream("mybatis-config.xml");
		SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(is);
		SqlSession session=factory.openSession();
//		UserMapper um=session.getMapper(UserMapper.class);
//		User user=new User("insert", "女", 1);
//		System.out.println(um.saveUser(user));
		session.commit();
		session.close();
	}

}
