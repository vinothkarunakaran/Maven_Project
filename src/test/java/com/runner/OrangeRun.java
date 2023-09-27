package com.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\SSD-ADMIN\\eclipse-workspace\\Maven_Project\\src\\test\\java\\com\\feature\\Orange.feature",
glue = "com.stepdefinition",plugin = {"html:Reports/Adactin_Cucumber.html",
		"pretty",
		"json:Reports/JsonFile.json", "com.cucumber.listener.ExtentCucumberFormatter:Reports/ExtendReport.html"})

public class OrangeRun {

}
