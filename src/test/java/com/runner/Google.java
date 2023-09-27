package com.runner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.base.Base_Class;

public class Google extends Base_Class {
public static void main(String[] args) {
	launchBrowser("edge");
	
	launchUrl("https://www.google.co.in/");
	WebElement findElement = driver.findElement(By.name("q"));
	passInput(findElement, "rose");
	
}
}
