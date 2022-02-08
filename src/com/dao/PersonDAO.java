package com.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.vo.Person;

public interface PersonDAO {

	public List selectAll(); // 모든 행 가져오기

	public Person selectById(int id); // 특정한 행 가져오기

	public int insert(Person person); // 삽입

	public void update(Person person); // 업데이트

	public void delete(int id); // 삭제

}

