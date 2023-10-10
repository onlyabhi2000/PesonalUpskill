package com.abhishek.manytomany.repository;

import org.hibernate.mapping.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.abhishek.manytomany.entity.Employee;
import java.util.Set;
import com.abhishek.manytomany.entity.Project;



@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{
    List<Employee> findAllByEmpId(Long empId);

}
