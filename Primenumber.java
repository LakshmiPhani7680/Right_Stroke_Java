package com.rigthstroke.java;
import java.util.*;
public class PrimeNumber {
	public static boolean prime(int num) {
			for(int i=2;i*i<num;i++) {
				if(num%i==0) {
					return false;
				}
			}
		return true;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number you wnat to check");
		int num = scan.nextInt();
		if(num>1) {
			if(prime(num)) 
			{
				System.out.println(num+" is prime");
			}
			else 
			{
				System.out.println(num+ " is not a prime");
				}
		scan.close();
	}
		else {
			System.out.println("1 is neither prime nor composite");
		}
}
	}
