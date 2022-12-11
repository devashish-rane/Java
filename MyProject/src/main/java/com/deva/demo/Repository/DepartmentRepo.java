package com.deva.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.deva.demo.Entity.Department;

@Repository
public interface DepartmentRepo extends JpaRepository<Department, Long> {
	
}
