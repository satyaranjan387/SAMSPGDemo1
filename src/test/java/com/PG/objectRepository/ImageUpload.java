package com.PG.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ImageUpload {
	
	@FindBy(xpath="//*[@id=\"leftmenu_divITI\"]/ul/li[3]/a/span") 
	private WebElement uploadimage;
	
	public WebElement ImageUploadLink() {
		return uploadimage;
	}
	
	@FindBy(xpath="//input[@id='fldImage']") 
	private WebElement choose;
	
	public WebElement ChooseFile() {
		return choose;
	}
	
	@FindBy(id="btnSave") 
	private WebElement save;
	
	public WebElement Save() {
		return save;
	}
	
	@FindBy(id="btnCancel") 
	private WebElement reset;
	
	public WebElement Reset() {
		return reset;
	}
	
	@FindBy(xpath="//*[@id=\"Edit\"]/a") 
	private WebElement edit;
	
	public WebElement Edit() {
		return edit;
	}
	
	@FindBy(id="btnSave") 
	private WebElement update;
	
	public WebElement Update() {
		return update;
	}
	
	@FindBy(id="popup_ok") 
	private WebElement ok;
	
	public WebElement OkButton() {
		return ok;
	}
	
	@FindBy(id="popup_cancel") 
	private WebElement can;
	
	public WebElement CancelButton() {
		return can;
	}
	
	@FindBy(id="btnCancel") 
	private WebElement cancel;
	
	public WebElement Cancel() {
		return cancel;
	}
	
	
	

}
