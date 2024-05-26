package com.JwtAuthExample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.JwtAuthExample.service.EmpService;
import com.JwtAuthExample.model.Employee;
import java.util.List;

@RestController
public class HomeController {
	
	@Autowired
	private EmpService empService;
	
	@GetMapping("/emp")
	public List<Employee> getEmpe() {
		return this.empService.getAllEmp();
	}

}
