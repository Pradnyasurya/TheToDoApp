package com.surya.thetodoapp.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
	
	public boolean authenticate(String username, String password) {
		
		boolean isValidUsername = username.equalsIgnoreCase("surya");
		boolean isValidPassword = password.equalsIgnoreCase("password");
		
		
		return isValidUsername && isValidPassword;
		
	}

}
