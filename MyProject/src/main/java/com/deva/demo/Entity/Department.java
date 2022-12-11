package com.deva.demo.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;

@Entity
public class Department {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long departmentId;
	
	@NotBlank(message="Enter dept namae")
	private String departmentName;
	private String deprtmentCode;
	
	public String getDepartmentName() {
		return departmentName;
	}
	public Department(String departmentName, String deprtmentCode, long departmentId) {
		super();
		this.departmentName = departmentName;
		this.deprtmentCode = deprtmentCode;
		this.departmentId = departmentId;
	}
	public Department() {
	
	}
	
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public String getDeprtmentCode() {
		return deprtmentCode;
	}
	public void setDeprtmentCode(String deprtmentCode) {
		this.deprtmentCode = deprtmentCode;
	}
	
	public long getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(long departmentId) {
		this.departmentId = departmentId;
	}
	
	@Override
	public String toString() {
		return "Department [departmentName=" + departmentName + ", deprtmentCode=" + deprtmentCode + ", departmentId="
				+ departmentId + "]";
	}
	
	
	
}
