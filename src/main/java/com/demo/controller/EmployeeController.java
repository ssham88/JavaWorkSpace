package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.domain.Employee;
import com.demo.service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeService empService;
	@RequestMapping("home")
	public List<Employee> showData() {
		List<Employee> list = empService.getAllEmployee();
		return list;
 	}

}
