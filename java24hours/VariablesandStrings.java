package com.java24hours;

import java.time.LocalDateTime;

public class VariablesandStrings {
	public static void main(String args[]){
		
		//int age = Integer.parseInt(args[0]);
		char gender = args[1].charAt(0);
		String firstName =  args[2];
		String lastName =  args[3];
		String DoB = args[4];
		int DoBDate = Integer.parseInt(DoB.substring(0, 2));
		String DoBMonth = DoB.substring(2,4);
		int DoBYear = Integer.parseInt(DoB.substring(4));
		LocalDateTime now = LocalDateTime.now();
		int CurrentYear = now.getYear();
		int age = CurrentYear - DoBYear;
		
		switch(DoBMonth){
		case "01":
		DoBMonth = "January";
		break;
		case "02":
		DoBMonth = "February";
		break;
		case "03":
		DoBMonth = "March";
		break;
		case "04":
		DoBMonth = "April";
		break;
		case "05":
		DoBMonth = "May";
		break;
		case "06":
		DoBMonth = "June";
		break;
		case "07":
		DoBMonth = "July";
		break;
		case "08":
		DoBMonth = "August";
		break;
		case "09":
		DoBMonth = "September";
		break;
		case "10":
		DoBMonth = "October";
		break;
		case "11":
		DoBMonth = "November";
		break;
		case "12":
		DoBMonth = "December";
		break;
		
		}
		
		if (gender == 'M' || gender == 'm') {
			System.out.println("Mr " + firstName + " is " + age + " years old" + "\n" + "His last name is " + lastName);
			System.out.println("His Date of Birth is " + DoBDate + "\t" + DoBMonth + " " + DoBYear);
		} else if (gender == 'F' || gender == 'f') {
			System.out.println("Ms " + firstName + " is " + age + " years old" + "\n" + "Her last name is " + lastName);
			System.out.println("Her Date of Birth is " + DoBDate + " " + DoBMonth + " " + DoBYear);
		} else {
			System.out.println("Invalid Gender. Please enter a valid value - M/ F");
		}
	
		
	}
}
