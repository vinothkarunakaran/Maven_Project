package com.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.base.Base_Class;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OrangeStep extends Base_Class{

	@Given("^User Must Launch The \"([^\"]*)\" Browser$")
	public void user_Must_Launch_The_Browser(String arg1) throws Throwable {
		launchBrowser(arg1);
		implicitwait(30);
	}
	@When("^User Must Launch The \"([^\"]*)\" Url$")
	public void user_Must_Launch_The_Url(String arg1) throws Throwable {
	    launchUrl(arg1);
	   
	}

	@When("^User Must Enter The Valid User Name In \"([^\"]*)\" User Name Field$")
	public void user_Must_Enter_The_Valid_User_Name_In_User_Name_Field(String arg1) throws Throwable {
		WebElement l = driver.findElement(By.name("username"));
		passInput(l, arg1);
	}

	@When("^User Must Enter The Valid password In \"([^\"]*)\" password Field$")
	public void user_Must_Enter_The_Valid_password_In_password_Field(String arg1) throws Throwable {
		WebElement l = driver.findElement(By.name("password"));
		passInput(l, arg1);
	}

	@Then("^User Must Click The Click Button and Its Navigate To The User Page$")
	public void user_Must_Click_The_Click_Button_and_Its_Navigate_To_The_User_Page() throws Throwable {
		WebElement findElement = driver.findElement(By.xpath("//button[text()= ' Login ']"));
		clickButton(findElement);
	}
}
