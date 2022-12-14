package com.gagi.restful.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Department {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long departmentId;
	@NotBlank(message="name connot be empty")
	@NotNull(message="name connot be null")
	
	
	private String departmentName;
	private String departmentAddress;
	private String departmentCode;
	
	
	
	

	
	
	


}
