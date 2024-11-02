package utility;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import pageObjects.PageObjectManager;

public class Shared {
	public WebDriver driver;
	public String landingPageProductName;
	public PageObjectManager  pageObjectManager;
	public TestBase testBase;
	public GenericUtility genericUtility;
	
	public Shared() throws IOException  {
		testBase = new TestBase(driver);
		pageObjectManager = new PageObjectManager(testBase.driverManager());//create the object to give it life
		genericUtility = new GenericUtility(testBase.driverManager());  //create the object to activate it or gv it life
	}
	//our architecture has 2 managers  1.driverManager  gives you the driver
	//2 pageObjectManager takes driver from driverManager to all page object files(landingpage etc)
	
	//we are relying on shared class to avoid creating object in step definition and inject sh into step definition
	//driver created in Shared class is sent to pageObjectManager  same driver sent to genericUtility  NOW TO HOOKS
	//Shared class lke heart of the framework pump blood to every part of body   driver is the blood
}
