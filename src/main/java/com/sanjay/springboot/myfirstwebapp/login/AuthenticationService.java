package com.sanjay.springboot.myfirstwebapp.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
	public boolean authenticate(String username,String password) {
		
		boolean isvalidusername = username.equalsIgnoreCase("sanjay");
		boolean isvalidpassword = password.equalsIgnoreCase("1234");
		
		return isvalidusername && isvalidpassword;
	}
	
}
