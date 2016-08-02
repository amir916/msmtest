package com.msmtest.apple;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class AppleTest {

	private Colour colour;
	private int weight = 10;
	private int taste = 4;
	private boolean hasWorm = false;

	private Apple apple;

	@Before
	public void canCreateApple() {
		apple = new Apple(colour, weight, taste, hasWorm);
	}

	@Test(expected=IllegalArgumentException.class)
	public void shouldNotAllowIllegalValueForTaste_1(){
		apple = new Apple(colour, weight, 5, hasWorm);
	}

	@Test(expected=IllegalArgumentException.class)
	public void shouldNotAllowIllegalValueForTaste_2(){
		apple = new Apple(colour, weight, 0, hasWorm);
	}
	
	@Test
	public void appleHasAColour() {
		assertEquals(colour, apple.getColour());
	}

	@Test
	public void appleHasAWeight() {
		assertEquals(weight, apple.getWeight());
	}

	@Test
	public void appleHasATaste() {
		assertEquals(taste, apple.getTaste());

	}

	@Test
	public void hasAppleGotAWorm() {
		assertEquals(hasWorm, apple.hasWorm());
	}
}