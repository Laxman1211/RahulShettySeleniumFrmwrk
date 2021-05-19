package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObjs {
	public WebDriver driver;
	
	By uname = By.id("");
	By passwd = By.id("");
	
	public LoginPageObjs(WebDriver driver) {
		this.driver=driver;
	}
	
	public WebElement getUname()
	{
		System.out.println("ads");
		return driver.findElement(uname);
	}
	
	public WebElement getPassword()
	{
		System.out.println("ads");
		return driver.findElement(passwd);
	}
	
}
