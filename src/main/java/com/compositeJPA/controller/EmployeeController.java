package com.compositeJPA.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.compositeJPA.Entity.Employee;
import com.compositeJPA.Entity.EmployeeEmbedd;
import com.compositeJPA.Entity.EmployeeID;
import com.compositeJPA.repo.EmployeeEmbededRepository;
import com.compositeJPA.repo.EmployeeRepository;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	@Autowired
	EmployeeRepository employeeRepository;
	@Autowired
	EmployeeEmbededRepository employeeEmbedRepo;
	@PostMapping("/save")
public Employee save(@RequestBody Employee emp)
{
	return employeeRepository.save(emp);
}
	@GetMapping("/getEmpyeedIdclass")
public List<Employee> getAllEmployee()
{
	return employeeRepository.findAll(
			);
}
	@PostMapping("/saveembed")
	public EmployeeEmbedd saveusingEmbed(@RequestBody EmployeeEmbedd emp)
	{
		return employeeEmbedRepo.save(emp);
	}
		@GetMapping("/getembed")
	public List<EmployeeEmbedd> getAllEmployeeEmbed()
	{
		return employeeEmbedRepo.findAll(
				);
	}
	    public Employee findEmployee(int employeeID, int deptID) {
	        EmployeeID id = new EmployeeID(employeeID, deptID);
	        return employeeRepository.findById(id).orElse(null);
	    }
}
