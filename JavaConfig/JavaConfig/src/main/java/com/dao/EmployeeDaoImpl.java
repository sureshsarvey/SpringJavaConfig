package com.dao;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.model.Employee;

@Repository
@Transactional
public class EmployeeDaoImpl implements EmployeeDao {

	@Autowired
	private SessionFactory factory;
	
	public void saveEmployee(Employee e) {
		// TODO Auto-generated method stub
        factory.getCurrentSession().save(e);
	}

}
