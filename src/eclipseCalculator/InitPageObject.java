package eclipseCalculator;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;






public class InitPageObject {	
		
		public static WebElement element = null;
		
		//credentials are stored here
		
		static String email = "Mscrm.test09@ap.jll.com";
		static String password = "Holiday2";
		
			
		//EMAIL 
		public static WebElement eMailField (WebDriver driver) {
			element = driver.findElement(By.id("com.jll.activitiesapp.uat:id/loginField"));
			return element;		
		}
		
		public static void filleMailField (WebDriver driver) {
			element = eMailField(driver);
			element.sendKeys(email);		
		}
		
		//Password
		public static WebElement passwordField (WebDriver driver) {
			element = driver.findElement(By.id("com.jll.activitiesapp.uat:id/passwordField"));
			return element;		
		}
		
		public static void fillpasswordField (WebDriver driver) {
			element = passwordField(driver);
			element.click();
			element.sendKeys(password);		
		}
		
		//LOGIN button
		public static WebElement signInButton_1 (WebDriver driver) {
			element = driver.findElement(By.id("com.jll.activitiesapp.uat:id/loginButton"));
			return element;		
		}
		
		public static void clicksignInButton (WebDriver driver) {
			element = signInButton_1(driver);
			
			element.click();
			
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			
		}
		
		
		
		
		
		//Actions
		public static void  signAsDefinedUser (WebDriver driver) {
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			
			WebElement element = (new WebDriverWait(driver, 10))
					   .until(ExpectedConditions.elementToBeClickable(By.id("com.jll.activitiesapp.uat:id/loginField")));
			
			filleMailField(driver);
			
			System.out.println("Filled in an Email");
			
			
			
			
			fillpasswordField(driver);
			
			System.out.println("Password is filled in");
			
			
			
			clicksignInButton(driver);
			
			System.out.println("Click on  LogIn button");
			
		}

		

		
		

}
