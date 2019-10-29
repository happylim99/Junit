package com.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MyMathTest {

	@BeforeEach
	void beforeEach() {
		System.out.println("Before Each");
	}

	@AfterEach
	void afterEach() {
		System.out.println("After Each");
	}

	@BeforeAll
	static void beforeClass() {
		System.out.println("Before Class");
	}

	@AfterAll
	static void afterClass() {
		System.out.println("After class");
	}

	// To test sum(1,2,3) = 6
	@Test
	void sum3Numbers() {
		System.out.println("test 1");
		// fail("Not yet implemented");
		MyMath myMath = new MyMath();
		int result = myMath.sum(new int[] { 1, 2, 3 });
		// Check if the result is 6
		// assertEquals(expected, actual)
		assertEquals(6, result);
	}

	// To test sum(3) = 3
	@Test
	void sum1Number() {
		System.out.println("test 2");
		int[] numbers = { 3 };
		MyMath myMath = new MyMath();
		int result = myMath.sum(numbers);
		// Check if the result is 6
		// assertEquals(expected, actual)
		assertEquals(3, result);

	}

}
