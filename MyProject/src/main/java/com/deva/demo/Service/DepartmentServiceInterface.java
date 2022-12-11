package com.deva.demo.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.deva.demo.Entity.Department;

@Service
public interface DepartmentServiceInterface {

	Department saveOne(Department department);

	List<Department> findAll();
	
	Department findOne(long id);
	
	long deleteOne(long id);

    Department updateDept(long Id, Department dept);
}
