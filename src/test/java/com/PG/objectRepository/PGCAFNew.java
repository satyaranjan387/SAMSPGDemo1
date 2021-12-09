package com.PG.objectRepository;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.Select;

public class PGCAFNew {

	WebDriver driver;

	public PGCAFNew(WebDriver driver) {

		this.driver = driver;
	}

	public void ScrollUp() {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,-250)");
	}

	By applBtn = By.xpath("//span[contains(text(),'Application Form')]");

	public WebElement ApplicationFormButton() {
		return driver.findElement(applBtn);
	}

	By ExamTypeAsSupplementary = By.xpath("//*[@id='tbl10th']/div[3]/div[2]/span[2]/span/label");

	public WebElement ExamTypeAsSupplementary() {
		return driver.findElement(ExamTypeAsSupplementary);
	}

	By ExamTypeAsAnnual = By.xpath("//*[@id='tbl10th']/div[3]/div[2]/span[1]/span/label");

	public WebElement ExamTypeAsAnnual() {
		return driver.findElement(ExamTypeAsAnnual);
	}

	By boardname = By.id("ddlBoard");

	public void BoardName(String bname) {
		Select board = new Select(driver.findElement(boardname));
		board.selectByVisibleText(bname);
	}

	By YOP = By.id("ddlYOP");

	public void YearofPassing(String yop) {
		Select board = new Select(driver.findElement(YOP));
		board.selectByVisibleText(yop);
	}

	By BloodGroup = By.id("ddlBloodGroup");

	public void BloodGroup(String Bloodgroup) {
		Select board = new Select(driver.findElement(BloodGroup));
		board.selectByVisibleText(Bloodgroup);
	}

	By Religion = By.id("ddlReligion");

	public void Religion(String Reli) {
		Select board = new Select(driver.findElement(Religion));
		board.selectByVisibleText(Reli);
	}

	By Gender = By.id("ddlGender");

	public void Gender(String Gen) {
		Select board = new Select(driver.findElement(Gender));
		board.selectByVisibleText(Gen);
	}

	By IdentificationType = By.id("ddlIDType");

	public void IdentificationType(String Identification) {
		Select board = new Select(driver.findElement(IdentificationType));
		board.selectByVisibleText(Identification);
	}

	By State = By.id("ddlState");

	public void State(String st) {
		Select board = new Select(driver.findElement(State));
		board.selectByVisibleText(st);
	}

	By District = By.id("ddlDist");

	public void District(String Dis) {
		Select board = new Select(driver.findElement(District));
		board.selectByVisibleText(Dis);
	}

	By Block = By.id("ddlBlock");

	public void Block(String Bl) {
		Select board = new Select(driver.findElement(Block));
		board.selectByVisibleText(Bl);
	}

	By StateofDomicile = By.id("ddlDomicile");

	public void StateofDomicile(String SD) {
		Select board = new Select(driver.findElement(StateofDomicile));
		board.selectByVisibleText(SD);
	}

	By AppName = By.id("txtApplName");

	public WebElement ApplicantName() {
		return driver.findElement(AppName);
	}

	By Popupmsg = By.id("popup_message");

	public WebElement PopUpMsg() {
		return driver.findElement(Popupmsg);
	}

	public void BirthDate() {
		// ((JavascriptExecutor)driver).executeScript
		// ("document.getElementById('txtDOB').removeAttribute('readonly',0);");
		// WebElement date = driver.findElement(By.xpath("//input[@id='txtDOB']"));
		// date.click();
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("document.getElementById('txtDOB').value='11-09-1993'");

	}

	public void InValidBirthDate() {
		// ((JavascriptExecutor)driver).executeScript
		// ("document.getElementById('txtDOB').removeAttribute('readonly',0);");
		// WebElement date = driver.findElement(By.xpath("//input[@id='txtDOB']"));
		// date.click();
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("document.getElementById('txtDOB').value='04-09-2020'");

	}

	By rollno = By.id("txtBoardRoll");

	public WebElement RollNumber() {

		return driver.findElement(rollno);
	}

	By FatherName = By.id("txtFatherName");

	public WebElement FatherName() {
		return driver.findElement(FatherName);
	}

	By MobNo = By.id("txtMobNo");

	public WebElement MobNo() {
		return driver.findElement(MobNo);
	}

	By MotherName = By.id("txtMotherName");

	public WebElement MotherName() {
		return driver.findElement(MotherName);
	}

	By Address = By.id("txtAddress");

	public WebElement Address() {
		return driver.findElement(Address);
	}

	By Aadhar = By.id("txtAadhar");

	public WebElement IdentificationNumber() {
		return driver.findElement(Aadhar);
	}

	By Pincode = By.id("txtPincode");

	public WebElement Pincode() {
		return driver.findElement(Pincode);
	}

	By AlternateMobileNo = By.id("txtAlternateNo");

	public WebElement AlternateMobileNo() {
		return driver.findElement(AlternateMobileNo);
	}

	By next1 = By.xpath("//*[@id=\"btnBasicInfoNext\"]");

	public WebElement BasicInfoNext() {
		return driver.findElement(next1);
	}

	By ok1 = By.xpath("//input[@id='popup_ok']");

	public WebElement BasicInfoOK() {
		return driver.findElement(ok1);
	}

	By cancel1 = By.xpath("//input[@id='popup_cancel']");

	public WebElement BasicInfoCancel() {
		return driver.findElement(cancel1);
	}

	By Emailid = By.id("txtEMail");

	public WebElement Email() {
		return driver.findElement(Emailid);
	}

