package com.test.core;

import org.openqa.selenium.android.AndroidDriver;

public class Driver extends Basic {
	
	protected AndroidDriver driver;
	
	public Driver() {
		this.driver = super.getDriver();
	}

}
