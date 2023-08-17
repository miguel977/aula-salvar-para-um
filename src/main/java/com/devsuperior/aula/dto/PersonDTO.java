package com.devsuperior.aula.dto;

import com.devsuperior.aula.entities.Person;

public class PersonDTO {
	private Long id;
	private String name;
	private double salary;
	private Long departmentId;
	
	public PersonDTO(Long id, String name, double salary, Long departmentId) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.departmentId = departmentId;
	}
	public PersonDTO(Person entity) {
		id = entity.getId();
		name = entity.getName();
		salary = entity.getSalary();
		departmentId = entity.getDepartment().getId();
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
	public Long getDepartmentId() {
		return departmentId;
	}
	

}
