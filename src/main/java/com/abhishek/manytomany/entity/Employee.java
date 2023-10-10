package com.abhishek.manytomany.entity;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
	
	
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private Long empId;
	
	private String empName;
	
	@ManyToMany
	@JoinTable(name = "employee_project", joinColumns = @JoinColumn(name = "employee_id"),
	inverseJoinColumns = @JoinColumn(name = "project_id"))
	private Set<Project> assignedProjects= new HashSet<>();
	

}
