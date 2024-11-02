package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OfferPage {
	
	public WebDriver driver;
	
	public OfferPage(WebDriver driver) {
	this.driver	=driver;
	}
private	By search = By.cssSelector("input[type='search']");
private	By productName = By.cssSelector("tr td:nth-child(1)");
	
	public void enterSearchItem(String name) {
		 driver.findElement(search).sendKeys(name);
			
		}
	//sh.driver.findElement(By.cssSelector("[type='search']")).sendKeys(shortname);
	
	public String getProductName() {
		
		return driver.findElement(productName).getText();
		}
//sh.driver.findElement(By.cssSelector("[type='search']")).sendKeys(shortname);
}
