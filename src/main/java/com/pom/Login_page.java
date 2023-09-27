package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login_page {
public WebDriver driver;
@FindBy(name = "username")
private WebElement username;

@FindBy(name = "password")
private WebElement password;

@FindBy(xpath = "//button[text()= ' Login ']")
private WebElement clk;

public WebElement getClk() {
	return clk;
}

public void setClk(WebElement clk) {
	this.clk = clk;
}

public WebElement getUsername() {
	return username;
}

public WebElement getPassword() {
	return password;
}
}
