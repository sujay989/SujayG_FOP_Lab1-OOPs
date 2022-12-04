package com.greatlearning.driver;

import java.util.Scanner;

import com.greatlearning.model.Employee;
import com.greatlearning.services.CredentialService;
import com.greatlearning.services.Department;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the department from the following");
		System.out.print("1. Technical\n"+"2. Admin\n"+"3. Human Resource\n"+"4. Legal\n");
		
		Department dept = new Department();
		Employee emp = null;
		int departmentChoice = sc.nextInt();
		if(departmentChoice > 0 && departmentChoice < 5) {
			String department = dept.departmentName(departmentChoice);
			emp = new Employee("Sujay", "G");
			CredentialService cs = new CredentialService();
			cs.showCredentials(emp.getFirstName(), emp.getLastName(), department);
		}
		else {
			System.out.println("Entered department choice is not available");
		}
		
	}
}
