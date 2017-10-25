package com.test.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SettingsScreen {
	
	public static WebElement element = null;
	
	public static WebElement AuthbyPin (WebDriver driver) {
		element = driver.findElement(By.id("com.jll.activitiesapp.uat:id/authByPIN"));
		return element;		
	}
	
	public static void clickAuthbyPin (WebDriver driver) {
		element = AuthbyPin(driver);
		element.click();
		System.out.println("Pin is ON");
	}
	
	public static  WebElement BackButton (WebDriver driver) {
		element = driver.findElement(By.id("com.jll.activitiesapp.uat:id/BackButton"));
		return element;
	}
	public static void clickBackButton (WebDriver driver) {
		element = BackButton(driver);
		element.click();
		System.out.println("BackButton is tapped");
	}
	
    
	
	
	
	  

}
