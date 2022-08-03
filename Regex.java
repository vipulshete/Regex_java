package com.advance_java.Regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Regex {
	
	public static void main(String[] args) {
	
		name();
	}
	
	private static void name() {
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter the First name : ");
		String firstName = scr.nextLine();
		
		
		boolean validation  = Pattern.matches("^[A-Z][a-z]{3}$", firstName);  
	
		if (validation) {
			System.out.println("first name is incorrect ");
		} else {
			System.out.println("first name is correct ");
		}
	}
	
}
