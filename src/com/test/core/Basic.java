package com.test.core;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.BeforeClass;
import org.openqa.selenium.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.remote.MobileCapabilityType;

public class Basic {
	private DesiredCapabilities capabilities = new DesiredCapabilities();
	private static AndroidDriver androidDriver = null;
	
	private String appiumPort;
	private String serverIp;
	
	
	@BeforeClass
	public void setup() {
		initDriver();
	}
	public AndroidDriver getDriver() {
		return androidDriver;
	}
	
	private void initDriver() {
		System.out.println("Inside initDriver method");
		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME,  "Android");
		cap.setCapability(MobileCapabilityType.DEVICE_NAME,  "SAMSUNG-SM-G930V");
		cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT,  "4000");
		cap.setCapability(MobileCapabilityType.APPLICATION_NAME,  "com.jll.activitiesapp.uat");
		cap.setCapability("appActivity","md54c08e1a5f828ac733c49de28a1892cff.MainActivity"); 
		
		String serverUrl = "http://" + serverIp + ":" + appiumPort + "/wd/hub";
		
		try 
		{
			System.out.println("Argument to driver obgect : " + serverUrl);
			androidDriver = new AndroidDriver(new URL(serverUrl), capabilities);
		}
		catch (NullPointerException | MalformedURLException ex) {
			throw new RuntimeException("appium driver could not be initialized");
		}
	}

}
