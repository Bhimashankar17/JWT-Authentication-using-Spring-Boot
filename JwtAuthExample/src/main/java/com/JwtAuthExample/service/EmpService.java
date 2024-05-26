package com.JwtAuthExample.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.JwtAuthExample.model.Employee;

@Service
public class EmpService {
	
	List<Employee> list = new ArrayList<>();
	
	EmpService(){
		list.add(new Employee(1,"Ram", "ram@gmail.com"));
		list.add(new Employee(1,"Sham", "sham@gmail.com"));
	}
	
	public List<Employee> getAllEmp(){
		return list;
	}

}
