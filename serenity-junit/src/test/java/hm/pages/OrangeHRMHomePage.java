package hm.pages;

import org.junit.Assert;
import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;

public class OrangeHRMHomePage extends PageObject{
	public void verifyTitle() {
		String title=getDriver().getTitle();
		Assert.assertTrue(title.contains("OrangeHRM"));
		
	}
	public void enterUsernamePassword() {
		$(By.id("txtUsername")).type("Admin");
		$(By.id("txtPassword")).typeAndEnter("admin123");
		
	}
	public void verifyLogin() {
		String current_url=getDriver().getCurrentUrl();
		Assert.assertTrue(current_url.contains("dashboard"));
	}
	
}
