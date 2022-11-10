package com.gagi.restful.controller;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.gagi.restful.entity.Department;
import com.gagi.restful.error.DepartmentNotFoundException;
import com.gagi.restful.service.DepartmentService;

@RestController
public class DepartmentController {
   @Autowired
	private DepartmentService departmentservice;
	@PostMapping("/departments")
	public Department saveDepartment(@Valid @RequestBody Department department )
	{ 
		return departmentservice.saveDepartment(department);
		
	}
	@GetMapping("/departments")
	public List<Department> fetchDepartmentList(){
	return departmentservice.fetchDepartmentList();
	}
	@GetMapping("/departments/{id}")
	public Department fetchDepartmentByID(@PathVariable("id") Long departmentid) throws DepartmentNotFoundException {
		return departmentservice.fetchDepartmentByID( departmentid);
	}
	
	@DeleteMapping("/departments/{id}")
    public String deleteByID(@PathVariable("id") Long departmentid) {
    	 departmentservice.deleteByID(departmentid);
    	 return "deleted successfully";
	}
	
	@PutMapping("/departments/{id}")
	public Department updateDepartment(@PathVariable("id") Long departmentid, @RequestBody Department department) {
		return departmentservice.updateDepartment(departmentid, department);
	}
	
	@GetMapping("/departments/name/{name}")
	public Department fetchDepartmentByName(@PathVariable("name") String departmentName) {
		return departmentservice.fetchDepartmentByName( departmentName);
	}
}
