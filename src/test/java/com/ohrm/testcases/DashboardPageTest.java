package com.ohrm.testcases;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import com.ohrm.base.OHRMBase;
import com.ohrm.pages.DashboardPage;
import com.ohrm.pages.LoginPage;

public class DashboardPageTest extends OHRMBase
{
	LoginPage lp;
	DashboardPage dp;
	
	@BeforeMethod
	public void browserConfig() 
	{
		initialization();
		lp=new LoginPage();
		dp=lp.login();
		
	}
	
	@Test
	public void myActionSection() 
	{
		Assert.assertTrue(dp.myActionPresent());
	}
	
	@Test	
	public void BuzzLatepostsection()
	{
		Assert.assertTrue(dp.BuzzLatestpostPresent());
	}
	
	@Test
	public void QuickLaunchSection()
	{
		Assert.assertTrue(dp.TimeatWorkPresent());
	}
	
	@Test
	public void EmployeesonLeaveTodaySection()
	{
		Assert.assertTrue(dp.EmployeesonLeaveTodayPresent());
	}
	
	@Test
	public void EmployeeDistributionbyLocationSection()
	{
		Assert.assertTrue(dp.EmployeeDistributionbyLocationPresent());
	}
	
	@AfterMethod
	public void closeSetUp() {
		lp.tearDown();
	}

}
