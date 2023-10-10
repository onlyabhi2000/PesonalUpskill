package com.abhishek.manytomany.entity;

import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Project {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long projectId;
	
	private String projectName;
	
	@JsonIgnore
	@ManyToMany(mappedBy = "assignedProjects")
	private Set<Employee> employeeSet = new HashSet<>();
	
	

}
