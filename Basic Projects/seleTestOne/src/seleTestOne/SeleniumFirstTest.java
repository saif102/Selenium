package seleTestOne;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class SeleniumFirstTest {
WebDriver driver;

public void launchBrowser() {
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\tosai\\Documents\\eclipse\\Selenium\\Driver\\geckodriver.exe");
	driver = new FirefoxDriver();
	driver.get("https://www.amazon.com/");
}
	public static void main(String[] args) {
		SeleniumFirstTest obj = new SeleniumFirstTest();
		obj.launchBrowser();
	}

}
