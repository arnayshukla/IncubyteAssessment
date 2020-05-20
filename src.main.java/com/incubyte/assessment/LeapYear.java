package com.incubyte.assessment;

public class LeapYear {
	
	public LeapYear() {
	}
	
	public boolean isLeapYear(int year) {
		if (year %4 != 0) {
			return false;
		} else {
			return true;
		}
	}

}
