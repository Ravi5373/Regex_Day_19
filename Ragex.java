package org.Day19_Ragex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ragex {

	public static void main(String[] args) {
		
		String emailId1 = "User@domain.com";
		String emailId2 = "User@domain.co.in";
		String emailId3 = "User1@domail.com";
		String emailId4 = "User.name@domain.com";
		String emailId5 = "User@domaincom";
		String emailId6 = "User#domain.com";
		String emailId7 = "@domain.com";
		
		System.out.println (validateEmailId(emailId1));
		System.out.println (validateEmailId(emailId2));
		System.out.println (validateEmailId(emailId3));
		System.out.println (validateEmailId(emailId4));
		System.out.println (validateEmailId(emailId5));
		System.out.println (validateEmailId(emailId6));
		System.out.println (validateEmailId(emailId7));
	}
		
		private static boolean validateEmailId(String emailId) {
			String regex = "^[A-Za-z0-9+-_,]+@(.+)$";
			Pattern pattern = Pattern.compile(regex);
			Matcher matcher = pattern.matcher(emailId);
			return matcher .matches();
		
		
		
		
	}
	
}
