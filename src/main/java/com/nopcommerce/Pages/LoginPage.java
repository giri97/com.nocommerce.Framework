package com.nopcommerce.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nopcommerce.BaseTest.BaseClass;

public class LoginPage extends BaseClass {

	@FindBy(xpath="//a[text()='Log in']")
	private WebElement link_login;
	@FindBy(xpath="//input[@id='Email']")
	private WebElement username;
	@FindBy(xpath="//input[@id='Password']")
	private WebElement password;
	@FindBy(xpath="//button[text()='Log in']")
	private WebElement Btn_login;


	public LoginPage() {
		PageFactory.initElements(driver,this);
	}
	
	public void clickOnLoginLink() {
		link_login.click();
	}

	public void userLoginCredential(String user,String pass) {
		
		username.sendKeys(user);
		password.sendKeys(pass);

	}

	public void clickOnLoginBtn() {
		Btn_login.click();
	}




}
