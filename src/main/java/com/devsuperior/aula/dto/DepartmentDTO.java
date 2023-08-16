package com.devsuperior.aula.dto;

public class DepartmentDTO {
	private Long id;
	private String name;
	private double salary;
	public DepartmentDTO(Long id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.setSalary(salary);
	}
	public Long getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	
	public DepartmentDTO getDepartment() {
		
		return null;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	
	
}
