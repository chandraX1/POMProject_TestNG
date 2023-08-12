package pages;

import java.util.Random;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class BasePage {

	public void validateDashboardElement(String ActualText, String expectedText, String errorMsg) {
		Assert.assertEquals(ActualText, expectedText, errorMsg);

	}

	public void selectDropdown(WebElement element, String visibleText) {
		Select sel = new Select(element);
		sel.selectByVisibleText("dropdown value");
	}

	public int randomName(int bound) {
		Random rnd = new Random();
		int randomName = rnd.nextInt(99);
		return randomName;
	}

	public int randomEmail(int bound) {
		Random rnd = new Random();
		int randomEmail = rnd.nextInt(999);
		return randomEmail;
	}

	public int randomPhone(int bound) {
		Random rnd = new Random();
		long randomPh = 2143250000 + rnd.nextInt(9999);
		return (int) randomPh;
	}
}
