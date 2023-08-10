package com.onetoone.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.onetoone.repository.EmployeeRepository;
import com.onetoone.vo.Employee;

@RestController
@RequestMapping("/api/v1/employee")
public class EmployeeController {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@PostMapping("/save")
	public  List<Employee> saveEmployee(@RequestBody List<Employee> employees) {
		return employeeRepository.saveAll(employees);
	}
}
