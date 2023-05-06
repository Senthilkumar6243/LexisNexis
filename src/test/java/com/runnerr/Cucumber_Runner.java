package com.runnerr;

import org.junit.runner.RunWith;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = ".\\src\\test\\java\\com\\feature",
glue = "com.step",
plugin = {"html:Reports/Html1_Report",
		"pretty",
		"json:Reports/Json1_Report",
		"com.cucumber.listener.ExtentCucumberFormatter:Reports/ExtentReport.html"})
public class Cucumber_Runner{






}
