package com.msmtest.apple;

import static org.junit.Assert.*;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.Test;
import org.mockito.Mockito;

public class PeelerTest {
	
	@Test
	public void shouldPeelGreenAppleWhenPeelerIsNormal(){
		int weight = 50;
		int taste = 4;
		boolean hasWorm = false;
		
		//GIVEN
		Apple apple = Mockito.spy(new Apple(Colour.GREEN, weight, taste, hasWorm));
		Peeler peeler = new Peeler(PeelerType.NORMAL);
		
		//WHEN
		peeler.peel(apple);
		
		//THEN
		verify(apple, times(1)).peel();
		assertTrue(apple.isPeeled());
	}
	
	@Test
	public void shouldPeelRedAppleWhenPeelerIsNormal(){
		int weight = 50;
		int taste = 4;
		boolean hasWorm = false;
		
		//GIVEN
		Apple apple = Mockito.spy(new Apple(Colour.RED, weight, taste, hasWorm));
		Peeler peeler = new Peeler(PeelerType.NORMAL);
		
		//WHEN
		peeler.peel(apple);
		
		//THEN
		verify(apple, times(1)).peel();
		assertTrue(apple.isPeeled());
	}
	
	@Test
	public void shouldNotPeelBlueAppleWhenPeelerIsNormal(){
		int weight = 50;
		int taste = 4;
		boolean hasWorm = false;
		
		//GIVEN
		Apple apple = Mockito.spy(new Apple(Colour.BLUE, weight, taste, hasWorm));
		Peeler peeler = new Peeler(PeelerType.NORMAL);
		
		//WHEN
		peeler.peel(apple);
		
		//THEN
		verify(apple, times(0)).peel();
		assertFalse(apple.isPeeled());
	}
	
	@Test
	public void shouldBeAbleToPeelBlueAppleWhenPeelerIsValyrian(){
		int weight = 50;
		int taste = 4;
		boolean hasWorm = false;
		
		//GIVEN
		Apple apple = Mockito.spy(new Apple(Colour.BLUE, weight, taste, hasWorm));
		Peeler peeler = new Peeler(PeelerType.VALYRIAN);
		
		//WHEN
		peeler.peel(apple);
		
		//THEN
		verify(apple, times(1)).peel();
		assertTrue(apple.isPeeled());
	}
	
	@Test
	public void shouldPeelGreenAppleWhenPeelerIsValyrian(){
		int weight = 50;
		int taste = 4;
		boolean hasWorm = false;
		
		//GIVEN
		Apple apple = Mockito.spy(new Apple(Colour.GREEN, weight, taste, hasWorm));
		Peeler peeler = new Peeler(PeelerType.VALYRIAN);
		
		//WHEN
		peeler.peel(apple);
		
		//THEN
		verify(apple, times(1)).peel();
		assertTrue(apple.isPeeled());
	}
	
	@Test
	public void shouldPeelRedAppleWhenPeelerIsValyrian(){
		int weight = 50;
		int taste = 4;
		boolean hasWorm = false;
		
		//GIVEN
		Apple apple = Mockito.spy(new Apple(Colour.RED, weight, taste, hasWorm));
		Peeler peeler = new Peeler(PeelerType.VALYRIAN);
		
		//WHEN
		peeler.peel(apple);
		
		//THEN
		verify(apple, times(1)).peel();
		assertTrue(apple.isPeeled());
	}
}
