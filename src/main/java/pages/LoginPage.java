package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;

	}

	@FindBy(how = How.XPATH, using = "//input[@id='username']")
	WebElement USER_NAME;
	@FindBy(how = How.XPATH, using = "//input[@id='password']")
	WebElement PASSWORD;
	@FindBy(how = How.XPATH, using = "//button[@name='login']")
	WebElement SIGNIN;

	public void insertUserName(String userName) {
		USER_NAME.sendKeys(userName);
	}

	public void insertPassword(String password) {
		PASSWORD.sendKeys(password);
	}

	public void clickSignin() {
		SIGNIN.click();
	}

}
