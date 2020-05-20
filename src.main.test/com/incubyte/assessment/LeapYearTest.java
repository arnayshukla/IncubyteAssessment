package com.incubyte.assessment;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LeapYearTest {

	@Test
	void isYearDivisibleByFour() {
		LeapYear leapYear = new LeapYear();
		int year = 2017;
		assertEquals(leapYear.isLeapYear(year), false);
	}

}
