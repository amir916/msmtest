package com.msmtest.apple;

import static org.junit.Assert.*;

import org.junit.Test;

public class AppleTest {

	@Test
	public void canCreateApple(){
		Apple apple = new Apple();
		
		assertNotNull(apple);
	}
}
