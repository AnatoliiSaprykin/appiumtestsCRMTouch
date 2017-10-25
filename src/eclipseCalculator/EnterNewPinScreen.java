package eclipseCalculator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EnterNewPinScreen {
	WebDriver driver;
	public static WebElement element = null;
	
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
	
	// Enter new PIN screen
	    
	  /*  WebElement firstPinsquare = driver.findElement(By.id("com.jll.activitiesapp.uat:id/sym1"));
	    isElementPresent(firstPinsquare, 6);
	    firstPinsquare.click();
	    firstPinsquare.sendKeys("1");
	    System.out.println("1 slot is setted");*/
    
    
   /* 
    WebElement SecPinsquare = driver.findElement(By.id("com.jll.activitiesapp.uat:id/sym2"));
    
    SecPinsquare.sendKeys("1");
    System.out.println("2 slot is setted");
    
    WebElement thirdPinsquare = driver.findElement(By.id("com.jll.activitiesapp.uat:id/sym3"));
    
    thirdPinsquare.sendKeys("1");
    System.out.println("3 slot is setted");
    
    WebElement FourPinsquare = driver.findElement(By.id("com.jll.activitiesapp.uat:id/sym4"));
    
    FourPinsquare.sendKeys("1");
    System.out.println("4 slot is setted");
    
    WebElement FivePinsquare = driver.findElement(By.id("com.jll.activitiesapp.uat:id/sym5"));
    
    FivePinsquare.sendKeys("1");
    System.out.println("5 slot is setted");
    
    WebElement SixPinsquare = driver.findElement(By.id("com.jll.activitiesapp.uat:id/sym6"));
    
    SixPinsquare.sendKeys("1");
    System.out.println("6 slot is setted");
    
    WebElement NextButton = driver.findElement(By.id("com.jll.activitiesapp.uat:id/pinActionButton"));
    
    /*WebDriverWait wait = new WebDriverWait(driver, 10); 
    WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id("com.jll.activitiesapp.uat:id/pinActionButton")));
    element.click();  //waiting to be clickable  KEYCODE_1
    
    NextButton.click();
    System.out.println("NextButton is clicked");*/
	

}
