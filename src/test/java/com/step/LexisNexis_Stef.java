package com.step;

import org.openqa.selenium.WebElement;
import com.baseclass.Base_class;
import com.sdp.Page_Manager;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LexisNexis_Stef extends Base_class{
	
	public static Page_Manager pom = new Page_Manager(driver);
	
	@Given("^User Launch the Browser$")
	public void user_Launch_the_Browser() throws Throwable {
		browserLaunch("Chrome");
		
	}

	@When("^User Enter the Url$")
	public void user_Enter_the_Url() throws Throwable {
		getUrl("https://risk.lexisnexis.co.uk/");
		Thread.sleep(10000);
		System.out.println("After Url Launch");

	}


	@When("^User Accept All Cookies and close the Popup$")
	public void user_Accept_All_Cookies_and_close_the_Popup() throws Throwable {
		System.out.println("Enter into Cookies");
		WebElement cookies1 = pom.getHp().getCookies();
		isDisplayed(cookies1);
		isEnabled(cookies1);
		getText(cookies1);
		Thread.sleep(3000);
		clickOnElement(cookies1);
		Thread.sleep(3000);
		WebElement cancel2 = pom.getHp().getCancel();
		clickOnElement(cancel2);
	}

	@When("^User checks the FinancialServices Webelement is Enabled or Not$")
	public void user_checks_the_FinancialServices_Webelement_is_Enabled_or_Not() throws Throwable {
		
		WebElement financial = pom.getHp().getFinancial();
		isEnabled(financial);
		isDisplayed(financial);
		getText(financial);
		scrollIntoView(financial);
		Thread.sleep(3000);

	}

	@When("^User Checks the Insurance WebElement is Enabled or Not$")
	public void user_Checks_the_Insurance_WebElement_is_Enabled_or_Not() throws Throwable {
		WebElement Insurance2 = pom.getHp().getInsurance();
		isDisplayed(Insurance2);
		isEnabled(Insurance2);
		getText(Insurance2);
		scrollIntoView(Insurance2);
		Thread.sleep(3000);
	}

	@When("^User Checks the LifeAndPensions WebElement is Enabled Or Not$")
	public void user_Checks_the_LifeAndPensions_WebElement_is_Enabled_Or_Not() throws Throwable {
		WebElement life2 = pom.getHp().getLife();
		isDisplayed(life2);
		isEnabled(life2);
		getText(life2);
		scrollIntoView(life2);
		Thread.sleep(3000);

	}

	@When("^User Checks the CorporationsAndNonProfits WebElement is Enabled or Not$")
	public void user_Checks_the_CorporationsAndNonProfits_WebElement_is_Enabled_or_Not() throws Throwable {
		WebElement corporation2 = pom.getHp().getCorporation();
		isDisplayed(corporation2);
		isEnabled(corporation2);
		getText(corporation2);
		scrollIntoView(corporation2);
		Thread.sleep(3000);

	}

	@When("^User Click the ChooseYourIndustry Tab and It Shows the Tab View$")
	public void user_Click_the_ChooseYourIndustry_Tab_and_It_Shows_the_Tab_View() throws Throwable {
		WebElement industry2 = pom.getHp().getIndustry();
		isDisplayed(industry2);
		isEnabled(industry2);
		getText(industry2);
		scrollIntoView(industry2);
		clickOnElement(industry2);
		Thread.sleep(3000);

	}

	@When("^User Click the Financial services$")
	public void user_Click_the_Financial_services() throws Throwable {
		WebElement finance1 = pom.getHp().getFinance();
		isDisplayed(finance1);
		isEnabled(finance1);
		getText(finance1);
		scrollIntoView(finance1);
		clickOnElement(finance1); 
		Thread.sleep(3000);

	}

	@Then("^Navigates to Financial Services Page$")
	public void navigates_to_Financial_Services_Page() throws Throwable {
		getTitle();
		Thread.sleep(3000);

	}

	@Given("^User Enter into Financial Services Page$")
	public void user_Enter_into_Financial_Services_Page() throws Throwable {
		  
	}

	@When("^User Checks the FinancialCrimeCompliance Webelement is Enabled or Not$")
	public void user_Checks_the_FinancialCrimeCompliance_Webelement_is_Enabled_or_Not() throws Throwable {
		WebElement FComplaint2 = pom.getFp().getFComplaint();
		isDisplayed(FComplaint2);
		isEnabled(FComplaint2);
		getText(FComplaint2);
		scrollIntoView(FComplaint2);
		Thread.sleep(3000);

	}

	@When("^User Checks the FraudAndIdentityManagement WebElement Is Enabled or Not$")
	public void user_Checks_the_FraudAndIdentityManagement_WebElement_Is_Enabled_or_Not() throws Throwable {
		WebElement Fraud2 = pom.getFp().getFraud();
		isDisplayed(Fraud2);
		isEnabled(Fraud2);
		getText(Fraud2);
		scrollIntoView(Fraud2);
		Thread.sleep(3000);

	}

	@When("^User Checks The CustomerDataManagement WebElement Is Enabled or Not$")
	public void user_Checks_The_CustomerDataManagement_WebElement_Is_Enabled_or_Not() throws Throwable {
		WebElement management2 = pom.getFp().getManagement();
		isDisplayed(management2);
		isEnabled(management2);
		getText(management2);
		scrollIntoView(management2);
		Thread.sleep(3000);

	}

	@When("^User Checks the CreditRiskAssesment Webelement is Enabled or Not$")
	public void user_Checks_the_CreditRiskAssesment_Webelement_is_Enabled_or_Not() throws Throwable {
		WebElement Assesment2 = pom.getFp().getAssesment();
		isDisplayed(Assesment2);
		isEnabled(Assesment2);
		getText(Assesment2);
		scrollIntoView(Assesment2);
		Thread.sleep(3000);

	}

	@When("^User Checks the CollectionsAndRecovery WebElement is Enabled Or Not$")
	public void user_Checks_the_CollectionsAndRecovery_WebElement_is_Enabled_Or_Not() throws Throwable {
		WebElement Collections2 = pom.getFp().getCollections();
		isDisplayed(Collections2);
		isEnabled(Collections2);
		getText(Collections2);
		scrollIntoView(Collections2);
		Thread.sleep(3000);

	}

	@When("^User Checks The TracingAndInvestigations WebElement is Enabled Or Not$")
	public void user_Checks_The_TracingAndInvestigations_WebElement_is_Enabled_Or_Not() throws Throwable {
		WebElement tracing2 = pom.getFp().getTracing();
		isDisplayed(tracing2);
		isEnabled(tracing2);
		getText(tracing2);
		scrollIntoView(tracing2);
		Thread.sleep(3000);

	}

	@Then("^User Close the Browser$")
	public void user_Close_the_Browser() throws Throwable {
		quitBrowser();
	}
		
			
		

		
		
	
}
