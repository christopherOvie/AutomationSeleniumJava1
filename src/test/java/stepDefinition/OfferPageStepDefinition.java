package stepDefinition;

import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LandingPage;
import pageObjects.OfferPage;
import pageObjects.PageObjectManager;
import utility.Shared;

public class OfferPageStepDefinition {

	//public WebDriver driver;
	//public String landingPageProductName;
	public  String offerPageProductName;
	PageObjectManager pageObjectManager;
	Shared sh;
	
	public OfferPageStepDefinition(Shared sh) {
		this.sh=sh;
	}
	//single responsibility pattern srp
	//loosely coupled
	//factory designed pattern     responsible for creatoing all the object.only one soingle object responsible for creating obj
	@Then("User searched for same shortname {string} in offers page")
	public void user_searched_for_same_shortname_in_offers_page(String shortname) throws InterruptedException {
		switchToOfferPage();
		//OfferPage offerPage = new OfferPage(sh.driver);
		OfferPage offerPage = sh.pageObjectManager.getOfferPage();
		Thread.sleep(2000);
		offerPage.enterSearchItem(shortname);
		//sh.driver.findElement(By.cssSelector("[type='search']")).sendKeys(shortname);
		
		// offerPageProductName = sh.driver.findElement(By.cssSelector("tr td:nth-child(1)")).getText();
		 offerPageProductName =	 offerPage.getProductName();
	}
	
	
	
	/*@Then("^User searched for same shortname {string} in offers page$")
	public void user_searched_for_same_shortname_in_offers_page(String shortname) throws InterruptedException {
		switchToOfferPage();
		//OfferPage offerPage = new OfferPage(sh.driver);
		OfferPage offerPage = sh.pageObjectManager.getOfferPage();
		Thread.sleep(2000);
		offerPage.enterSearchItem(shortname);
		//sh.driver.findElement(By.cssSelector("[type='search']")).sendKeys(shortname);
		
		// offerPageProductName = sh.driver.findElement(By.cssSelector("tr td:nth-child(1)")).getText();
		 offerPageProductName =	 offerPage.getProductName();
	}*/

public void switchToOfferPage() {
	// sh.driver.findElement(By.linkText("Top Deals")).click();
	
	//pageObjectManager= new PageObjectManager(sh.driver);
	LandingPage landingPage=	sh.pageObjectManager.getLandingPage();
//	LandingPage landingPage = new LandingPage(driver);
	landingPage.selectTopDealsPage();
	sh.genericUtility.switchWindowToChild();
	//can create generic util for explicit wait,parse the string
	  ;
		

	
	
	
	/*if (sh.driver.getTitle().equals("GreenKart - veg and fruits kart")) {
	    // Execute this block only if the title is NOT "GreenKart - veg and fruits kart"
	    sh.driver.findElement(By.linkText("Top Deals")).click();
	    
	    // Handle window switching
	    Set<String> windowHandles = sh.driver.getWindowHandles();
	    java.util.Iterator<String> iterator = windowHandles.iterator();
	    String parentWindowId = iterator.next();
	    String childWindowId = iterator.next();
	    
	    // Switch to the child window
	    sh.driver.switchTo().window(childWindowId);	
	}*/
	
}
/*@Then("User searched for same shortname in offers page")
public void user_searched_for_same_shortname_in_offers_page() throws InterruptedException {
    sh.driver.findElement(By.linkText("Top Deals")).click();
   Set<String> s1= sh.driver.getWindowHandles();
   
   java.util.Iterator<String> v = s1.iterator();
 String parentWindowId=  v.next();
 String childWindowId=  v.next();
	sh.driver.switchTo().window(childWindowId);
	sh.driver.findElement(By.cssSelector("[type='search']")).sendKeys("Tom");
	Thread.sleep(2000);
	 offerPageProductName = sh.driver.findElement(By.cssSelector("tr td:nth-child(1")).getText();
}*/


@Then("user validate product name matches with landing page")
public void user_validate_product_name_matches_with_landing_page() {
 Assert.assertEquals(offerPageProductName, sh.landingPageProductName); 
}



}
