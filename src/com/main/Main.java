package com.main;

import java.util.List;
import org.apache.ibatis.session.SqlSession;

import com.mybatis.MyBatisConnectionFactory;
import com.dao.PersonDAO;
import com.vo.Person;

public class Main {
	public static void main(String args[]) {

		// Mybatis 세션연결
		SqlSession sqlSession = MyBatisConnectionFactory.getSqlSessionFactory()
				.openSession(true);

		// Mapper 연결
		PersonDAO person = sqlSession.getMapper(PersonDAO.class);

		// Select
		List persons = null;
		persons = person.selectAll();
		for (int i = 0; i < persons.size(); i++) {
			System.out.println("Person Id : " + ((Person) persons.get(i)).getId() + "\tPerson Name : " + ((Person) persons.get(i)).getName());
		}

		// Insert
//		Person p = new Person();
//		p.setId(5);
//		p.setName("테스터");
//		person.insert(p);
//		System.out.println("return key : " + p.getId());
		
		Person p = new Person();
		p.setId(6);
		p.setName("테스터2");
		person.insert(p);
		System.out.println("return key : " + p.getId());

		// update
//		p.setId(14);
//		p.setName("Terry");
//		person.update(p);
//		System.out.println("return key : " + p.getId());

		// Delete
//		p.setId(16);
//		person.delete(p.getId());
//		System.out.println("return key : " + p.getId());
	}

}
