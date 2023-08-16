package com.devsuperior.aula.dto;

import com.devsuperior.aula.entities.Person;

public class PersonDepartmentDTO {
	private Long id;
	private String name;
	private double salary;
	
	private DepartmentDTO department;
	
	public PersonDepartmentDTO(Long id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public PersonDepartmentDTO(Person entity) {
		
	}
	public Long getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public double getSalary() {
		return salary;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public DepartmentDTO getDepartment() {
		return department;
	}
	public void setDepartment(DepartmentDTO department) {
		this.department = department;
	}
	
	
	

}
