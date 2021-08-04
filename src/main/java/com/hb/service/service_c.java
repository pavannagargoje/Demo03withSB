package com.hb.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hb.dao.dao_i;
import com.hb.entity.Student;

@Service
@Transactional
public class service_c implements service_i {
	
	@Autowired
	private dao_i dao;

	@Override
	@Transactional
	public String postdata(Student student) {
		
		int num= dao.postdata(student);
		String msg="";
		if (num>0) {
			msg="Data added successfully..";
		} else {
			msg="something went wrong...";
		}
		
		return msg;
	}

	@Override
	public List<Student> getallstudent() {
		
		List<Student> slist= dao.getallstudent();
		
		return slist;
	}
	
	@Override
	@Transactional
	public boolean updatedata(Student student) {
		
		boolean val= dao.updatedata(student);
		
		return val;
	}
	
	@Override
	@Transactional
	public boolean deletedata(int id) {
		
		boolean val=dao.deletedata(id);
		
		return val;
	}
	

}
