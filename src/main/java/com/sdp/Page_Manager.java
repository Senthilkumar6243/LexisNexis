package com.sdp;

import org.openqa.selenium.WebDriver;
import com.pom.Financial_page;
import com.pom.HomePage;

public class Page_Manager{

	public WebDriver driver;
	private HomePage Hp;
	private Financial_page Fp;

	public Page_Manager(WebDriver driver) {

		this.driver=driver;
	}
	public HomePage getHp() {
		Hp=new HomePage(driver);
		return Hp;
	}


	public Financial_page getFp() {
		Fp=new Financial_page(driver);
		return Fp;
	}








}
