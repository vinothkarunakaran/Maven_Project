package com.testng;

import org.testng.annotations.Test;

import com.base.Base_Class;

public class Ignore extends Base_Class  {
@Test
	private void google() {
launchBrowser("chrome");
}
@org.testng.annotations.Ignore
@Test
private void firefox() {
	launchBrowser("firefox");
}
@Test
private void edge() {
	launchBrowser("edge");
}
}
