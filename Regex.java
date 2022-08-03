package com.advance_java.Regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Regex {
	
	public static void main(String[] args) {
	
		firstName();
		lastName();
		emailId();
		mobileNo();
	}
	
	private static void firstName() {
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter the First name : ");
		String Name = scr.nextLine();
		
		
		boolean validation  = Pattern.matches("^[A-Z][a-z]{2,15}$", Name);  
	
		if (validation) {
			System.out.println("first name is correct ");
		} else {
			System.out.println("first name is incorrect ");
		}
	}
	
	private static void lastName() {
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter the last name : ");
		String Name = scr.nextLine();
		
		
		boolean validation  = Pattern.matches("^[A-Z][a-z]{2,15}$", Name);  
	
		if (validation) {
			System.out.println("last name is correct ");
		} else {
			System.out.println("last name is incorrect ");
		}
	}
	private static void emailId() {
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter the mail ID : ");
		String name = scr.nextLine();
		boolean validateEmail = Pattern.matches("^(.+)@(\\S+)$", name);   
		
		if (validateEmail) {
			System.out.println(" Mail ID is correct ");
		} else {
			System.out.println("Mail ID is incorrect ");
		}
	}

	private static void mobileNo() {
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter the mobile no. : ");
		String name = scr.nextLine();
		boolean validateEmail = Pattern.matches("^\\d{10}$", name);   
		
		if (validateEmail) {
			System.out.println("Mobile no. is correct ");
		} else {
			System.out.println("Mobile no. is incorrect ");
		}
	}
}
