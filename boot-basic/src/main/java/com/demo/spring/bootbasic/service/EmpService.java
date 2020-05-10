package com.demo.spring.bootbasic.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.demo.spring.bootbasic.entity.Employee;
import com.demo.spring.bootbasic.repo.Emprepo;

@Service
public class EmpService {

	@Autowired
	private Emprepo emprepo;

	public Employee addEmp(Employee obj) {

		Employee emp = emprepo.save(obj);
		if (!StringUtils.isEmpty(emp))
			return emp;

		return null;
	}
}
