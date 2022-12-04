package com.greatlearning.services;

public class Department {

	public String departmentName(int departmentChoice){	
		String department = null;

		switch(departmentChoice) 
		{
		case 1:
			department = "tech";
			break;


		case 2:
			department = "admin";
			break;

		case 3:
			department = "hr";
			break;

		case 4:
			department = "legal";
			break;

		default:
			break;

		}

		return department;
	}
}
