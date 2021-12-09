package com.PG.objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class PGRegistrationNew {
	
WebDriver driver;
	
	public PGRegistrationNew(WebDriver driver) {
		
		this.driver=driver;
	}
	
	By name = By.id("txtName");
			public WebElement StudentName() {
		return driver.findElement(name);
	}
	
	By mobileNo = By.id("txtSMobileNo");
			public WebElement MobileNumber() {
		return driver.findElement(mobileNo);
	}		
			
	By mail = By.id("txtmail");
			public WebElement eMail() {
		return driver.findElement(mail);
	}		

	By regotp = By.id("btnOTP");
			public WebElement GenerateOTP() {
		return driver.findElement(regotp);
	}
			
	By vc = By.id("txtOTPVerify");
			public WebElement VerificationCode() {
		return driver.findElement(vc);
	}
			
	By pwd = By.id("txtPwd");
			public WebElement Password() {
		return driver.findElement(pwd);
	}
	
	By cpwd = By.id("txtConfirmPwd");
			public WebElement ConfirmPassword() {
		return driver.findElement(cpwd);
	}
			
	By sub = By.id("btnSubmit");
			public WebElement Submit() {
		return driver.findElement(sub);
	}

}