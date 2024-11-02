package utility;

import java.util.Set;

import org.openqa.selenium.WebDriver;

public class GenericUtility {
	
	public WebDriver driver;  //driver is public
	
	public GenericUtility(WebDriver driver) {  //driver is local
		this.driver =driver;     //initialise the driver
		
	}
	public void switchWindowToChild() {
		
		 Set<String> s1= driver.getWindowHandles();
		   
		   java.util.Iterator<String> v = s1.iterator();
		 String parentWindowId=  v.next();
		 String childWindowId=  v.next();
			driver.switchTo().window(childWindowId);
	}

}
