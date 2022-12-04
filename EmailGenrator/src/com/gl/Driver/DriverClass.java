package com.gl.Driver;

import java.util.Scanner;

import com.gl.credentailservice.CredentialServices;
import com.gl.model.Employee;

public class DriverClass {
	
	public static void main(String[] args) {
		
		
		 System.out.println("Please choose the department from the following options");
		 System.out.println("1 Technical");
		 System.out.println("2 Admin");
		 System.out.println("3 Human Resorce");
		 System.out.println("4 Legal");
		 
		 CredentialServices objCredentialServices=new CredentialServices();
		 
		 Scanner userInput=new Scanner(System.in);
		 int options=userInput.nextInt();
		 String email="";
		 String pwd="";
		 
		 switch(options) {
		 
		 case 1:
			 Employee emp1=new Employee("jhon","Adam","tech");
			 email=objCredentialServices.generateEmailAddress(emp1);
			 pwd=objCredentialServices.generatePassword();
			 emp1.setGenratedEmail(email);
			 emp1.setGenratedPassword(pwd);
			 objCredentialServices.showCredentials(emp1);
			 
			    break; 
		 case 2:
			 Employee emp2=new Employee("jhon","Adam","admin");
			 email=objCredentialServices.generateEmailAddress(emp2);
			 pwd=objCredentialServices.generatePassword();
			 emp2.setGenratedEmail(email);
			 emp2.setGenratedPassword(pwd);
			 objCredentialServices.showCredentials(emp2);
				break; 
		 case 3:
			 Employee emp3=new Employee("jhon","Adam","hr");
			 email=objCredentialServices.generateEmailAddress(emp3);
			 pwd=objCredentialServices.generatePassword();
			 emp3.setGenratedEmail(email);
			 emp3.setGenratedPassword(pwd);
			 objCredentialServices.showCredentials(emp3);
				break; 
		 case 4:
			 Employee emp4=new Employee("jhon","Adam","lg");
			 email=objCredentialServices.generateEmailAddress(emp4);
			 pwd=objCredentialServices.generatePassword();
			 emp4.setGenratedEmail(email);
			 emp4.setGenratedPassword(pwd);
			 objCredentialServices.showCredentials(emp4);
				break; 
		 
		 }
		 
	}

}
