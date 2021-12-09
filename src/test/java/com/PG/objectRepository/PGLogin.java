package com.PG.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PGLogin {
	
	WebDriver driver;
	
	public PGLogin(WebDriver driver) {
		
		this.driver=driver;
	}
	
	@FindBy(id="txtSMobileNo") 
	private WebElement mobile;
	
	public WebElement MobileNo() {
		return mobile;
	}
	
	@FindBy(id="txtSPwd") 
	private WebElement password;
	
	public WebElement Password() {
		return password;
	}
	
	@FindBy(id="txtRandno") 
	private WebElement captcha;
	
	public WebElement Captcha() {
		return captcha;
	}
	
	@FindBy(css="#btnSIGNIN") 
	private WebElement signin;
	
	public WebElement SignIn() {
		return signin;
	}
	
	@FindBy(xpath="//*[@id=\"frmNotice\"]/div[3]/div[2]/div[7]/div/div/a") 
	private WebElement forgotpwd;
	
	public WebElement ForgotPassword() {
		return forgotpwd;
	}
	
	@FindBy(xpath="txtSMobileNo") 
	private WebElement forgotmobno;
	
	public WebElement RecoveryMobileNo() {
		return forgotmobno;
	}
	
	@FindBy(xpath="txtmail") 
	private WebElement forgotmail;
	
	public WebElement RecoveryMail() {
		return forgotmail;
	}
	
	@FindBy(xpath="btnOTP") 
	private WebElement forgototp;
	
	public WebElement OTPGeneration() {
		return forgototp;
	}
	
	@FindBy(xpath="//*[@id=\"navbar-container\"]/div[2]/ul/li[2]/a") 
	private WebElement logout;
	
	public WebElement LogOut() {
		return logout;
	}

}
