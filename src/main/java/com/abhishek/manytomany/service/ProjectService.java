package com.abhishek.manytomany.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abhishek.manytomany.entity.Project;
import com.abhishek.manytomany.repository.ProjectRepository;

import jakarta.persistence.Entity;

@Service
public class ProjectService {
	
	@Autowired
	private ProjectRepository projectRepository;



    public void saveProject(Project projectObj) {
        projectRepository.save(projectObj);
    }

}
