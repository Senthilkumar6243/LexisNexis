package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	public static WebDriver driver; 
	
	public HomePage(WebDriver driver1) {
		this.driver=driver1;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath ="//button[text()='Accept All Cookies']" )
	private WebElement cookies;
	
	@FindBy(xpath ="//img[@class=\"cancel-btn\"]")
	private WebElement cancel;
	
	@FindBy(xpath ="//a[text()='clickable area - fs']" )
	private WebElement financial;
	
	@FindBy(xpath = "(//a[@class=\\\"score-button btn-clickable-area\\\"])[10]")
	private WebElement Insurance;


	@FindBy(xpath ="(//a[@class=\"score-button btn-clickable-area\"])[11]" )
	private WebElement life;
	
	@FindBy(xpath ="(//a[@class=\"score-button btn-clickable-area\"])[12]")
	private WebElement corporation;
	
	@FindBy(xpath ="//a[text()='Choose Your Industry']" )
	private WebElement industry;
	
	@FindBy(xpath ="(//a[@data-industryname=\"Financial Services \"])[2]" )
	private WebElement finance;
	
	public WebElement getCookies() {
		return cookies;
	}

	public WebElement getCancel() {
		return cancel;
	}


	public WebElement getFinancial() {
		return financial;
	}

	public WebElement getInsurance() {
		return Insurance;
	}

	public WebElement getLife() {
		return life;
	}

	public WebElement getCorporation() {
		return corporation;
	}

	public WebElement getIndustry() {
		return industry;
	}

	public WebElement getFinance() {
		return finance;
	}
	
	







}
