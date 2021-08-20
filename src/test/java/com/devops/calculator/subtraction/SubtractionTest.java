package com.devops.calculator.subtraction;

import junit.framework.TestCase;

public class SubtractionTest extends TestCase{

	Subtraction subs = new Subtraction();

	public SubtractionTest(String name) {
		super(name);
	}

	public void testSubOfTwoPositiveNumbers() {
		assertEquals(-100.00,subs.subtraction(300.00,400.00));
		System.out.println("testSumOfTwoPositiveNumbers: "+subs.subtraction(300,400));
	}
	public void testSubOfTwoNegativeNumbers() {
		assertEquals(-100.00,subs.subtraction(-400.00,-300.00));
		System.out.println("testSumOfTwoNegativeNumbers: "+subs.subtraction(-400,-300));
	}
	public void testSubOfOneNegativeAndOnePositive() {
		assertEquals(700.00,subs.subtraction(400.00,-300.00));
		System.out.println("testSumOfTwoNegativeNumbers: "+subs.subtraction(400,-300));
	}	
}