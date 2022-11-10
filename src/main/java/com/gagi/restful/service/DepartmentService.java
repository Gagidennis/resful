package com.gagi.restful.service;



import java.util.List;

import org.springframework.stereotype.Service;

import com.gagi.restful.entity.Department;
import com.gagi.restful.error.DepartmentNotFoundException;

@Service
public interface DepartmentService {

	public Department saveDepartment(Department department);

	public List<Department> fetchDepartmentList();

	public Department fetchDepartmentByID(Long departmentid) throws DepartmentNotFoundException;

	public void deleteByID(Long departmentid);

	public Department updateDepartment(Long departmentid, Department department);

	public Department fetchDepartmentByName(String departmentName);

}
