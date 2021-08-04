package com.hb.service;

import java.util.List;

import com.hb.entity.Student;

public interface service_i {

	String postdata(Student student);

	List<Student> getallstudent();
	
	boolean updatedata(Student student);
	
	boolean deletedata(int id);

}
