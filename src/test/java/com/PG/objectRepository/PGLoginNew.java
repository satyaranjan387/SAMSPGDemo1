package com.PG.objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class PGLoginNew {
	
	WebDriver driver;
	
	public PGLoginNew(WebDriver driver) {
		
		this.driver=driver;
	}
	
	By mobile = By.id("txtSMobileNo");
			public WebElement MobileNo() {
		return driver.findElement(mobile);
	}
	
	By password = By.id("txtSPwd");
			public WebElement Password() {
		return driver.findElement(password);
	}		
			
	By captcha = By.id("txtRandno");
			public WebElement Captcha() {
		return driver.findElement(captcha);
	}		

	By signin = By.xpath("//input[@id='btnSIGNIN']");
			public WebElement SignIn() {
		return driver.findElement(signin);
	}
			
	By ok=By.xpath("/html[1]/body[1]/div[3]/div[1]/div[2]/input[1]"); 
			public WebElement PopUpOK() {
				return driver.findElement(ok);
			}
			
			By Popupmsg = By.xpath("//div[@id='popup_message']");
			public WebElement PopUpMsg() {
				return driver.findElement(Popupmsg);
			}
			
		

//	@FindBy(xpath="//*[@id=\"frmNotice\"]/div[3]/div[2]/div[7]/div/div/a") 
//	private WebElement forgotpwd;
//	
//	public WebElement ForgotPassword() {
//		return forgotpwd;
//	}
//	
//	@FindBy(xpath="txtSMobileNo") 
//	private WebElement forgotmobno;
//	
//	public WebElement RecoveryMobileNo() {
//		return forgotmobno;
//	}
//	
//	@FindBy(xpath="txtmail") 
//	private WebElement forgotmail;
//	
//	public WebElement RecoveryMail() {
//		return forgotmail;
//	}
//	
//	@FindBy(xpath="btnOTP") 
//	private WebElement forgototp;
//	
//	public WebElement OTPGeneration() {
//		return forgototp;
//	}
//	
//	@FindBy(xpath="//*[@id=\"navbar-container\"]/div[2]/ul/li[2]/a") 
//	private WebElement logout;
//	
//	public WebElement LogOut() {
//		return logout;
//	}

}
