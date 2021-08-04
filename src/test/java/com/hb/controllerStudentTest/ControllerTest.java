package com.hb.controllerStudentTest;



import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import static org.mockito.Mockito.when;

import com.hb.controllerstudent.Studentcontroller;
import com.hb.entity.Student;
import com.hb.service.service_i;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(MockitoJUnitRunner.class)
public class ControllerTest {
	
@InjectMocks
Studentcontroller controller;

@Mock
service_i service;

@Autowired
Student student;

@Test
public void postdataTest() {
	Student student=new Student();
	
	when(service.postdata(student)).thenReturn("Data added successfully..");
	
	 ResponseEntity<String> msg=controller.postdata(student);
	 
	 Assert.assertNotNull(msg);
}
	

}
