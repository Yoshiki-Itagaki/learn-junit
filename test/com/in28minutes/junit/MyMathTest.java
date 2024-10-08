package com.in28minutes.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MyMathTest {
	
	private MyMath math = new MyMath();


	@Test
	void calculateSum_ThreeMemberArray() {
		// Absence of failure is considered success
		// Test condition or Assert		
		assertEquals(6, math.calculateSum(new int[] {1,2,3}));
	}
	
	@Test
	void calculateSum_ZeroLengthArray() {
		// Absence of failure is considered success
		// Test condition or Assert		
		assertEquals(0, math.calculateSum(new int[] {}));
	}
	

}
