package com.ohrm.pages;

import org.openqa.selenium.By;

import com.ohrm.base.OHRMBase;

public class DashboardPage extends OHRMBase {
	


	public boolean BuzzLatestpostPresent() 
	{
		return driver.findElement(By.xpath("//p[text()='Buzz Latest Posts']")).isDisplayed();
	}

	public boolean myActionPresent() 
	{
		return driver.findElement(By.xpath("//p[text()='My Actions']")).isDisplayed();
	}
	
	public boolean TimeatWorkPresent()
	{
		return driver.findElement(By.xpath("//p[text()='Time at Work']")).isDisplayed();
	}
	
	public boolean QuickLaunchPresent()
	{
		return driver.findElement(By.xpath("//p[text()='Quick Launch']")).isDisplayed();
	}
	
	public boolean EmployeesonLeaveTodayPresent()
	{
		return driver.findElement(By.xpath("//p[text()='Employees on Leave Today']")).isDisplayed();
	}
	
	public boolean EmployeeDistributionbyLocationPresent()
	{
		return driver.findElement(By.xpath("//p[text()='Employee Distribution by Location']")).isDisplayed();
	}
	
	
}
