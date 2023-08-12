package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pages.DashboardPage;
import pages.LoginPage;
import util.BrowserFactory;

public class LoginTest {
	WebDriver driver;

	String userName = "demo@techfios.com";
	String password = "abc123";
	String expectedText = "Dashboard";

	@Test
	public void validUserShouldBeAbleToLogin() {
		driver = BrowserFactory.init();
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		loginPage.insertUserName(userName);
		loginPage.insertPassword(password);
		loginPage.clickSignin();
//		DashboardPage dashboardPage = PageFactory.initElements(driver, DashboardPage.class);
//		dashboardPage.validateDashboardPage(expectedText);
//		BrowserFactory.tearDown();
	}

}