//ADDITIONAL DETAILS

	// Reservation details

	By st = By.xpath("//label[contains(text(),'ST')]");

	public WebElement ST() {
		return driver.findElement(st);
	}

	By sc = By.xpath("//label[contains(text(),'SC')]");

	public WebElement SC() {
		return driver.findElement(sc);
	}

	By obc = By.xpath("//label[contains(text(),'OBC')]");

	public WebElement OBC() {
		return driver.findElement(obc);
	}

	By sebc = By.xpath("//label[contains(text(),'SEBC')]");

	public WebElement SEBC() {
		return driver.findElement(sebc);
	}

	By general = By.xpath("//label[contains(text(),'General')]");

	public WebElement General() {
		return driver.findElement(general);
	}

	By phoh = By.xpath("//input[@id='chkPH']");

	public WebElement PWD() {
		return driver.findElement(phoh);
	}

	By esm = By.xpath("//label[contains(text(),'Ex-Service Man')]");

	public WebElement ExServiceMan() {
		return driver.findElement(esm);
	}

	By com = By.xpath("//label[contains(text(),'Children of Martyrs')]");

	public WebElement ChildrenofMartyrs() {
		return driver.findElement(com);
	}

	By sdp = By.xpath("//label[contains(text(),'Serving Defence Personnel')]");

	public WebElement ServingDefencePersonnel() {
		return driver.findElement(sdp);
	}

	By none = By.xpath("//label[contains(text(),'None of these')]");

	public WebElement Noneofthese() {
		return driver.findElement(none);
	}

	// Weightage Details

	By nccb = By.xpath("//input[@id='chkNCCB']");

	public WebElement NCCB() {
		return driver.findElement(nccb);
	}

	By nccc = By.xpath("//input[@id='chkNCCC']");

	public WebElement NCCC() {
		return driver.findElement(nccc);
	}

	By uc = By.xpath("//input[@id='chkNSSUC']");

	public WebElement NSSCampUniversityCategory() {
		return driver.findElement(uc);
	}

	By scat = By.xpath("//input[@id='chkNSSSC']");

	public WebElement NSSCampStateCategory() {
		return driver.findElement(scat);
	}

	By nl = By.xpath("//input[@id='chkNSSNL']");

	public WebElement NSSCampNationalLevel() {
		return driver.findElement(nl);
	}

	By il = By.xpath("//input[@id='chkNSSIL']");

	public WebElement NSSCampInternationalLevel() {
		return driver.findElement(il);
	}

	By rp = By.xpath("//input[@id='chkRP']");

	public WebElement RoverNRangerRajyaPuraskar() {
		return driver.findElement(rp);
	}

	By pr = By.xpath("//input[@id='chkPR']");

	public WebElement RoverNRangerPresidentRecognition() {
		return driver.findElement(pr);
	}

	By iu = By.xpath("//input[@id='chkIU']");

	public WebElement SportsInteruniversity() {
		return driver.findElement(iu);
	}

	By ssl = By.xpath("//input[@id='chkSL']");

	public WebElement SportsStateLevel() {
		return driver.findElement(ssl);
	}

	By nal = By.xpath("//input[@id='chkSGNL']");

	public WebElement SportsNationalLevel() {
		return driver.findElement(nal);
	}

	By sil = By.xpath("//input[@id='chkSGIL']");

	public WebElement SportsInternationalLevel() {
		return driver.findElement(sil);
	}

	By back = By.xpath("//input[@id='btnAdditionalDetailsBack']");

	public WebElement AdditionalDetailsBack() {
		return driver.findElement(back);
	}

	By next2 = By.xpath("//input[@id='btnAdditionalDetailsNext']");

	public WebElement AdditionalDetailsNext() {
		return driver.findElement(next2);
	}

	By ok2 = By.xpath("//input[@id='popup_ok']");

	public WebElement AdditionalDetailsOk() {
		return driver.findElement(ok2);
	}

	By cancel2 = By.xpath("//input[@id='popup_cancel']");

	public WebElement AdditionalDetailsCancel() {
		return driver.findElement(cancel2);
	}

