package academy_SrcMain;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Base {

	public WebDriver driver;

	public WebDriver initialise() throws IOException {
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\u93234\\eclipse-workspace\\mavenPrj\\src\\main\\java\\resources\\testData.properties");

		prop.load(fis);
		String browserName = prop.getProperty("browser");
		System.out.println("Browser using is.." + browserName);

		if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\chromedriver_89.exe");
			driver = new ChromeDriver();

		} else if (browserName.equals("firefox")) {
			driver = new FirefoxDriver();
		} else if (browserName.equals("IE")) {
			driver = new InternetExplorerDriver();

		}
		return driver;
	}
}
