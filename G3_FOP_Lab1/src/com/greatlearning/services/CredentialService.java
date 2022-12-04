package com.greatlearning.services;

import java.util.Random;

import com.greatlearning.interfaces.ICredentials;

public class CredentialService implements ICredentials{

	@Override
	public String generateEmail(String firstname, String lastname, String department) {
		
		firstname = firstname.toLowerCase();
		lastname = lastname.toLowerCase();
		String email = firstname+lastname+"@"+department+".gl.com";
		return email;
	}

	@Override
	public char[] generatePassword() {
	
		String capitalCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
		String specialCharacters = "!@#$%^&*-=_+<>";
		String numbers = "1234567890";
		String combinedChars = capitalCaseLetters + lowerCaseLetters + specialCharacters + numbers;
		Random random = new Random();
		char[] password = new char[8];

		password[1] = lowerCaseLetters.charAt(random.nextInt(lowerCaseLetters.length()));
		password[3] = capitalCaseLetters.charAt(random.nextInt(capitalCaseLetters.length()));
		password[2] = specialCharacters.charAt(random.nextInt(specialCharacters.length()));
		password[0] = numbers.charAt(random.nextInt(numbers.length()));

		for(int i = 4; i< 8 ; i++) {
			password[i] = combinedChars.charAt(random.nextInt(combinedChars.length()));
		}

		return password;

	}

	@Override
	public void showCredentials(String fname, String lname, String dept) {
		
		System.out.println("Dear "+fname+" your generated credentials are as follows");
		System.out.println("Email --> "+generateEmail(fname, lname, dept));
		System.out.println("Password --> "+(new String(generatePassword())));
		
	}

}
