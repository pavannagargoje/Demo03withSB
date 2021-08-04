package com.hb.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Student {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String name;
	private String lname;
	private String role;
	private int salary;
	
	public Student(){
		
	}
	
	
	
	public Student(int id, String name, String lname, String role, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.lname = lname;
		this.role = role;
		this.salary = salary;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getLname() {
		return lname;
	}



	public void setLname(String lname) {
		this.lname = lname;
	}



	public String getRole() {
		return role;
	}



	public void setRole(String role) {
		this.role = role;
	}



	public int getSalary() {
		return salary;
	}



	public void setSalary(int salary) {
		this.salary = salary;
	}



	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", lname=" + lname + ", role=" + role + ", salary=" + salary
				+ "]";
	}
	
	
	
	
}
