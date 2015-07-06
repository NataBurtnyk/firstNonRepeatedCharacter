package com.search;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


public class TestNonRepeatedCharacter {

	private NonRepeatedCharacter c;
	
	@Before
	public void setUp(){
		c = new NonRepeatedCharacter();
	}
	
	@Test
	public void SouldFirstNonRepeatedLetterWhenString() {
		assertEquals((Character)'a', c.firstNonRepeatedCharacter("ffgga"));
		assertEquals((Character)'g', c.firstNonRepeatedCharacter("ffgtts"));
	}
	
	@Test
	public void SouldNullWhenAllLettersRepeated() {
		assertEquals((Character)'0', c.firstNonRepeatedCharacter("Ss"));
	}
	
	@Test
	public void SouldNullWhenStringIsEmpty() {
		assertEquals((Character)'0', c.firstNonRepeatedCharacter(""));
	}
	
}

