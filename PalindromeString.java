package com.rightstroke.java;
import java.util.*;
public class PalindromeString {
	public static boolean palindromeString(String name) {
		String reverse = new StringBuffer(name).reverse().toString();
		if(name.equals(reverse)) {
			System.out.println("yes");
			return true;
		}else {
			System.out.println("no");
			return false;
		}
	}
	public static void main(String [] args) {
		Scanner scan=new Scanner (System.in);
		System.out.println("Enter the name you want to check");
		String name= scan.next();
		if(palindromeString(name)) {
			System.out.println(name+" is Palindrome");
		}else {
			System.out.println(name+" is not a Palindrome");
		}
		scan.close();
	}

}
