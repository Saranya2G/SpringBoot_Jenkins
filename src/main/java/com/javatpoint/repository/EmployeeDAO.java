package com.javatpoint.repository;


	import java.util.List;

import org.springframework.stereotype.Repository;

import com.javatpoint.model.Employee;
import com.javatpoint.model.Employees;
	 
	
	 
	@Repository
	public class EmployeeDAO 
	{
	    private static Employees list = new Employees();
	     
	    static
	    {
	        list.getEmployeeList().add(new Employee(1, "Lokesh", "Gupta", "howtodoinjava@gmail.com"));
	        list.getEmployeeList().add(new Employee(2, "Alex", "Kolenchiskey", "abc@gmail.com"));
	        list.getEmployeeList().add(new Employee(3, "David", "Kameron", "titanic@gmail.com"));
	    }
	     
	    public Employees getAllEmployees() 
	    {
	        return list;
	    }
	     
	    public void addEmployee(Employee employee) {
	        list.getEmployeeList().add(employee);
	    }
	}
