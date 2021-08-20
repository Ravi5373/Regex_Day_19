package org.Day19_Ragex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex_PostalCode {

	public static void main(String[] args) {

		String postalcode1 = "123456";
		String postalcode2 = "A12345";
		String postalcode3 = "1234";
		String postalcode4 = "1234567";

		System.out.println(validatePostalCode(postalcode1));
		System.out.println(validatePostalCode(postalcode2));
		System.out.println(validatePostalCode(postalcode3));
		System.out.println(validatePostalCode(postalcode4));
	}

	private static boolean validatePostalCode(String postalcode) {
		String regex = "^[A-Z0-9]{6}";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(postalcode);
		return matcher.matches();

	}

}
