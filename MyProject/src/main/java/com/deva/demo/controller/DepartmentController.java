package com.deva.demo.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.deva.demo.Entity.Department;
import com.deva.demo.Service.DepartmentServiceImplement;
import com.deva.demo.Service.DepartmentServiceInterface;

import jakarta.validation.Valid;

@RestController
public class DepartmentController {
	
	private final Logger LOGGER = LoggerFactory.getLogger(DepartmentController.class);
	
	@Autowired
	private DepartmentServiceInterface deptService;
	
	@PostMapping("/saveDept")
	public Department saveDepartment(@Valid @RequestBody Department department) {
		LOGGER.info("saving dept");
		return deptService.saveOne(department);
	}
	
	@GetMapping("/getDeptList")
	public List<Department> getDepartments() {
		
		return deptService.findAll();
	}
	
	@GetMapping("/getDept/{id}")
	public Department getOneDepartments(@PathVariable long id) {
		
		return deptService.findOne(id);
	}
	
	@DeleteMapping("/deleteDept/{id}")
	public long deleteOneDepartments(@PathVariable long id) {
		
		return deptService.deleteOne(id);
	}
	
	@PutMapping("/updateDept/{id}")
	public Department updateDepartment(@PathVariable long id, @RequestBody Department department) {
		
		return deptService.updateDept(id,department);
	}
}
