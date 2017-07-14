package com.ck.test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.ck.entity.Calculator;

public class TestCalculator {
	Calculator cal = new Calculator();
	
	@Test
	public void TestAdd(){
		assertTrue(3==Calculator.sum(1,2));
		System.out.println("Add Test Passed");
	}
	
	@Test
	public void TestSubtract(){
		assertTrue(1 == Calculator.subtract(3,2));
		System.out.println("Subtract Test Passed");
	}
	
	@Test
	public void TestMultiply(){
		assertTrue(6 == Calculator.multiply(3,2));
		System.out.println("Multiply Test Passed");
	}
	
}
