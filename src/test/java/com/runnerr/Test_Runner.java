package com.runnerr;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import com.baseclass.Base_class;
import com.sdp.Page_Manager;

public class Test_Runner extends Base_class {
	
	public static Page_Manager pom=new Page_Manager(driver);
	
	@Test
	void checkTheWebelement() throws Throwable {
		
        browserLaunch("Chrome");
		
		getUrl("https://risk.lexisnexis.co.uk/");
		
		Thread.sleep(10000);
		WebElement cookies1 = pom.getHp().getCookies();
		isDisplayed(cookies1);
		Thread.sleep(3000);
		isEnabled(cookies1);
		getText(cookies1);
		Thread.sleep(10000);
		clickOnElement(cookies1);
		Thread.sleep(3000);
		
		WebElement cancel2 = pom.getHp().getCancel();
		clickOnElement(cancel2);
		
		WebElement financial = pom.getHp().getFinancial();
		isEnabled(financial);
		isDisplayed(financial);
		getText(financial);
		scrollIntoView(financial);
		
		WebElement Insurance2 = pom.getHp().getInsurance();
		isDisplayed(Insurance2);
		isEnabled(Insurance2);
		getText(Insurance2);
		scrollIntoView(Insurance2);
		Thread.sleep(3000);
		
		
		WebElement life2 = pom.getHp().getLife();
		isDisplayed(life2);
		isEnabled(life2);
		getText(life2);
		scrollIntoView(life2);
		
		WebElement corporation2 = pom.getHp().getCorporation();
		isDisplayed(corporation2);
		isEnabled(corporation2);
		getText(corporation2);
		scrollIntoView(corporation2);
		
		
		WebElement industry2 = pom.getHp().getIndustry();
		isDisplayed(industry2);
		isEnabled(industry2);
		getText(industry2);
		scrollIntoView(industry2);
		clickOnElement(industry2);
		
		WebElement finance1 = pom.getHp().getFinance();
		isDisplayed(finance1);
		isEnabled(finance1);
		getText(finance1);
		scrollIntoView(finance1);
		clickOnElement(finance1);   
		
		WebElement FComplaint2 = pom.getFp().getFComplaint();
		isDisplayed(FComplaint2);
		isEnabled(FComplaint2);
		getText(FComplaint2);
		scrollIntoView(FComplaint2);
		
		WebElement Fraud2 = pom.getFp().getFraud();
		isDisplayed(Fraud2);
		isEnabled(Fraud2);
		getText(Fraud2);
		scrollIntoView(Fraud2);
		
		WebElement management2 = pom.getFp().getManagement();
		isDisplayed(management2);
		isEnabled(management2);
		getText(management2);
		scrollIntoView(management2);
		
		WebElement Assesment2 = pom.getFp().getAssesment();
		isDisplayed(Assesment2);
		isEnabled(Assesment2);
		getText(Assesment2);
		scrollIntoView(Assesment2);
		
		WebElement Collections2 = pom.getFp().getCollections();
		isDisplayed(Collections2);
		isEnabled(Collections2);
		getText(Collections2);
		scrollIntoView(Collections2);
		
		WebElement tracing2 = pom.getFp().getTracing();
		isDisplayed(tracing2);
		isEnabled(tracing2);
		getText(tracing2);
		scrollIntoView(tracing2);
		
		
		
		
	}

}
