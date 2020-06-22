package testcases;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import hm.pages.HomePage;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

@RunWith(SerenityRunner.class)
public class LogginAplicationWithPO {
	@Managed
	WebDriver driver;
	@Steps
	HomePage home;
	@Test
	public void loginAsAdmin() {
		driver.get("https://opensource-demo.orangehrmlive.com/");
		home.verifyTitle();
		home.enterCredentials();
		home.verifyDashboard();
	}

}
