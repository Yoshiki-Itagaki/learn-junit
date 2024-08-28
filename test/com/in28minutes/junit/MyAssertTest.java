package com.in28minutes.junit;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class MyAssertTest {
	
	List<String> todos = Arrays.asList("AWS", "Azure", "DevOps");

	@Test
	void test() {
		boolean test1 = todos.contains("AWS");
		boolean test2 = todos.contains("GCP");
		assertEquals(true, test1);	
		assertTrue(test1);
		assertFalse(test2);
		assertEquals(3, todos.size(), "Error Message");
		
		assertArrayEquals(new int[] {1,2}, new int[] {1,2});
		
		// assertNull
		// assertNotNull
		
	}

}
