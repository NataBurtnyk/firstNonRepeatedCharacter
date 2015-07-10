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
	public void shouldNullWhenStringIsEmpty() {
		assertEquals(null, c.firstNonRepeatedCharacter(""));
	}

	@Test
	public void shouldNullWhenAllCharactersRepeated() {
		assertEquals(null, c.firstNonRepeatedCharacter("Ss"));
	}

	@Test
	public void shouldFirstNonRepeatedCharacterWhenString() {
		assertEquals((Character) 'k', c.firstNonRepeatedCharacter("k"));
		assertEquals((Character) 'a', c.firstNonRepeatedCharacter("ffgga"));
		assertEquals((Character) 'g', c.firstNonRepeatedCharacter("ffgtts"));
	}

	@Test
	public void shouldFirstNonRepeatedCharacterWhenStringWithNumbers() {
		assertEquals((Character) 'u', c.firstNonRepeatedCharacter("uio9987yt654355"));
	}

	@Test
	public void shouldFirstNonRepeatedCharacterWhenLongString() {
		assertEquals(null, c.firstNonRepeatedCharacter("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz"));
	}

}


