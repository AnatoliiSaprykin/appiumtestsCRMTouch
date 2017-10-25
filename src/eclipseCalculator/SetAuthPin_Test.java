package eclipseCalculator;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.android.AndroidDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.internal.TouchAction;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.test.pages.AuthpopUp;
import com.test.pages.SettingsScreen;

import io.appium.java_client.android.AndroidKeyCode;





public class SetAuthPin_Test {
	WebDriver driver;

	@BeforeClass
	public void setUp() throws MalformedURLException{
		//Set up desired capabilities and pass the Android app-activity and app-package to Appium
		DesiredCapabilities capabilities = new DesiredCapabilities();
		
		//capabilities.setCapability("BROWSER_NAME", "Android");
		capabilities.setCapability("VERSION", "6.0.1"); 
		capabilities.setCapability("deviceName","SAMSUNG-SM-G930V");
		capabilities.setCapability("platformName","Android");
		capabilities.setCapability("orientation", "PORTRAIT");
		//---------capabilities.setCapability("newCommandTimeout","2"); //is waiting for new command from client
		//----------capabilities.setCapability("deviceReadyTimeout","10");
		capabilities.setCapability("clearSystemFiles","");
		capabilities.setCapability("unicodeKeyboard", "True");
		capabilities.setCapability("resetKeyboard", "True");
	   
	    capabilities.setCapability("appPackage", "com.jll.activitiesapp.uat");// This package name of your app (you can get it from apk info app)
	   
		capabilities.setCapability("appActivity","md54c08e1a5f828ac733c49de28a1892cff.MainActivity"); // This is Launcher activity of your app (you can get it from apk info app)
		/*capabilities.setCapability("appActivity","md5bad5050120f94b6bc7af1de27fa7c.BaseActivity"); //base activity
		capabilities.setCapability("appActivity","md5bad5050120f94b6bc7af1de27fa7c.SearchActivity"); //search
		capabilities.setCapability("appActivity","md56a07a752167f263c7bf4d5fded5dc97c.RelatedSearchActivity");
		capabilities.setCapability("appActivity","md5bad5050120f94b6bc7af1de27fa7c.AddActivityActivity");
		capabilities.setCapability("appActivity","md56a07a752167f263c7bf4d5fded5dc97c.SettingsActivity");
		capabilities.setCapability("appActivity","md56a07a752167f263c7bf4d5fded5dc97c.RegardingSearchActivity");*/
		
	//Create RemoteWebDriver instance and connect to the Appium server
	 //It will launch the Calculator App in Android Device using the configurations specified in Desired Capabilities
		
	   driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		
		
	   
	   driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	   System.out.println("Launched successfully");
	   
	}
	   
	   //------------------------------------------------ WAITING IMPLEMENTATION --------------------------------
	   public boolean isElementPresent(WebElement elementName, int timeout){
	        //long time = duration.getTime();
	        //TimeUnit unit = duration.getTimeUnit(); 
	 	try{
	                // duration.setTime(100, TimeUnit.MILLISECONDS);
	 	        WebDriverWait wait = new WebDriverWait(driver, timeout);
	 	        wait.until(ExpectedConditions.visibilityOf(elementName));
	 	        return true;
	 	}catch(Exception e){
	 	    return false;
	 	}
	        finally {
	              //duration.setTime(time, unit);
	       }
	}
	   
	   

	@Test
	public void testCal() throws Exception {
							
		InitPageObject.signAsDefinedUser(driver); // Enter credentials
		
		
	    driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
	    
	 // Get the text from alert dialog. just for test purposes!
		  WebElement result = driver.findElement(By.id("android:id/message"));
		  String popuptext = result.getText();
		  System.out.println("Alert text Is -> " + popuptext);
	    
		  
	     
		AuthpopUp.clickYesButton(driver);   //taping Yes  on Auth pop up 
	    
	    SettingsScreen.clickAuthbyPin(driver);  //Pin ON
	   	        
	    
	 // Enter new PIN screen
	    
	    WebElement firstPinsquare = driver.findElement(By.id("com.jll.activitiesapp.uat:id/sym1"));
	    isElementPresent(firstPinsquare, 6);
	    firstPinsquare.click();
	    System.out.println("1 slot is clicked");
	    
	    
	    
	    
        
        for(int i=1; i<=6; i++){
        	final Process exec = Runtime.getRuntime().exec("adb shell input keyevent 8");   //adb shell input keyevent 8 // inputs 1

            final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(exec.getInputStream()));

            String s;
            while((s = bufferedReader.readLine()) != null) {
                System.out.println(s);
            }
       } 
	    
	  
         //driver.switchTo().activeElement().sendKeys("1");

	    //com.jll.activitiesapp.uat:id/pinDialogContent
	    //(new TouchAction(driver)).tap(235, 1698).perform()
	    
	    
	    
	    WebElement NextButton = driver.findElement(By.id("com.jll.activitiesapp.uat:id/pinActionButton"));
	    isElementPresent(NextButton, 150);
	    
	    WebDriverWait wait = new WebDriverWait(driver, 15); 
	    WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id("com.jll.activitiesapp.uat:id/pinActionButton")));
	    
	    element.click();
	    
	    
	    System.out.println("NextButton.click");
	    
	   	    
	    driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
	    
	    //confirm PIN
	    
	    for(int i=1; i<=6; i++){
        	final Process exec = Runtime.getRuntime().exec("adb shell input keyevent 8");   //adb shell input keyevent 8 // inputs 1

            final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(exec.getInputStream()));

            String s;
            while((s = bufferedReader.readLine()) != null) {
                System.out.println(s);
            }
	    }
	    
	    WebElement SaveButton = driver.findElement(By.id("com.jll.activitiesapp.uat:id/pinActionButton"));
	    isElementPresent(SaveButton, 15);
	    	    
	    WebElement element1 = wait.until(ExpectedConditions.elementToBeClickable(By.id("com.jll.activitiesapp.uat:id/pinActionButton")));
	    
	    element1.click();   
	    
	    System.out.println("Save.click");
	    
	    
	    //Screen returned to Settings
	    
	    //Tap Back button
	    
	    SettingsScreen.clickBackButton(driver);
	    
	    
	   
	  
	}

	@AfterClass
	public void teardown(){
		//close the app
		driver.quit();
	}

}
