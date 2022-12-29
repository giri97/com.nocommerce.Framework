package com.nopcommerce.Testcases;

import org.testng.annotations.Test;

import com.nopcommerce.BaseTest.BaseClass;
import com.nopcommerce.Pages.LoginPage;
import com.nopcommerce.PropertyFile.PropertyFile;

public class LoginPageTest extends BaseClass {

	LoginPage loginpage;
	@Test
	public void verifyUserlogin() {

		loginpage=new LoginPage();
		loginpage.clickOnLoginLink();
		loginpage.userLoginCredential(PropertyFile.getData("username"),PropertyFile.getData("password"));
		loginpage.clickOnLoginBtn();


	}















}
