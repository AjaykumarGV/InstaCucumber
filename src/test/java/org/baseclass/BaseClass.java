package org.baseclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;

	public static void launchBrowser() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

	}

	public static void launchUrl(String url) {

		driver.get(url);
	}

	public static void maxWindow() {

		driver.manage().window().maximize();

	}

	public static void totext(WebElement ele, String text) {

		ele.sendKeys(text);
	}

	public static void btnClick(WebElement elem) {

		elem.click();

	}

	@SuppressWarnings("deprecation")
	public static void waitWindow() {

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

	}

	public static void quitWindow() {

		driver.quit();

	}

}
