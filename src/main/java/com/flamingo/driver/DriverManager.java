package com.flamingo.driver;

import org.openqa.selenium.WebDriver;

public class DriverManager {

	private DriverManager() {
	}

	private static ThreadLocal<WebDriver> threadlocal = new ThreadLocal<>();

	public static WebDriver getDriver() {
		return threadlocal.get();
	}

	public static void setDriver(WebDriver driver) {
		threadlocal.set(driver);
	}

	public static void unload() {
		threadlocal.remove();
	}

}
