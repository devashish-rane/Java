//package com.deva.demo.ServiceTest;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Disabled;
//import org.junit.jupiter.api.Test;
//import org.mockito.Mockito;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
//
//import com.deva.demo.Entity.Department;
//import com.deva.demo.Repository.DepartmentRepo;
//import com.deva.demo.Service.DepartmentServiceInterface;
//
//@SpringBootTest
//public class ServiceTest {
//	
//	@Autowired
//	private DepartmentServiceInterface departmentService;
//	
//	@MockBean
//	private DepartmentRepo deptRepo;
//	
//	@BeforeEach
//	void setUp() {
//		 Department dept = Department.builder()
//				 .departmentId((long)1)
//				 .departmentName("IT")
//				 .build();
//		 
//		 Mockito.when(deptRepo.findById((long) 1).get())
//		 		.thenReturn(dept);
//	}
//	
//	@Test
//	@Disabled
//	public void whenValidDepartnameID_theDepartmentShouldFound() {
//		long department_id = 1;
//		Department found = departmentService.findOne(department_id).get();
//				
//		assertEquals(department_id, found.getDepartmentId());
//	}
//}
