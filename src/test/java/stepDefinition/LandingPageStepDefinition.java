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
import utility.Shared;

public class LandingPageStepDefinition {

	public WebDriver driver;
	public String landingPageProductName;
//	public  String offerPageProductName;
	Shared sh;
	
	
	public LandingPageStepDefinition(Shared sh) {
		this.sh=sh;
	}
@Given("User is on GreenCart Homepage")
public void user_is_on_green_cart_homepage() {
//	sh.driver= new ChromeDriver();  //driver gets the life
//  sh.driver.navigate().to("https://rahulshettyacademy.com/seleniumPractise/#/");;
//  sh.driver.manage().window().maximize();
}

@When("User search for product with shortname {string} and extracted actual name of product")
public void user_search_for_product_with_shortname_and_extracted_actual_name_of_product(String shortName) throws InterruptedException {
	LandingPage landingPage = sh.pageObjectManager.getLandingPage(); // LandingPage(sh.driver);
	landingPage.enterSearchItem(shortName);
 // sh.driver.findElement(By.xpath("//input[@type='search']")).sendKeys(shortName);
  Thread.sleep(2000);
  //sh.landingPageProductName= sh.driver.findElement(By.cssSelector("h4.product-name")).getText().split("-")[0].trim();
  sh.landingPageProductName  =  landingPage.getProductName().split("-")[0].trim();
 System.out.println( sh.landingPageProductName +" is extracted from homepage");
}


/*@When("^User search for product with shortname {.+) and extracted actual name of product$")
public void user_search_for_product_with_shortname_and_extracted_actual_name(String shortName) throws InterruptedException {
	LandingPage landingPage = sh.pageObjectManager.getLandingPage(); // LandingPage(sh.driver);
	landingPage.enterSearchItem(shortName);
 // sh.driver.findElement(By.xpath("//input[@type='search']")).sendKeys(shortName);
  Thread.sleep(2000);
  //sh.landingPageProductName= sh.driver.findElement(By.cssSelector("h4.product-name")).getText().split("-")[0].trim();
  sh.landingPageProductName  =  landingPage.getProductName().split("-")[0].trim();
 System.out.println( sh.landingPageProductName +" is extracted from homepage");
}*/


}
