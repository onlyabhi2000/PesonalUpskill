package com.abhishek.manytomany.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abhishek.manytomany.entity.Employee;
import com.abhishek.manytomany.entity.Project;
import com.abhishek.manytomany.repository.ProjectRepository;
import com.abhishek.manytomany.service.ProjectService;

@RestController
@RequestMapping("/project")
public class ProjectController {
	
	
	@Autowired
	private ProjectService projectService;
	

	
    @PostMapping("/save")
    public ResponseEntity createProject(@RequestBody Project projectObj) {
        projectService.saveProject(projectObj);
        return new ResponseEntity(HttpStatus.CREATED);
    }
    



}
