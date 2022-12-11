package com.deva.demo.Service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.deva.demo.Entity.Department;
import com.deva.demo.Repository.DepartmentRepo;

@Service
public class DepartmentServiceImplement implements DepartmentServiceInterface {
	
	@Autowired
	private DepartmentRepo deptRepo;
	
	public Department saveOne(Department department) {
		
		return deptRepo.save(department);
		
	}
	
	public List<Department> findAll() {
		
		return deptRepo.findAll();
		
	}

	public Department findOne(long id) {
		
		return deptRepo.findById(id).get();
	}
	
	public long deleteOne(long id) {
		deptRepo.deleteById(id);
		return id ;
	}
	
	public Department updateDept(long id, Department dept) {
		Department currentDept = deptRepo.findById(id).get();
		
		if(Objects.nonNull(currentDept.getDepartmentName()) && !"".equals(currentDept.getDepartmentName()) ) {
			currentDept.setDepartmentName(dept.getDepartmentName());
		}
		
		if(Objects.nonNull(currentDept.getDeprtmentCode()) && !"".equals(currentDept.getDeprtmentCode()) ) {
			currentDept.setDeprtmentCode(dept.getDeprtmentCode());
		}
		deptRepo.save(currentDept);
		return currentDept;
	}
	

}
