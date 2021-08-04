package com.hb.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.hb.entity.Student;

@Repository
public class dao_c implements dao_i {
	
	@Autowired
	SessionFactory sessionFactory;

	@Override
	public int postdata(Student student) {
		
		  Session session= sessionFactory.getCurrentSession();
		                 int num= (int) session.save(student);
		
		return num;
	}

	@Override
	public List<Student> getallstudent() {
	
		Session session= sessionFactory.getCurrentSession();
	 	Criteria criteria= session.createCriteria(Student.class);
	 	List<Student> slist= criteria.list();
		return slist;
	}
	
	@Override
	public boolean updatedata(Student student) {
               boolean val=false;     
		 Session session= sessionFactory.getCurrentSession();
		              session.saveOrUpdate(student);
		              val=true;
		return val;
	}
	
	@Override
	public boolean deletedata(int id) {
		boolean val=false;
		Session session=sessionFactory.getCurrentSession();
		Student stu=new Student();
		stu.setId(id);
		session.delete(stu);
		val=true;
		return val;
	}

}
