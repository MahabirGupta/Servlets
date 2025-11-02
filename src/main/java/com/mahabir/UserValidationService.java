package com.mahabir;

public class UserValidationService {
	
	public boolean isUserValid(String user,String password) {
//		hardcoded to only have this user and password
		if(user.equals("Mahabir")&&password.equals("anish143")) {
			return true;
		}
		return false;
	}

}
