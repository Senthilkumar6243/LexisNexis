package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Financial_page {
	
	public  WebDriver driver;
	
	public Financial_page(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}

	
	@FindBy(xpath ="//a[@href=\"/financial-services/financial-crime-compliance\"]" )
	private WebElement FComplaint;
	
	@FindBy(xpath ="//a[@href=\"/financial-services/fraud-and-identity-management\"]" )
	private WebElement Fraud;
	
	@FindBy(xpath ="//a[@href=\"/financial-services/customer-data-management\"]" )
	private WebElement management;
	
	@FindBy(xpath ="//a[@href=\"/financial-services/credit-risk-assessment\"]" )
	private WebElement Assesment;
	
	@FindBy(xpath ="//a[@href=\"/financial-services/collections-and-recovery\"]" )
	private WebElement Collections;
	
	@FindBy(xpath ="//a[@href=\"/financial-services/tracing-and-investigations\"]" )
	private WebElement tracing;

	
	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getFComplaint() {
		return FComplaint;
	}

	public WebElement getFraud() {
		return Fraud;
	}

	public WebElement getManagement() {
		return management;
	}

	public WebElement getAssesment() {
		return Assesment;
	}

	public WebElement getCollections() {
		return Collections;
	}

	public WebElement getTracing() {
		return tracing;
	}
	
	
	
	
	
}
