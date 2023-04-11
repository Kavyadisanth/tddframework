package com.ohrm.pages;

import org.openqa.selenium.By;


import com.ohrm.base.OHRMBase;

public class LoginPage extends OHRMBase
{
	public DashboardPage login()
	{
		driver.findElement(By.name("username")).sendKeys(prop.getProperty("username"));
		driver.findElement(By.name("password")).sendKeys(prop.getProperty("Password"));
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		return new DashboardPage();
	}
	
	public String getTitle() 
	{
		return driver.getTitle();
	}
	
	public boolean forgotPwdClick()
	{
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[4]/p")).click();
		return driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/div/form/h6")).isDisplayed();
	}
	
	public boolean getCompanyLink()
	{
		return driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[3]/div[2]/p[2]/a")).isDisplayed();
	}
	
	
}
