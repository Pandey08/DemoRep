package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest {

	
	WebDriver driver;
	
	@BeforeMethod
	
	public void setUp()
	{
		String url="https://www.google.com";
		System.setProperty("webdriver.chrome.driver","C://Project//TESTNG//chromedriver.exe" );
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test(priority=1,groups="Title test")
	
	public void googleTitleTest()
	{
		String title=driver.getTitle();
		System.out.println(title);
	}
	
	@Test(priority=2,groups= "Logo Test")
	
	public void googleLogoTest()
	{
		boolean b= driver.findElement(By.id("hplogo")).isDisplayed();
		System.out.println(b);
	}
	
	@Test(priority=3, groups=" Link Test")
	
	public void MailLinkTest()
	{
		boolean c= driver.findElement(By.linkText("Gmail")).isDisplayed();
		System.out.println(c);
	}
	
@Test(priority=4, groups="Test")
	
	public void test1()
	{
		
		System.out.println("test1");
	}
@Test(priority=5,groups="Test")

public void test2()
{
	
	System.out.println("test2");
}

@Test(priority=6,groups="Test")

public void test3()
{
	
	System.out.println("test3");
}
	
	@AfterMethod
	
	public void tearDown() {
		driver.quit();
	}
	
	
	
	
	
	
	
	
}
