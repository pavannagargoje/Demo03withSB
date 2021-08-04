package com.hb.controllerstudent;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hb.entity.Student;
import com.hb.service.service_i;

@RestController
public class Studentcontroller {

	@Autowired
	private service_i service;
	
	
	@PostMapping(value="/poststudent")
	public ResponseEntity<String> postdata(@RequestBody Student student){
		
		  String msg=service.postdata(student);
		
		return new ResponseEntity<>(msg,HttpStatus.OK);
	}
	
	
	@GetMapping(value="/getstudent")
	public ResponseEntity<List<Student>> getallstudent(){
		
		List<Student> slist= service.getallstudent();
		
		return new ResponseEntity<>(slist,HttpStatus.FOUND);
	}
	
	
	@PutMapping(value = "/putdata")
	public ResponseEntity<String> updatedata(@RequestBody Student student){
		
		boolean val=service.updatedata(student);
		if (val) {
			return new ResponseEntity<>("data updated successfully",HttpStatus.OK);	
		} else {
			return new ResponseEntity<>("data not updated",HttpStatus.FORBIDDEN);
		}
	
	}
	
	@DeleteMapping(value = "/deletedata/{id}")
	public ResponseEntity<String> deletedata(@PathVariable ("id") int id ){
		
		
		boolean val=service.deletedata(id);
		
		if(val) {
			return new ResponseEntity<>("data deleted successfully",HttpStatus.OK);
		}else {
			return new ResponseEntity<>("data not deleted",HttpStatus.FORBIDDEN);
		}	
	}
	
	
	
	
	}
