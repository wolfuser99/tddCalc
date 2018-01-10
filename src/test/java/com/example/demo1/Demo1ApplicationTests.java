package com.example.demo1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class Demo1ApplicationTests {

	@Test
	public void test1() {
		//fail("no funka");

		//arrage
		String string= "asd";

		//act
		String res= string.toUpperCase();
		//assert

		assertEquals("ASD", res);

	}


	@Test
	public void test2(){

	}
}
