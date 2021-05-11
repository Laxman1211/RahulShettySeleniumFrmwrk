package academy;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import academy_SrcMain.Base;
import pageObjects.LandingPageObjects;

public class HomePage extends Base {
	@Test
	public void basePageNavigation() throws IOException {
		System.out.println(" Test Method ..");
		driver = initialise();
		driver.get("http://www.testyou.in/Login.aspx");

		// 1. Inheritance
		// 2. Creating Object to that class $ call its method

		LandingPageObjects l = new LandingPageObjects(driver);
		l.getLogin();
	}

	@BeforeMethod
	public void testLogin() {
		System.out.println(" Setup..");
	}

	@AfterMethod
	public void term() {
		System.out.println(" Termination..");
	}
}
