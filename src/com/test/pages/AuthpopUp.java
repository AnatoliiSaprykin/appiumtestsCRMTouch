package com.test.pages;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

public class AuthpopUp {
	
public static WebElement element = null;
	
	//Yes Button 
	public static WebElement yesButton (WebDriver driver) {
		element = driver.findElement(By.id("android:id/button1"));
		return element;		
	}
	
	public static void clickYesButton (WebDriver driver) {
		element = yesButton(driver);
		element.click();
		System.out.println("Yes is clicked");
	}
	
	
	
	//-------------------------------------
	// Get the text from alert dialog. just for test purposes!
	 /* 
  
  
  WebElement AuthbyPin = driver.findElement(By.id("com.jll.activitiesapp.uat:id/authByPIN"));  //Pin ON
  isElementPresent(AuthbyPin, 6);
  AuthbyPin.click();
  System.out.println("Pin is ON");*/
	
	
	//--------------------------------------
	
	
	
	//Actions
	
			

}
