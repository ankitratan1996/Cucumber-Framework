package com.flamingo.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import com.flamingo.enums.PropertyfileController;

import io.github.bonigarcia.wdm.WebDriverManager;
import utils.PropertyFileHandler;

public final class DriverClass {

	private static WebDriver driver;

	public static final void initDriver() {
		String browser = PropertyFileHandler.getPropertyValue(PropertyfileController.BROWSER.toString());
		if (browser.equalsIgnoreCase("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else if (browser.equalsIgnoreCase("Edge")) {

		}
		DriverManager.setDriver(driver);

	}

	public final static void tearDownDriver() {
		DriverManager.unload();
		driver.quit();
	}

}
