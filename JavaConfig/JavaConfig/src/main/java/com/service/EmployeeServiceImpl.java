package com.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.EmployeeDao;
import com.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao dao;
	
	public void save() {
		// TODO Auto-generated method stub
         Employee em = new Employee();
         em.setEmployeeName("Suresh");
         em.setDesignation("Software Engineer");
         dao.saveEmployee(em);
	}

}
