package com.gl.credentailservice;

import java.util.Random;

import com.gl.interfaces.ICredentialService;
import com.gl.model.Employee;

public class CredentialServices implements ICredentialService {

	

	@Override
	public String showCredentials(Employee emp) {
		System.out.println("Dear "+emp.getFirstName()+" your generated credentials are as follows");
		System.out.println("Email --->"+emp.getGenratedEmail());
		System.out.println("Password --->"+emp.getGenratedPassword());
		return null;
	}

	@Override
	public String generatePassword() {
		
		  String capitalCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	      String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
	      String specialCharacters = "!@#$%*)(&";
	      String numbers = "1234567890";
	      String total = capitalCaseLetters + lowerCaseLetters + specialCharacters + numbers;

	
		Random random = new Random();
		
		String pwd="";
		for(int i=0;i<8;i++) {
			
			int totalLength=total.length();
			int randomIndex=random.nextInt(totalLength);
			char randomChar=total.charAt(randomIndex);
			pwd+=String.valueOf(randomChar);
		}
		
		return pwd;
	}

	@Override
	public String generateEmailAddress(Employee emp) {
		
		String emailAdd=emp.getFirstName().concat(emp.getLastName()).concat("@").concat(emp.getDepartment()).concat(".").concat("gl").concat(".").concat("com");
		
		return emailAdd;
	}

}
