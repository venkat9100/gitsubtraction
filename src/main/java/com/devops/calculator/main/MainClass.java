package com.devops.calculator.main;

import java.util.Scanner;
import com.devops.calculator.subtraction.Subtraction;

public class MainClass {

	public static void main(String[] args) {
		
		Subtraction sub = new Subtraction();
		
		System.out.println("\n\t Sample output of subtraction of two numbers 10-100 is: "+sub.subtraction(10,100));
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("\nEnter a number for 'A': ");
		int A = sc.nextInt();
		
		System.out.print("Enter a number for 'B': ");
		int B = sc.nextInt();
		
		System.out.println("\n\tAdding two numbers A-B is: "+sub.subtraction(A,B));

	}

}
