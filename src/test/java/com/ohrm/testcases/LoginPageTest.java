package com.ohrm.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ohrm.pages.DashboardPage;
import com.ohrm.pages.LoginPage;

public class LoginPageTest {
	
	LoginPage lp;
	DashboardPage dp;
	@BeforeMethod
	public void launchBrowser()
	{
		lp=new LoginPage();
		lp.initialization();
		
	}

	@Test
	public void validateTitleTest()
	{
		String expTitle="OrangeHRM";
		String actTitle=lp.getTitle();
		Assert.assertEquals(actTitle, expTitle);		
	}
	
	@Test
	public void validateLoginTest()
	{
		dp=lp.login();
		Assert.assertTrue(dp.myActionPresent());		 
	}
	
	@Test
	public void ForgotPasswordLinkTest()
	{
		Assert.assertTrue(lp.forgotPwdClick());		
	}
	
	@Test
	public void CompanyLinkTest()
	{
		Assert.assertTrue(lp.getCompanyLink());		
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		lp.tearDown();
	}
}
