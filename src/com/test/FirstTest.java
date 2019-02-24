package com.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FirstTest {

	
	/*set system property for chrome
	login to app
	 launch chrome Browser
	 enter URL
	 Google Title Test
	delete all cookies
	close browser
	logout from app
	PASSED: googleTitleTest
	Asdfgh
	
	*/
	
	@BeforeSuite
	
	public void setUp()
	{
		
		System.out.println(" set system property for chrome");
	}
	
	
	
	@BeforeClass
	public void launchBrowser()
	{
		System.out.println(" launch chrome Browser");
	}
	
	@BeforeMethod
	
	public void enterURL()
	{
		System.out.println(" enter URL");
	}
	
	@BeforeTest
	public void login()
	{
		System.out.println("login to app");
	}
	
	@Test
	public void googleTitleTest()
	{
		System.out.println(" Google Title Test");
	}
	
	@Test
	public void searchTest()
	{
		System.out.println("Search Tested");
	}
	
	@Test
	public void googleLogoTest()
	{
		System.out.println("Logo Tested");
	}
	@AfterTest
	public void logOut()
	{
		System.out.println("logout from app");
	}
	
	@AfterMethod
	public void deleteAllCookies()
	{
		System.out.println("delete all cookies");
		
	}
	
	@AfterClass
	public void closeBrowser()
	{
		System.out.println("close browser");
	}
	
	@AfterSuite
	public void generateTestReport()
	{
		System.out.println("Generate Test Report");
	}

}
