package com.incubyte.assessment;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LeapYearTest {

	@Test
	void checkDivisibleByFour() {
		LeapYear leapYear = new LeapYear();
		int year = 2017;
		assertEquals(leapYear.isLeapYear(year), false);
	}
	
	@Test
	void checkDivisibleByFourButNotByHunderd() {
		LeapYear leapYear = new LeapYear();
		int year = 2016;
		assertEquals(leapYear.isLeapYear(year), true);
	}
	
	@Test
	void checkDivisibleByFourAndByHunderdButNotFourHundred() {
		LeapYear leapYear = new LeapYear();
		int year = 3000;
		assertEquals(leapYear.isLeapYear(year), false);
	}
	
	@Test
	void checkDivisibleByFourHundred() {
		LeapYear leapYear = new LeapYear();
		int year = 2000;
		assertEquals(leapYear.isLeapYear(year), true);
	}

}
