package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPageObjects {
	public WebDriver driver;

	By signin = By.cssSelector("//span[text()='Login']");

	public LandingPageObjects(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getLogin() {
		return driver.findElement(signin);
	}

}