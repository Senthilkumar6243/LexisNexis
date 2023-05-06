package com.runnerr;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.baseclass.Base_class;

public class Runner_Classs extends Base_class {
	
	public static void main(String[] args) throws Throwable {
		browserLaunch("Chrome");
		
		getUrl("https://risk.lexisnexis.co.uk/");
		
		
		Thread.sleep(3000);
		WebElement cookies = driver.findElement(By.xpath("//button[text()='Accept All Cookies']"));
		isDisplayed(cookies);
		isEnabled(cookies);
		getText(cookies);
		Thread.sleep(3000);
		clickOnElement(cookies);
		Thread.sleep(3000);
		
		WebElement cancel = driver.findElement(By.xpath("//img[@class=\"cancel-btn\"]"));
		clickOnElement(cancel);
		
		WebElement Heading = driver.findElement(By.xpath("//div[@class=\"score-document-header\"]"));
		isEnabled(Heading);
		Assert.assertTrue(isDisplayed(Heading));
		isDisplayed(Heading);
		Assert.assertTrue(isEnabled(Heading));
		getText(Heading);
		scrollIntoView(Heading);
		
		WebElement finacial = driver.findElement(By.xpath("//a[text()='clickable area - fs']"));
		isEnabled(finacial);
		Assert.assertTrue(isEnabled(finacial));
		isDisplayed(finacial);
		Assert.assertTrue(isDisplayed(finacial));
		getText(finacial);
		scrollIntoView(finacial);
		
		WebElement Insurance = driver.findElement(By.xpath("(//a[@class=\"score-button btn-clickable-area\"])[10]"));
		isDisplayed(Insurance);
		isDisplayed(Insurance);
		getText(Insurance);
		scrollIntoView(Insurance);
		
		
		WebElement life = driver.findElement(By.xpath("(//a[@class=\"score-button btn-clickable-area\"])[11]"));
		isDisplayed(life);
		Assert.assertTrue(isDisplayed(life));
		isEnabled(life);
		Assert.assertTrue(isEnabled(life));
		getText(life);
		scrollIntoView(life);
		
		WebElement corporation = driver.findElement(By.xpath("(//a[@class=\"score-button btn-clickable-area\"])[12]"));
		isDisplayed(corporation);
		Assert.assertTrue(isDisplayed(corporation));
		isEnabled(corporation);
		Assert.assertTrue(isEnabled(corporation));
		getText(corporation);
		scrollIntoView(corporation);
		
		
		WebElement industry = driver.findElement(By.xpath("//a[text()='Choose Your Industry']"));
		isDisplayed(industry);
		isEnabled(industry);
		getText(industry);
		scrollIntoView(industry);
		clickOnElement(industry);
		
		WebElement finance = driver.findElement(By.xpath("(//a[@data-industryname=\"Financial Services \"])[2]"));
		isDisplayed(finance);
		isEnabled(finance);
		getText(finance);
		scrollIntoView(finance);
		clickOnElement(finance);   
		
		WebElement FComplaint = driver.findElement(By.xpath("//a[@href=\"/financial-services/financial-crime-compliance\"]"));
		isDisplayed(FComplaint);
		isEnabled(FComplaint);
		getText(FComplaint);
		scrollIntoView(FComplaint);
		
		WebElement Fraud = driver.findElement(By.xpath("//a[@href=\"/financial-services/fraud-and-identity-management\"]"));
		isDisplayed(Fraud);
		isEnabled(Fraud);
		getText(Fraud);
		scrollIntoView(Fraud);
		
		WebElement management = driver.findElement(By.xpath("//a[@href=\"/financial-services/customer-data-management\"]"));
		isDisplayed(management);
		isEnabled(management);
		getText(management);
		scrollIntoView(management);
		
		WebElement Assesment = driver.findElement(By.xpath("//a[@href=\"/financial-services/credit-risk-assessment\"]"));
		isDisplayed(Assesment);
		isEnabled(Assesment);
		getText(Assesment);
		scrollIntoView(Assesment);
		
		WebElement Collections = driver.findElement(By.xpath("//a[@href=\"/financial-services/collections-and-recovery\"]"));
		isDisplayed(Collections);
		isEnabled(Collections);
		getText(Collections);
		scrollIntoView(Collections);
		
		WebElement tracing = driver.findElement(By.xpath("//a[@href=\"/financial-services/tracing-and-investigations\"]"));
		isDisplayed(tracing);
		isEnabled(tracing);
		getText(tracing);
		scrollIntoView(tracing);



		
		
		
	}

}
