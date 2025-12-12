package com.mahabir;

public class LoginService {
	
	public boolean validateUser(String user,String password) {
//		hardcoded to only have this user and password
		return user.equalsIgnoreCase("Mahabir")&&password.equals("anish143");
		
	}

}
