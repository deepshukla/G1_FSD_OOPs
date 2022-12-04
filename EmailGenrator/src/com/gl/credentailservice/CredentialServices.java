package com.gl.credentailservice;

import com.gl.interfaces.ICredentialService;
import com.gl.model.Employee;

public class CredentialServices implements ICredentialService {

	

	@Override
	public String showCredentials(Employee emp) {
		
		return null;
	}

	@Override
	public String generatePassword() {
		
		return null;
	}

	@Override
	public String generateEmailAddress(Employee emp) {
		
		String emailAdd=emp.getFirstName().concat(emp.getLastName()).concat("@").concat(emp.getDepartment()).concat(".").concat(emp.getCompanyName()).concat(".").concat("com");
		
		return emailAdd;
	}

}
