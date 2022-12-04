package com.greatlearning.interfaces;

public interface ICredentials {

	//generateEmailAddress
	//generatePassword
	//showCredentials
	
	public String generateEmail(String firstname, String lastname, String department);
	
	public char[] generatePassword();
	
	public void showCredentials(String fname, String lname, String dept);
	
}
