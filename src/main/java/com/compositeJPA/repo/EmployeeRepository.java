package com.compositeJPA.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.JpaRepositoryConfigExtension;
import org.springframework.stereotype.Repository;

import com.compositeJPA.Entity.Employee;
import com.compositeJPA.Entity.EmployeeID;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, EmployeeID>{

}
