package com.base;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class MathOperationsTest {
	
	public MathOperations mo;
	 

	@Test
	public void testSubt() {
		long result= (100+20)-120;
		System.out.println("Result: "+result);
		System.out.println("Hi");
		System.out.println("Op :"+mo.subt(100,20,-90));
		System.out.println("Hello");
		assertEquals(result, mo.subt(100,20,-90));
		
	}

	@Test
	public void testAdd() {
		
	}

}
