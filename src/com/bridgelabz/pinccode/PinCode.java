package com.bridgelabz.pinccode;
import java.util.*;
import java.util.regex.*;
public class PinCode {

	public static void main(String[] args) {
			Scanner sc= new Scanner(System.in);
			System.out.println("ENTER THE PINCODE TO BE CHECKED");
			String pincode= sc.next();
			checkValidFirstName(pincode);
		}
		public static void checkValidFirstName(String pincode) 
		{
			String regexCheck= "^[1-9]{1}[0-9]{2}\\s{0,1}[0-9]{3}$";
			Pattern pattern = Pattern.compile(regexCheck);
			Matcher obj= pattern.matcher(pincode);
			if(obj.matches()==true)
			{
			System.out.println("THIS IS A VALID PINCODE");
				
			}
			else
				System.out.println("NOT A VALID PINCODE");
			
		}


	}


