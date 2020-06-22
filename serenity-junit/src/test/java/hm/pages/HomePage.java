package hm.pages;

import net.thucydides.core.annotations.Step;

public class HomePage {
	OrangeHRMHomePage home;
	@Step("This step will verify the title")
	public void verifyTitle() {
		home.verifyTitle();
	}
	@Step("This step will allow us to login to application")
	public void enterCredentials() {
		home.enterUsernamePassword();
	}
	@Step("This step will verify the dashboard")
	public void verifyDashboard() {
		home.verifyLogin();
	}

}
