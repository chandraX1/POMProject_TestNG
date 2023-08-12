package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import util.BrowserFactory;

public class DashboardPage extends BasePage {
	WebDriver driver;

	public DashboardPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//h2[normalize-space()='Dashboard']")
	WebElement DASHBOARD_HEADER;

	public void validateDashboardPage(String expectedText) {
		validateDashboardElement(DASHBOARD_HEADER.getText(), expectedText, "Dashboard page not found!!");
		BrowserFactory.tearDown();
	}

	@FindBy(how = How.XPATH, using = "//span[normalize-space()='Customers']")
	WebElement CUSTOMER_MENU;
	@FindBy(how = How.XPATH, using = "//ul[@class='nav nav-second-level collapse in']//a[normalize-space()='Add Customer']")
	WebElement ADD_CUSTOMER_MENU;

	public void clickCustomerMenu() {
		CUSTOMER_MENU.click();

	}

	public void clickAddCustomerMenu() {
		ADD_CUSTOMER_MENU.click();

	}

}
