package com.gl.model;

public class Employee {
	
	private String firstName;
	private String lastName;
	private String department;
	private String genratedEmail;
	private String genratedPassword;
	
	public String getGenratedEmail() {
		return genratedEmail;
	}


	public void setGenratedEmail(String genratedEmail) {
		this.genratedEmail = genratedEmail;
	}


	public String getGenratedPassword() {
		return genratedPassword;
	}


	public void setGenratedPassword(String genratedPassword) {
		this.genratedPassword = genratedPassword;
	}


	public Employee(String firstName, String lastName, String department) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.department = department;
	}


	public String getDepartment() {
		return department;
	}


	public void setDepartment(String department) {
		this.department = department;
	}



	
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	

}
