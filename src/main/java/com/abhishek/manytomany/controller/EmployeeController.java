package com.abhishek.manytomany.controller;

import java.net.http.HttpResponse;

import org.hibernate.mapping.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abhishek.manytomany.entity.Employee;
import com.abhishek.manytomany.service.EmployeeService;
@RestController
@RequestMapping("/employees")
public class EmployeeController {

    // EmployeeService bean to call service methods
    @Autowired 
    private EmployeeService employeeService;

    // Save new employee
    @PostMapping("/save")
    public ResponseEntity<Employee> saveEmployee(@RequestBody Employee empObj){
        employeeService.saveEmployee(empObj);
        return new ResponseEntity<>(HttpStatus.OK);
    }

	@GetMapping(value = {"/getEmployees", "/{empId}"})
	public java.util.List<Employee> getEmployee(@PathVariable(required = false) Long empId) {
		return employeeService.getEmployeeDetails(empId);

	}
    
    // Assign project to existing employee
    @PutMapping("/{empId}/project/{projectId}") 
    public Employee assignProjectToEmployee(@PathVariable Long empId , @PathVariable Long projectId ) {
        
        // Call service method to make assignment
        return employeeService.assignProjectToEmployee(empId , projectId);
        
    }



}
