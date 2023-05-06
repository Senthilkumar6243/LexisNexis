package com.baseclass;

import java.io.File;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base_class {

	public static WebDriver driver;
	public static WebDriver browserLaunch(String type) {
		if(type.equalsIgnoreCase("chrome")){
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		
		}
		else if (type.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			 driver = new FirefoxDriver();
			 driver.manage().window().maximize();
			
		}
		return driver;
		
	}
	public static void selectValuesfromDD(WebElement element, String options, String value) {
		try {
		
			Select sc = new Select(element);
			if (options.equalsIgnoreCase("value")) {
				sc.selectByValue(value);
			} else if (options.equalsIgnoreCase("visibletext")) {
				sc.selectByVisibleText(value);
			} else if (options.equalsIgnoreCase("index")) {
				sc.selectByIndex(Integer.parseInt(value));
			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
			throw new RuntimeException();

		}
	}
	
	public static WebDriver getUrl(String url) {

		driver.get(url);
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
         return driver;	
	}
	
	public static void sleep(int i) throws Throwable {
		Thread.sleep(i);

	}
	public static void inputValueElement(WebElement element , String value) {
		element.sendKeys(value);

	}
	public static void clickOnElement(WebElement element) {
		explicityWait(element);
		element.click();
	}
	public static void clear(WebElement element) {
		element.clear();
		
	}
	public static void javaScript() {
		JavascriptExecutor j = (JavascriptExecutor)driver;
		

	}
	public static boolean isEnabled(WebElement element) {
		boolean enabled = element.isEnabled();
		System.out.println(enabled);
		return enabled;
	}
	public static void navigate(String url) {
		
		driver.navigate().to(url);
	}
	public static Boolean isDisplayed(WebElement element) {
		boolean displayed = element.isDisplayed();
		System.out.println(displayed);
		return displayed;
	}
	public static void navigateBack() {
		driver.navigate().back();

	}
	public static void navigateForward() {
		driver.navigate().forward();
		
	}
	public static void navigateRefresh() {
		driver.navigate().refresh();
	}
	public static void getTitle() {
		String title = driver.getTitle();
		System.out.println(title);
		
	}
	public static void getCurrentUrl() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);

	}
	public static void getText(WebElement element) {
		String text = element.getText();
		System.out.println(text);

	}
	public static void getAttribute(WebElement element , String value) {
		String attribute = element.getAttribute(value);
		System.out.println(attribute);

	}
	public static void takesScreenshot() throws Throwable {
		TakesScreenshot ts = (TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\senth\\eclipse-workspace\\Maven\\Screenshot.png");
		FileUtils.copyFile(source, dest);

	}
	public static void isMultiple(WebElement element) {
		Select s = new Select(element);
		boolean multiple = s.isMultiple();
		System.out.println(multiple);

	}
	public static void radioButton(WebElement element) {
		element.click();
		
	}
	public static void getPageSource() {
		driver.getPageSource();

	}
	public static void scrollIntoView(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", element);

	}
	public static void quitBrowser() {
		driver.quit();
		
	}
	public static WebDriver explicityWait(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(element));
		return driver;
	}

}
