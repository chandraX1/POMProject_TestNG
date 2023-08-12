package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AddCustomerPage extends BasePage {
	WebDriver driver;

	public AddCustomerPage(WebDriver driver) {
		this.driver = driver;

	}

	@FindBy(how = How.XPATH, using = "//h5[normalize-space()='Add Contact']")
	WebElement ADD_CONTACT;
	@FindBy(how = How.XPATH, using = "//input[@id='account']")
	WebElement FULL_NAME;
	@FindBy(how = How.XPATH, using = "//select[@id='cid']")
	WebElement COMPANY;
	@FindBy(how = How.XPATH, using = "//input[@id='email']")
	WebElement EMAIL;
	@FindBy(how = How.XPATH, using = "//input[@id='phone']")
	WebElement PHONE;
	@FindBy(how = How.XPATH, using = "//input[@id='address']")
	WebElement ADDRESS;
	@FindBy(how = How.XPATH, using = "//input[@id='city']")
	WebElement CITY;
	@FindBy(how = How.XPATH, using = "//input[@id='state']")
	WebElement STATE;
	@FindBy(how = How.XPATH, using = "//input[@id='zip']")
	WebElement ZIPE_CODE;
	@FindBy(how = How.XPATH, using = "//*[@id=\"country\"]")
	WebElement COUNTRY;
	@FindBy(how = How.XPATH, using = "//button[@id='submit']")
	WebElement SUBMIT_BUTTON;

	public void validateAddCustomerPage(String expectedText) {
		validateDashboardElement(ADD_CONTACT.getText(), "Add Contact", "Landed on wrong page");
	}

	public void insertFullName(String FullName) {
		FULL_NAME.sendKeys(FullName + randomName(9));
	}

	public void selectCompanyName(String Company) {
		COMPANY.sendKeys(Company);
	}

	public void insertEmail(String Email) {
		EMAIL.sendKeys(randomEmail(99) + Email);
	}

	public void insertPhone() {
		PHONE.sendKeys("" + randomPhone(9999));
	}

	public void insertAddress(String Adress) {
		ADDRESS.sendKeys(Adress);
	}

	public void insertCity(String City) {
		CITY.sendKeys(City);
	}

	public void insertState(String State) {
		STATE.sendKeys(State);
	}

	public void insertZipeCode(String Zipe_Code) {
		ZIPE_CODE.sendKeys(Zipe_Code);
	}

	public void insertCountry(String Country) {
		selectDropdown(COUNTRY, "Bangladesh");
		}
	public void submitButton() {
		Actions action = new Actions(driver);
		action.sendKeys(Keys.ENTER).build().perform();
//		SUBMIT_BUTTON.click();

	}

}
