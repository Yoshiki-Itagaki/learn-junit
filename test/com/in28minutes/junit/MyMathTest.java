package com.in28minutes.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MyMathTest {

	@Test
	void test() {
		
		int[] numbers = {1,2,3};
		MyMath math = new MyMath();
		int actualResult = math.calculateSum(numbers);
		System.out.println(actualResult);
		
		int expectedResult = 5;
		assertEquals(expectedResult, actualResult);
		
		// Absence of failure is considered success
		// Test condition or Assert
	}

}
