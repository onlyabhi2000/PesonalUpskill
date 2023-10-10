package com.abhishek.manytomany.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.abhishek.manytomany.entity.Project;


@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {

}
