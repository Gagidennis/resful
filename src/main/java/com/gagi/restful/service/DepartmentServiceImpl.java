package com.gagi.restful.service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gagi.restful.entity.Department;
import com.gagi.restful.error.DepartmentNotFoundException;
import com.gagi.restful.repository.DepartmentRepository;
@Service
public class DepartmentServiceImpl implements DepartmentService {

	@Autowired
	private DepartmentRepository departmentrepository;
	@Override
	public Department saveDepartment(Department department) {
		
		return departmentrepository.save(department);
	}
	@Override
	public List<Department> fetchDepartmentList() {
		// TODO Auto-generated method stub
		return departmentrepository.findAll();
	}
	@Override
	public Department fetchDepartmentByID(Long departmentid) throws DepartmentNotFoundException  {
		// TODO Auto-generated method stub
		Optional <Department> department= departmentrepository.findById(departmentid);
		if(!department.isPresent()) {
			throw new DepartmentNotFoundException("department not found");
		}
		return department.get();
	}
	@Override
	public void deleteByID(Long departmentid) {
		// TODO Auto-generated method stub
		 departmentrepository.deleteById(departmentid);
	}
	@Override
	public Department updateDepartment(Long departmentid, Department department) {
		Department dp=departmentrepository.findById(departmentid).get();
		if(Objects.nonNull(department.getDepartmentName()) &&!"".equalsIgnoreCase(department.getDepartmentName())){
			dp.setDepartmentName(department.getDepartmentName());
		}
		
		if(Objects.nonNull(department.getDepartmentAddress()) &&!"".equalsIgnoreCase(department.getDepartmentAddress())){
			dp.setDepartmentAddress(department.getDepartmentAddress());
		}
		
		if(Objects.nonNull(department.getDepartmentCode()) &&!"".equalsIgnoreCase(department.getDepartmentCode())){
			dp.setDepartmentCode(department.getDepartmentCode());
		}
		return departmentrepository.save(dp);
	}
	@Override
	public Department fetchDepartmentByName(String departmentName) {
		// TODO Auto-generated method stub
		return departmentrepository.findByDepartmentName(departmentName);
	}

}