//EDUCATIONAL DETAILS

	By pass = By.xpath("//span[@class='radio-item']//span//label[contains(text(),'Passed')]");

	public WebElement GraduationPassed() {
		return driver.findElement(pass);
	}

	By appeared = By.xpath("//span[@class='radio-item']//span//label[contains(text(),'Appeared')]");

	public WebElement GraduationAppeared() {
		return driver.findElement(appeared);
	}

	By yes = By.xpath("//div[@class='col-lg-3']//label[contains(text(),'Yes')]");

	public WebElement GraduationWithDistinction() {
		return driver.findElement(yes);
	}

	By no = By.xpath("//div[@class='col-lg-3']//label[contains(text(),'No')]");

	public WebElement GraduationWithoutDistinction() {
		return driver.findElement(no);
	}

	By TenthMarkType = By.id("ddl10thMarkType");

	public void TenthMarkType(String tenthmt) {
		Select tmt = new Select(driver.findElement(TenthMarkType));
		tmt.selectByVisibleText(tenthmt);
	}

	By TenthMaxMark = By.id("txt10thMaxMark");

	public WebElement TenthMaxMark() {
		return driver.findElement(TenthMaxMark);
	}

	By TenthSecuredMark = By.id("txt10thSecuredMark");

	public WebElement TenthSecuredMarksorCGPA() {
		return driver.findElement(TenthSecuredMark);
	}

	By PlusTwoStream = By.id("ddlPlusTwoStream");

	public void PlusTwoStream(String PlusTwoS) {
		Select pstr = new Select(driver.findElement(PlusTwoStream));
		pstr.selectByVisibleText(PlusTwoS);
	}

	By PlusTwoMarkType = By.id("ddlPlusTwoMarkType");

	public void PlusTwoMarkType(String PlusTwoM) {
		Select pmt = new Select(driver.findElement(PlusTwoMarkType));
		pmt.selectByVisibleText(PlusTwoM);
	}

	By PlusTwoBoard = By.id("ddlPlusTwoBoard");

	public void PlusTwoBoard(String plustwobaord) {
		Select ptb = new Select(driver.findElement(PlusTwoBoard));
		ptb.selectByVisibleText(plustwobaord);
	}

	By PlusTwoYOP = By.id("ddlPlusTwoYOP");

	public void PlusTwoYOP(String plustwoyop) {
		Select pyop = new Select(driver.findElement(PlusTwoYOP));
		pyop.selectByVisibleText(plustwoyop);
	}

	By PlusTwoRoll = By.id("txtPlusTwoRoll");

	public WebElement PlusTwoRollNo() {
		return driver.findElement(PlusTwoRoll);
	}

	By PlusTwoMaxMark = By.id("txtPlusTwoMaxMark");

	public WebElement PlusTwoMaxMark() {
		return driver.findElement(PlusTwoMaxMark);
	}

	By PlusTwoSecuredMark = By.id("txtPlusTwoSecuredMark");

	public WebElement PlusTwoSecuredMarksorCGPA() {
		return driver.findElement(PlusTwoSecuredMark);
	}

	By GraduationStream = By.id("ddlGraduationStream");

	public void GraduationStream(String grads) {
		Select gstr = new Select(driver.findElement(GraduationStream));
		gstr.selectByVisibleText(grads);
	}

	By GraduationMarkType = By.id("ddlGraduationMarkType");

	public void GraduationMarkType(String gradmt) {
		Select gmt = new Select(driver.findElement(GraduationMarkType));
		gmt.selectByVisibleText(gradmt);
	}

	By GraduationBoard = By.id("ddlGraduationBoard");

	public void GraduationBoard(String gradboard) {
		Select gb = new Select(driver.findElement(GraduationBoard));
		gb.selectByVisibleText(gradboard);
	}

	By GraduationYOP = By.id("ddlGraduationYOP");

	public void GraduationYOP(String gradyop) {
		Select gyop = new Select(driver.findElement(GraduationYOP));
		gyop.selectByVisibleText(gradyop);
	}

	By GraduateRoll = By.id("txtGraduationRoll");

	public WebElement GraduationRollNo() {
		return driver.findElement(GraduateRoll);
	}

	By GraduationMaxMark = By.id("txtGraduationMaxMark");

	public WebElement GraduationMaxMark() {
		return driver.findElement(GraduationMaxMark);
	}

	By GraduationSecuredMark = By.id("txtGraduationSecuredMark");

	public WebElement GraduationSecuredMarksorCGPA() {
		return driver.findElement(GraduationSecuredMark);
	}

	// Select Graduation Subject

	By GraduationHons = By.id("ddlGraduationHons"); // common for with honours or without honours/pass

	public void CoreorHons(String GHONS) {
		Select gh = new Select(driver.findElement(GraduationHons));
		gh.selectByVisibleText(GHONS);
	}

	By Graduationcredit = By.id("ddlCredit"); // common for with honours or without honours/pass

	public void CoreCredit(String corec) {
		Select cc = new Select(driver.findElement(Graduationcredit));
		cc.selectByVisibleText(corec);
	}

	By Elective1 = By.id("ddlGraduationElective1"); // common for with honours or without honours/pass

	public void Elective1orGenericElective(String el) {
		Select el1 = new Select(driver.findElement(Elective1));
		el1.selectByVisibleText(el);
	}

	By Elcredit1 = By.id("ddlElective1Credit"); // common for with honours or without honours/pass

	public void ElectiveCredit1(String elc) {
		Select ec = new Select(driver.findElement(Elcredit1));
		ec.selectByVisibleText(elc);
	}

	By Elective2 = By.id("ddlGraduationElective2"); // common for with honours or without honours/pass

	public void Elective2(String elt) {
		Select el2 = new Select(driver.findElement(Elective2));
		el2.selectByVisibleText(elt);
	}

	By Elcredit2 = By.id("ddlElective1Credit"); // common for with honours or without honours/pass

	public void ElectiveCredit2(String elc) {
		Select ec = new Select(driver.findElement(Elcredit2));
		ec.selectByVisibleText(elc);
	}

	By honours = By.xpath("//label[contains(text(),'Honours')]");

	public WebElement GraduationWithHonours() {
		return driver.findElement(honours);
	}

	By p = By.xpath(
			"//div[@id='divHonsPass']//div[@class='col-sm-8']//div[@class='row']//div[@class='col-lg-3']//span[@class='radio-item']//span//label[contains(text(),'Pass')]");

	public WebElement GraduationWithPass() {
		return driver.findElement(p);
	}

	// Select Subject(s) For PG Entrance Examination

	By PGEntranceSubject = By.id("ddlPGEntranceSubject");

	public void PGSubjectofAdmission(String PGEntrance) {
		Select pgsub = new Select(driver.findElement(PGEntranceSubject));
		pgsub.selectByVisibleText(PGEntrance);
	}

	By CPreference = By.id("ddlCPreference");

	public void CollegeorUniversityPreference(String CPPrefer) {
		Select cuni = new Select(driver.findElement(CPreference));
		cuni.selectByVisibleText(CPPrefer);
	}

	By add = By.xpath("//input[@id='btnADD']");

	public WebElement ADD() {
		return driver.findElement(add);
	}

	By delete = By.xpath("//*[@id=\"gvPGSubject\"]/tbody/tr[2]/td[8]/button");

	public WebElement Delete() {
		return driver.findElement(delete);
	}

	By SantaliCPreference = By.id("ddlCPreference"); // doubt

	public void SantaliCPreference(String SantaliCPPrefer) {
		Select board = new Select(driver.findElement(SantaliCPreference));
		board.selectByValue(SantaliCPPrefer);
	}

	By SantaliFirstPreference = By.id("ddlFirstPrefernce"); // doubt

	public void SantaliFirstPreference(String SantaliFPrefer) {
		Select board = new Select(driver.findElement(SantaliFirstPreference));
		board.selectByValue(SantaliFPrefer);
	}

	By GraduationHonss = By.id("ddlGraduationHons"); // common for with honours or without honours/pass

	public void CoreorHonsOther(int GHONS) {
		Select gh = new Select(driver.findElement(GraduationHons));
		gh.selectByIndex(GHONS);
	}

	By BiologyN = By.xpath("//*[@id=\"divBioChemestry\"]/div[2]/span[2]/span/label");

	public WebElement BiologyNo() {
		return driver.findElement(BiologyN);
	}

	By StudiedBiology = By.xpath("//*[@id=\"divBioChemestry\"]/div[2]/span[1]/span/label");

	public WebElement StudiedBiology() {
		return driver.findElement(StudiedBiology);
	}

	public void CollegeUniversity() {
		WebElement element = driver.findElement(By.id("ddlCPreference"));
		Select select = new Select(element);
		select.selectByValue("52");
	}

	// Preference Of Examination Centre

	By FirstPrefernce = By.id("ddlFirstPrefernce");

	public void FirstPreference(String FirstPrefer) {
		Select board = new Select(driver.findElement(FirstPrefernce));
		board.selectByVisibleText(FirstPrefer);
	}

	By SecondPrefernce = By.id("ddlSecondPrefernce");

	public void SecondPreference(String SecondPrefer) {
		Select board = new Select(driver.findElement(SecondPrefernce));
		board.selectByVisibleText(SecondPrefer);
	}

	By ThirdPrefernce = By.id("ddlThirdPrefernce");

	public void ThirdPreference(String ThirdPrefer) {
		Select board = new Select(driver.findElement(ThirdPrefernce));
		board.selectByVisibleText(ThirdPrefer);
	}

	// EducationalDetails

	By EducationalQualificationNext = By.id("btnEducationalQualificationNext");

	public WebElement EducationalQualificationNext1() {
		return driver.findElement(EducationalQualificationNext);
	}

	By Biotechnology = By.xpath("//*[@id=\"divBioChemestry\"]/div[2]/span[1]/span/label");

	public WebElement Biotechnology() {
		return driver.findElement(Biotechnology);
	}

	By Hons = By.xpath("//*[@id=\"divHonsPass\"]/div[2]/div/div[1]/span/span/label");// doubt

	public WebElement Hons1() {
		return driver.findElement(Hons);
	}

	By Stastics1 = By.xpath("//*[@id=\"PopulationStudies\"]/div[2]/span[1]/span/label");

	public WebElement StasticsYes() {
		return driver.findElement(Stastics1);
	}

	By Stastics2 = By.xpath("//*[@id=\"PopulationStudies\"]/div[2]/span[2]/span/label");

	public WebElement StasticsNo() {
		return driver.findElement(Stastics2);
	}

	By GraduationElective1 = By.id("ddlGraduationElective1");

	public void GraduationElective1(String GradEffective) {
		Select board = new Select(driver.findElement(GraduationElective1));
		board.selectByVisibleText(GradEffective);
	}

	By Credit = By.id("ddlCredit");

	public void Credit1(String Crd) {
		Select board = new Select(driver.findElement(Credit));
		board.selectByVisibleText(Crd);
	}

	By Elective1Credit = By.id("ddlElective1Credit");

	public void Elective1Credit1(String ECrd) {
		Select board = new Select(driver.findElement(Elective1Credit));
		board.selectByVisibleText(ECrd);
	}

	By back2 = By.xpath("//input[@id='btnEducationalQualificationBack']");

	public WebElement EducationalQualificationBack() {
		return driver.findElement(back2);
	}

	By next3 = By.xpath("//input[@id='btnEducationalQualificationNext']");

	public WebElement EducationalQualificationNext() {
		return driver.findElement(next3);
	}

	By ok3 = By.xpath("//input[@id='popup_ok']");

	public WebElement EducationalQualificationOk() {
		return driver.findElement(ok3);
	}

	By cancel3 = By.xpath("//input[@id='popup_cancel']");

	public WebElement EducationalQualificationCancel() {
		return driver.findElement(cancel3);
	}

	// Upload Details

	By Upload = By.id("upload");

	public WebElement UploadButton() {
		return driver.findElement(Upload);
	}

	public String grtmsg() {
		String msg = driver.switchTo().alert().getText();
		return msg;
	}

	By UploadNext = By.id("btnSubmit");

	public WebElement UploadNextButton() {
		return driver.findElement(UploadNext);
	}

	By Uploadok = By.xpath("//input[@id='popup_ok']");

	public WebElement UploadOkButton() {
		return driver.findElement(Uploadok);
	}

	public void JavaAcceptalert() {
		driver.switchTo().alert().accept();
	}

	public void BasicInformationDetails() throws InterruptedException {
		Thread.sleep(500);
		ApplicationFormButton().click();
		Thread.sleep(300);
		BoardName("BSE, Odisha");
		Thread.sleep(300);
		YearofPassing("2016");
		Thread.sleep(300);
		ExamTypeAsAnnual().click();
		Thread.sleep(300);
		RollNumber().clear();

		Thread.sleep(500);
		RollNumber().sendKeys("31TC168");
		Thread.sleep(300);
		BloodGroup("A+");
		Thread.sleep(300);
		ApplicantName().clear();
		Thread.sleep(1000);
		ApplicantName().sendKeys("Milan Singh");
		Thread.sleep(300);
		FatherName().clear();
		Thread.sleep(1000);
		FatherName().sendKeys("Rajendra Kumar Singh");
		Thread.sleep(300);
		MotherName().clear();
		Thread.sleep(300);
		MotherName().sendKeys("Sarojini Singh");
		Thread.sleep(300);
		Gender("FEMALE");
		Thread.sleep(300);
		Religion("HINDU");
		Thread.sleep(300);
		BirthDate();
		Thread.sleep(300);
		IdentificationType("Aadhaar");
		Thread.sleep(300);
		IdentificationNumber().clear();
		Thread.sleep(300);
		IdentificationNumber().sendKeys("761490617322");

		Thread.sleep(1000);
		StateofDomicile("ODISHA");
		Thread.sleep(1000);
		State("ODISHA");
		Thread.sleep(1000);
		District("KHURDA");
		Thread.sleep(1000);
		Block("BHUBANESWAR (MC)");
		Thread.sleep(1000);

		Pincode().clear();
		Thread.sleep(1000);
		Pincode().sendKeys("751010");
		Thread.sleep(1000);
		AlternateMobileNo().sendKeys("9437850045");
		Thread.sleep(1000);
		Address().clear();
		Thread.sleep(1000);
		Address().sendKeys("Bhubaneswar");
		Thread.sleep(1010);
		ApplicantName().sendKeys("Milan Singh");
		BasicInfoNext().click();

		Thread.sleep(1500);
		BasicInfoOK().click();
		Thread.sleep(1500);
	}

	public void AdditionalDetails() throws InterruptedException {
		Thread.sleep(500);
		General().click();
		Thread.sleep(500);
		Noneofthese().click();
		Thread.sleep(500);
		NCCB().click();
		Thread.sleep(500);
		AdditionalDetailsNext().click();
		Thread.sleep(500);
		AdditionalDetailsOk().click();
	}

	public void EducationalDetails() throws InterruptedException {
		Thread.sleep(500);
		GraduationPassed().click();

		Thread.sleep(500);

		GraduationWithDistinction().click();

		TenthMaxMark().clear();
		Thread.sleep(400);
		TenthMaxMark().sendKeys("600");
		Thread.sleep(400);
		TenthSecuredMarksorCGPA().clear();
		Thread.sleep(400);
		TenthSecuredMarksorCGPA().sendKeys("455");
		Thread.sleep(500);
		PlusTwoStream("Science");

		Thread.sleep(500);
		PlusTwoMarkType("MARK");

		Thread.sleep(500);
		PlusTwoBoard("CHSE, Odisha");

		Thread.sleep(500);
		PlusTwoYOP("2018");

		Thread.sleep(400);
		PlusTwoRollNo().clear();
		Thread.sleep(400);
		PlusTwoRollNo().sendKeys("41TC178");
		Thread.sleep(400);
		PlusTwoMaxMark().clear();
		Thread.sleep(400);
		PlusTwoMaxMark().sendKeys("600");
		Thread.sleep(400);
		PlusTwoSecuredMarksorCGPA().clear();
		Thread.sleep(400);
		PlusTwoSecuredMarksorCGPA().sendKeys("455");

		Thread.sleep(500);

		GraduationMarkType("MARK");
		Thread.sleep(500);

		GraduationBoard("Siksha ‘O’ Anusandhan University, Bhubaneswar");

		Thread.sleep(500);

		GraduationYOP("2021");

		Thread.sleep(400);
		GraduationRollNo().clear();
		Thread.sleep(400);
		GraduationRollNo().sendKeys("51TC678");

		Thread.sleep(400);
		GraduationMaxMark().clear();
		Thread.sleep(400);
		GraduationMaxMark().sendKeys("600");

		Thread.sleep(400);
		GraduationSecuredMarksorCGPA().clear();
		Thread.sleep(400);

		GraduationSecuredMarksorCGPA().sendKeys("275");

		Thread.sleep(400);
		GraduationStream("Arts");
		Thread.sleep(400);
		Select select = new Select(driver.findElement(By.id("ddlGraduationStream")));
		Thread.sleep(400);
		WebElement option = select.getFirstSelectedOption();
		Thread.sleep(400);
		String defaultItem = option.getText();
		Thread.sleep(400);

		System.out.println(defaultItem);

		Thread.sleep(300);
		Hons1().click();

		Thread.sleep(300);

		CoreorHons("Sociology");

		Thread.sleep(300);
		GraduationElective1("Hindi");

		Thread.sleep(300);
		Credit1("84");
		Thread.sleep(300);
		Elective1Credit1("24");

		Thread.sleep(400);
		PGSubjectofAdmission("Population Studies");

		Thread.sleep(400);

		CollegeorUniversityPreference("Fakir Mohan University, Vyasa Vihar, Balasore");

		Thread.sleep(400);
		FirstPreference("Berhampur University, Bhanja Vihar, Berhampur");
		Thread.sleep(400);

		SecondPreference("Bhadrak (Autonomous) College,Bhadrak");
		Thread.sleep(400);
		ThirdPreference("Dharanidhar (Autonomous) College, Keonjhar");
		Thread.sleep(400);

		ADD().click();
		Thread.sleep(400);

		EducationalQualificationNext1().click();
		Thread.sleep(400);
		EducationalQualificationOk().click();
	}

	public void UploadImage() {
		String mainWindowTitle = driver.getTitle();
		System.out.println("Length of main window title  :" + mainWindowTitle.length());
		String mainWindowName = driver.getWindowHandle();
		System.out.println("Main Window Title : " + mainWindowTitle);
		System.out.println("Main Window Name : " + mainWindowName);

		driver.findElement(By.id("lblphototext")).click();

		Set<String> windows = driver.getWindowHandles();
		for (String w : windows) {
			driver.switchTo().window(w);

			if (driver.getCurrentUrl()
					.equalsIgnoreCase("http://117.245.133.165/SAMS_PG/ManageStudent/UploadPopUp.aspx")) {
				driver.findElement(By.xpath("//*[@id='imgUpload']")).sendKeys("D:\\Image\\Milan.JPG");

				driver.findElement(By.name("upload")).click();

				driver.findElement(By.xpath("//*[@id=\"form1\"]/div[3]/table/tbody/tr[5]/td/input[1]")).click();
			}
		}
		driver.switchTo().window(mainWindowName);

	}

	public void PDFUploadImage() {
		String mainWindowTitle = driver.getTitle();
		System.out.println("Length of main window title  :" + mainWindowTitle.length());
		String mainWindowName = driver.getWindowHandle();
		System.out.println("Main Window Title : " + mainWindowTitle);
		System.out.println("Main Window Name : " + mainWindowName);

		driver.findElement(By.id("lblphototext")).click();

		Set<String> windows = driver.getWindowHandles();
		for (String w : windows) {
			driver.switchTo().window(w);

			if (driver.getCurrentUrl()
					.equalsIgnoreCase("http://117.245.133.165/SAMS_PG/ManageStudent/UploadPopUp.aspx")) {
				driver.findElement(By.id("imgUpload")).sendKeys("C:\\Users\\user\\Desktop\\1.jpg");

			}
		}

	}

	By ok = By.xpath("//input[@id='popup_ok']");

	public WebElement PopUpOK() {
		return driver.findElement(ok);
	}

}
