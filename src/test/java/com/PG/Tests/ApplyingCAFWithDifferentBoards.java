package com.PG.Tests;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.PG.Listener.ExtentFactory;
import com.PG.browser.BrowserFactoryNew;
import com.PG.genericLibrary.constants;
import com.PG.objectRepository.BaseClass;
import com.PG.objectRepository.PGCAFData;
import com.PG.objectRepository.PGCAFNew;

public class ApplyingCAFWithDifferentBoards extends BaseClass implements PGCAFData {

	XSSFWorkbook wb;
	XSSFSheet sht;
	String sheetName = "Result";
	int rowCount = constants.fileone.getRowCount(sheetName);

	@Test(priority = 0)
	public void LoggingIn() throws Exception {

		BrowserFactoryNew bc = new BrowserFactoryNew();
		bc.Login(MobileNumber, Password);
		Thread.sleep(3000);
	}

	@Test(priority = 1)
	public void SubmissionCAFWithOdishaBoard() throws Exception {

		// logger = report.createTest("Verifying submitting of CAF by Odisha Board
		// Applicant");

		PGCAFNew Form = new PGCAFNew(driver);

		Form.ApplicationFormButton().click();
		Thread.sleep(300);

		ExtentFactory.getInstance().getExtent().info("Selecting Odisha Board");

		Form.BoardName("BSE, Odisha");
		Thread.sleep(300);

		Form.YearofPassing("2015");
		Thread.sleep(300);
		Form.ExamTypeAsAnnual().click();
		Thread.sleep(300);
		Form.RollNumber().clear();

		Thread.sleep(300);
		Form.RollNumber().sendKeys("31TC168");
		Thread.sleep(300);
		Form.BloodGroup("A+");
		Thread.sleep(1000);

		Form.FatherName().click();
		Thread.sleep(300);
		Form.FatherName().sendKeys("Rajendra Kumar Singh");
		Thread.sleep(300);
		Form.MotherName().clear();
		Thread.sleep(300);
		Form.MotherName().sendKeys("Sarojini Singh");
		Thread.sleep(300);
		Form.Gender("MALE");
		Thread.sleep(300);
		Form.Religion("HINDU");
		Thread.sleep(300);
		Form.BirthDate();
		Thread.sleep(300);
		Form.IdentificationType("Aadhaar");
		Thread.sleep(300);
		Form.IdentificationNumber().clear();
		Thread.sleep(300);
		Form.IdentificationNumber().sendKeys("761490617322");

		Thread.sleep(300);
		Form.StateofDomicile("ODISHA");
		Thread.sleep(300);
		Form.State("ODISHA");
		Thread.sleep(300);
		Form.District("KHURDA");
		Thread.sleep(300);
		Form.Block("BHUBANESWAR (MC)");
		Thread.sleep(300);
		Form.Pincode().clear();
		Thread.sleep(300);
		Form.Pincode().sendKeys("751010");
		Thread.sleep(300);
		Form.AlternateMobileNo().sendKeys("9437850045");
		Thread.sleep(300);
		Form.Address().clear();
		Thread.sleep(300);
		Form.Address().sendKeys("Bhubaneswar");

		Form.ApplicantName().clear();
		Thread.sleep(300);
		Form.ApplicantName().sendKeys("Milan Singh");

		Thread.sleep(300);
		Form.BasicInfoNext().click();

		Thread.sleep(400);

		String actualPopup = Form.PopUpMsg().getText();
		System.out.println(actualPopup);

		ExtentFactory.getInstance().getExtent().info("Assertion of Expected & Actual Result");

		if (actualPopup.contains("Are you sure want to proceed ?"))

		{
			constants.fileone.setCellData(sheetName, "Status", 9, "Pass");
			Thread.sleep(300);
			Form.BasicInfoCancel().click();
		}

		else {
			constants.fileone.setCellData(sheetName, "Status", 9, "Fail");
		}
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(actualPopup, "Are you sure want to proceed ?", "Test Failed");

		softAssert.assertAll();

		ExtentFactory.getInstance().getExtent().info("Successfully checked Odisha Board Applicant scenario");
	}

	@Test(priority = 2)
	public void SubmissionCAFWithNonOdishaBoard() throws Exception {

		// logger = report.createTest("Verification of submitting form by Non-Odisha
		// Board Applicant");

		PGCAFNew From = new PGCAFNew(driver);

		Thread.sleep(300);

		ExtentFactory.getInstance().getExtent().info("Selection of Non-odisha board");

		From.BoardName("BPE, Kerala");
		Thread.sleep(300);
		From.YearofPassing("2015");
		Thread.sleep(300);
		From.ExamTypeAsAnnual().click();
		Thread.sleep(300);
		From.RollNumber().clear();
		Thread.sleep(300);
		From.RollNumber().sendKeys("31TC168");
		Thread.sleep(300);
		From.BloodGroup("A+");
		Thread.sleep(300);
		From.ApplicantName().clear();
		Thread.sleep(300);
		From.ApplicantName().sendKeys("Milan Singh");
		Thread.sleep(300);
		From.FatherName().clear();
		Thread.sleep(300);
		From.FatherName().sendKeys("Rajendra Kumar Singh");
		Thread.sleep(300);
		From.MotherName().clear();
		Thread.sleep(300);
		From.MotherName().sendKeys("Sarojini Singh");
		Thread.sleep(300);
		From.Gender("MALE");
		Thread.sleep(300);
		From.Religion("HINDU");
		Thread.sleep(300);
		From.BirthDate();
		Thread.sleep(300);
		From.IdentificationType("Aadhaar");
		Thread.sleep(300);
		From.IdentificationNumber().clear();
		Thread.sleep(300);
		From.IdentificationNumber().sendKeys("761490617322");

		Thread.sleep(300);
		From.StateofDomicile("ODISHA");
		Thread.sleep(300);
		From.State("ODISHA");
		Thread.sleep(300);
		From.District("KHURDA");
		Thread.sleep(300);
		From.Block("BHUBANESWAR (MC)");
		Thread.sleep(300);
		From.Pincode().clear();
		Thread.sleep(300);
		From.Pincode().sendKeys("751010");
		Thread.sleep(300);
		From.AlternateMobileNo().sendKeys("9437850045");
		Thread.sleep(300);
		From.Address().clear();
		Thread.sleep(300);
		From.Address().sendKeys("Bhubaneswar");

		Thread.sleep(300);
		From.BasicInfoNext().click();

		Thread.sleep(400);

		String actualPopup = From.PopUpMsg().getText();
		System.out.println(actualPopup);

		ExtentFactory.getInstance().getExtent().info("Assertion of Expected & Actual result");

		if (actualPopup.contains("Are you sure want to proceed ?"))

		{
			constants.fileone.setCellData(sheetName, "Status", 10, "Pass");
			Thread.sleep(300);
			From.BasicInfoCancel().click();
		}

		else {
			constants.fileone.setCellData(sheetName, "Status", 10, "Fail");
		}
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(actualPopup, "Are you sure want to proceed ?", "Test Failed");

		softAssert.assertAll();

		ExtentFactory.getInstance().getExtent().info("Successfully checked Non-odisha Board Applicant scenario");
	}

}