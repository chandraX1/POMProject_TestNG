package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pages.AddCustomerPage;
import pages.DashboardPage;
import pages.LoginPage;
import util.BrowserFactory;

public class AddCustomerTest {
	WebDriver driver;

	String userName = "demo@techfios.com";
	String password = "abc123";
	String expectedText = "Dashboard";
	String FullName = "Chandra's Saving";
	String Company = "Bank Of America";
	String Email = "demo@techfios.com";
	String Phone;
	String AddContact = "Add Contact";
	String Adress = "303 West Pioneer";
	String City = "Grand Prairie";
	String State = "Texas";
	String Zipe_Code = "75051";
	String Country = "Bangladesh";

	@Test
	public void UserShouldBeAbleToAddCustomer() throws InterruptedException {
		driver = BrowserFactory.init();
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		loginPage.insertUserName(userName);
		loginPage.insertPassword(password);
		loginPage.clickSignin();

		DashboardPage dashboardPage = PageFactory.initElements(driver, DashboardPage.class);
		dashboardPage.validateDashboardPage(expectedText);
		Thread.sleep(5000);
		dashboardPage.clickCustomerMenu();
		dashboardPage.clickAddCustomerMenu();

		AddCustomerPage addCustomerPage = PageFactory.initElements(driver, AddCustomerPage.class);
		addCustomerPage.validateAddCustomerPage(AddContact);

		addCustomerPage.insertFullName(FullName);
		addCustomerPage.selectCompanyName(Company);
		addCustomerPage.insertEmail(Email);
		addCustomerPage.insertPhone();
		addCustomerPage.insertAddress(Adress);
		addCustomerPage.insertCity(City);
		addCustomerPage.insertState(State);
		addCustomerPage.insertZipeCode(Zipe_Code);
		addCustomerPage.insertCountry(Country);
		addCustomerPage.submitButton();
		
//		BrowserFactory.tearDown();
	}

}
