package stepDefinition;

import java.io.IOException;

import io.cucumber.java.After;
import utility.Shared;

public class Hooks {
	
	Shared sh;
	public Hooks(Shared sh) {
		this.sh=sh;
	}
	@After
	public void AfterScenario() throws IOException {
		//sh.driver.quit();
		sh.testBase.driverManager().quit();
	}

}
