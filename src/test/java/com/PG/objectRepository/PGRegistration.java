package com.PG.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PGRegistration {
	
	WebDriver driver;
	
	public PGRegistration(WebDriver driver) {
		
		this.driver=driver;
	}
	
	@FindBy(id="txtName") 
	private WebElement name;
	
	public WebElement StudentName() {
		return name;
	}

	@FindBy(id="txtSMobileNo") 
	private WebElement mobileNo;
	
	public WebElement MobileNumber() {
		return mobileNo;
	}

	@FindBy(id="txtmail") 
	private WebElement mail;
	
	public WebElement eMail() {
		return mail;
	}

	@FindBy(id="btnOTP") 
	private WebElement regotp;
	
	public WebElement GenerateOTP() {
		return regotp;
	}
	
	@FindBy(id="txtOTPVerify") 
	private WebElement vc;
	
	public WebElement VerificationCode(){
		return vc;
	}
	
	@FindBy(id="txtPwd") 
	private WebElement pwd;
	
	public WebElement Password() {
		return pwd;
	}
	
	@FindBy(id="txtConfirmPwd") 
	private WebElement cpwd;
	
	public WebElement ConfirmPassword() {
		return cpwd;
	}
	
	@FindBy(id="btnSubmit") 
	private WebElement sub;
	
	public WebElement Submit() {
		return sub;
	}
	
	
}
