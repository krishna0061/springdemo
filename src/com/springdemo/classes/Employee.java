package com.springdemo.classes;

public class Employee {
	
	
	public String name;
	
	public String getName() {
		
	
	return name;
	
	}
	
	public void setName(String nm) {
		
	this.name=nm;
	}
	
	
	public Employee(String name) {
		
		this.name = name;
		
	}
	public void displayName() {
		System.out.println(name);
	}

	
}
