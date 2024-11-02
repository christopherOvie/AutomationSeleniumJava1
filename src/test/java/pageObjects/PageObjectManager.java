package pageObjects;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
	//driver is sent here    TestBase   >>>   shared---PageObjectManager>>>>>>>>>>>>pageobject(landingpage etc)
	//  PageObjectManager  takes the driver from driverManager  and pass to all pages
	//PageObjectManager  initialise  in shared class
	
	// PageObjectManager creates the object and assign the driver or send driver to page object
	//driver initiaise in shared class
public LandingPage landingPage;
public OfferPage offerPage;
public WebDriver driver;


public PageObjectManager(WebDriver driver) {
	this.driver=driver;
}
	public LandingPage getLandingPage() {
		landingPage	= new LandingPage(driver);
		return landingPage;
	}
	
	public OfferPage getOfferPage() {
		offerPage = new OfferPage(driver);
		return offerPage;
	}
}
