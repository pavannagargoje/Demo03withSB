package com.hb.dao;

import java.util.List;

import com.hb.entity.Student;

public interface dao_i {

	int postdata(Student student);

	List<Student> getallstudent();
	
	boolean updatedata(Student student);
	
	boolean deletedata(int id);

}
