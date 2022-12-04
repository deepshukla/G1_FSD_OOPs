package com.gl.interfaces;

import com.gl.model.Employee;

public interface ICredentialService {
	
	//generatePassword
	//generateEmailAddress
	//showCredentials
	
	String generatePassword();
	String generateEmailAddress(Employee emp);
	String showCredentials(Employee emp);

}
