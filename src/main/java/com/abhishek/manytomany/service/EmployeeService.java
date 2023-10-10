package com.abhishek.manytomany.service;



import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PutMapping;

import com.abhishek.manytomany.entity.Employee;
import com.abhishek.manytomany.entity.Project;
import com.abhishek.manytomany.repository.EmployeeRepository;
import com.abhishek.manytomany.repository.ProjectRepository;

import jakarta.persistence.Entity;


@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;

	
	@Autowired
	private ProjectRepository projectRepository;


	public void saveEmployee(Employee empObj) {
		// TODO Auto-generated method stub
		
		employeeRepository.save(empObj);
		
	}

	
	public Employee assignProjectToEmployee(Long empId, Long projectId) {
		// TODO Auto-generated method stub
		Set<Project> projectSet = null;
		Employee employee = employeeRepository.findById(empId).get();
		Project project = projectRepository.findById(projectId).get();
		
		projectSet = employee.getAssignedProjects();
		projectSet.add(project);
		employee.setAssignedProjects(projectSet);
		return employeeRepository.save(employee);
//		return null;
	}


    public List<Employee> getEmployeeDetails(Long empId) {
        if (null != empId) {
            return (List<Employee>) employeeRepository.findAllByEmpId(empId);
        } else {
            return employeeRepository.findAll();
        }
    }
	
	
	
	
	

}
