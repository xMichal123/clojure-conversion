package com.dataparse.request_builder;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class UtilsTest {

	@Test
	public void isNumberTest() {
		assertEquals(true, Utils.isNumber("0.123"));
		assertEquals(false, Utils.isNumber("0123"));
		assertEquals(false, Utils.isNumber("foo"));
		assertEquals(true, Utils.isNumber("123"));
	}
}
