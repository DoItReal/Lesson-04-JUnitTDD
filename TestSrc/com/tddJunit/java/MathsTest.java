package com.tddJunit.java;

import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MathsTest {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

	 private Maths classundertest;	

	@Before
	public void setUp() throws Exception {

		 classundertest = new Maths();

	}

    @After
    public void tearDown() throws Exception {
    }

	@Test
	public void testAdd() {
		 //fail("Not yet implemented");

			long result = 10+2;
assertEquals(result, classundertest.add(10,2));

	}

	@Test
	public void testSubtract() {
	// fail("Not yet implemented");
	 long result = 10-2;
		assertEquals(result, classundertest.subtract(10,2));

	}

}
