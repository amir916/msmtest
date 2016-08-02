package com.msmtest.apple;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class AppleTest {

	private Colour colour = Colour.GREEN;
	private int weight = 10;
	private int taste = 4;
	private boolean hasWorm = false;

	private Apple apple;

	@Before
	public void canCreateApple() {
		apple = new Apple(colour, weight, taste, hasWorm);
	}

	@Test
	public void canCreateRedApple() {
		apple = new Apple(Colour.RED, weight, taste, hasWorm);
		assertEquals(Colour.RED, apple.getColour());
	}
	
	@Test
	public void canCreateBlueApple() {
		apple = new Apple(Colour.BLUE, weight, taste, hasWorm);
		assertEquals(Colour.BLUE, apple.getColour());
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void shouldNotAllowIllegalValueForColour(){
		apple = new Apple(null, weight, taste, hasWorm);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void shouldNotAllowIllegalValueForTaste_1(){
		apple = new Apple(colour, weight, 5, hasWorm);
	}

	@Test(expected=IllegalArgumentException.class)
	public void shouldNotAllowIllegalValueForTaste_2(){
		apple = new Apple(colour, weight, 0, hasWorm);
	}

	@Test(expected=IllegalArgumentException.class)
	public void shouldNotAllowIllegalValueForWeight_1(){
		apple = new Apple(colour, 9, taste, hasWorm);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void shouldNotAllowIllegalValueForWeight_2(){
		apple = new Apple(colour, 101, taste, hasWorm);
	}
	
	@Test
	public void canCreateAGreenApple() {
		apple = new Apple(Colour.GREEN, weight, taste, hasWorm);
		assertEquals(Colour.GREEN, apple.getColour());
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
	
	@Test
	public void appleCanBePeeled(){
		apple.peel();
		assertTrue(apple.isPeeled());
	}
	
	@Test
	public void appleCanBeEaten(){
		apple.eat();
		assertTrue(apple.isEaten());
	}
}