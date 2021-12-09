package com.PG.objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class PGCAF {

	WebDriver driver;

	public PGCAF(WebDriver driver) {

		this.driver = driver;
	}

	By applBtn = By.xpath("//span[contains(text(),'Application Form')]");

	public WebElement ApplicationFormButton() {
		return driver.findElement(applBtn);
	}

//	@FindBy(xpath = "//*[@id=\"leftmenu_liCAF\"]/a") 
//	private WebElement afl;
//	
//	public WebElement ApplicationFormLink() {
//		return afl;
//	}

	// BASIC INFORMATION

	@FindBy(id = "ddlBoard")
	private WebElement boardname;

	public void BoardName(String bname) {
		Select board = new Select(boardname);
		board.selectByVisibleText(bname);
	}

	@FindBy(id = "ddlYOP")
	private WebElement yearofpassing;

	public void YearofPassing(String yop) {
		Select y2 = new Select(yearofpassing);
		y2.selectByVisibleText(yop);
	}

	@FindBy(xpath = "//label[contains(text(),'Annual')]")
	private WebElement annual;

	public WebElement ExamTypeAsAnnual() {
		return annual;
	}

	@FindBy(xpath = "//label[contains(text(),'Supplementary')]")
	private WebElement supplementary;

	public WebElement ExamTypeAsSupplementary() {
		return supplementary;
	}

	@FindBy(id = "txtBoardRoll")
	private WebElement rollno;

	public WebElement RollNumber() {
		return rollno;
	}

	@FindBy(id = "txtApplName")
	private WebElement appname;

	public WebElement ApplicantName() {
		return appname;
	}

	@FindBy(id = "txtFatherName")
	private WebElement fathername;

	public WebElement FatherName() {
		return fathername;
	}

	@FindBy(id = "txtMotherName")
	private WebElement mothername;

	public WebElement MotherName() {
		return mothername;
	}

	// Personal Details

	@FindBy(id = "ddlBloodGroup")
	private WebElement BG;

	public void BloodGroup(String bld) {
		Select bg = new Select(BG);
		bg.selectByVisibleText(bld);
	}

	@FindBy(id = "ddlGender")
	private WebElement gender;

	public void Gender(String gen) {
		Select g = new Select(gender);
		g.selectByVisibleText(gen);
	}

	@FindBy(id = "ddlReligion")
	private WebElement religion;

	public void Religion(String rel) {
		Select r = new Select(religion);
		r.selectByVisibleText(rel);
	}

	@FindBy(id = "txtDOB")
	private WebElement dob;

	public WebElement DateofBirth() {
		return dob;
	}

	// Identification Details

	@FindBy(id = "ddlIDType")
	private WebElement ID;

	public void IdentificationType(String idt) {
		Select i = new Select(ID);
		i.selectByVisibleText(idt);
	}

	@FindBy(id = "txtAadhar")
	private WebElement IDN;

	public WebElement IdentificationNumber() {
		return IDN;
	}

	@FindBy(id = "ddlDomicile")
	private WebElement domicile;

	public void StateofDomicile(String sdom) {
		Select dom = new Select(domicile);
		dom.selectByVisibleText(sdom);
	}

	// Address for Correspondence

	@FindBy(id = "ddlState")
	private WebElement state;

	public void State(String selectstate) {
		Select s = new Select(state);
		s.selectByVisibleText(selectstate);
	}

	@FindBy(id = "ddlDist")
	private WebElement district;

	public void District(String selectdistrict) {
		Select d = new Select(district);
		d.selectByVisibleText(selectdistrict);
	}

	@FindBy(id = "ddlBlock")
	private WebElement block;

	public void Block(String selectblock) {
		Select b = new Select(block);
		b.selectByVisibleText(selectblock);
	}

	@FindBy(id = "txtAddress")
	private WebElement address;

	public WebElement Address() {
		return address;
	}

	@FindBy(id = "txtPincode")
	private WebElement pin;

	public WebElement Pincode() {
		return pin;
	}

	@FindBy(id = "txtEMail")
	private WebElement smail;

	public WebElement StudentMail() {
		return smail;
	}

	@FindBy(id = "txtMobNo")
	private WebElement smobno;

	public WebElement StudentMobileNo() {
		return smobno;
	}

	@FindBy(id = "txtAlternateNo")
	private WebElement altmobno;

	public WebElement AlternateMobileNo() {
		return altmobno;
	}

	@FindBy(xpath = "//*[@id=\"btnBasicInfoNext\"]")
	private WebElement next1;

	public WebElement Next1() {
		return next1;
	}

	@FindBy(xpath = "//input[@id='popup_ok']")
	private WebElement ok1;

	public WebElement OK1() {
		return ok1;
	}

	@FindBy(xpath = "//input[@id='popup_cancel']")
	private WebElement cancel1;

	public WebElement Cancel1() {
		return cancel1;
	}

	// ADDITIONAL DETAILS

	@FindBy(xpath = "//label[contains(text(),'ST')]")
	private WebElement st;

	public WebElement ST() {
		return st;
	}

	@FindBy(xpath = "//label[contains(text(),'SC')]")
	private WebElement sc;

	public WebElement SC() {
		return sc;
	}

	@FindBy(xpath = "//label[contains(text(),'OBC')]")
	private WebElement obc;

	public WebElement OBC() {
		return obc;
	}

	@FindBy(xpath = "//label[contains(text(),'SEBC')]")
	private WebElement sebc;

	public WebElement SEBC() {
		return sebc;
	}

	@FindBy(xpath = "//label[contains(text(),'General')]")
	private WebElement general;

	public WebElement General() {
		return general;
	}

	@FindBy(xpath = "//input[@id='chkPH']")
	private WebElement phoh;

	public WebElement PWD() {
		return phoh;
	}

	@FindBy(xpath = "//label[contains(text(),'Ex-Service Man')]")
	private WebElement esm;

	public WebElement ExServiceMan() {
		return esm;
	}

	@FindBy(xpath = "//label[contains(text(),'Children of Martyrs')]")
	private WebElement com;

	public WebElement ChildrenofMartyrs() {
		return com;
	}

	@FindBy(xpath = "//label[contains(text(),'Serving Defence Personnel')]")
	private WebElement sdp;

	public WebElement ServingDefencePersonnel() {
		return sdp;
	}

	@FindBy(xpath = "//label[contains(text(),'None of these')]")
	private WebElement none;

	public WebElement Noneofthese() {
		return none;
	}

	@FindBy(xpath = "//input[@id='chkNCCB']")
	private WebElement nccb;

	public WebElement NCCB() {
		return nccb;
	}

	@FindBy(xpath = "//input[@id='chkNCCC']")
	private WebElement nccc;

	public WebElement NCCC() {
		return nccc;
	}

	@FindBy(xpath = "chkSports")
	private WebElement sports;

	public WebElement Sports() {
		return sports;
	}

	@FindBy(xpath = "//input[@id='chkNSSUC']")
	private WebElement uc;

	public WebElement UniversityCategory() {
		return uc;
	}

	@FindBy(xpath = "//input[@id='chkNSSSC']")
	private WebElement scat;

	public WebElement StateCategory() {
		return scat;
	}

	@FindBy(xpath = "//input[@id='chkNSSNL']")
	private WebElement nl;

	public WebElement NationalLevel() {
		return nl;
	}

	@FindBy(xpath = "//input[@id='chkNSSIL']")
	private WebElement il;

	public WebElement InternationalLevel() {
		return il;
	}

	@FindBy(xpath = "//input[@id='chkRP']")
	private WebElement rp;

	public WebElement RajyaPuraskar() {
		return rp;
	}

	@FindBy(xpath = "//input[@id='chkPR']")
	private WebElement pr;

	public WebElement PresidentRecognition() {
		return pr;
	}

	@FindBy(xpath = "//input[@id='chkSL']")
	private WebElement sl;

	public WebElement SportsStateLevel() {
		return sl;
	}

	@FindBy(xpath = "//input[@id='chkSGNL']")
	private WebElement nal;

	public WebElement SportsNationalLevel() {
		return nal;
	}

	@FindBy(xpath = "//input[@id='chkSGIL']")
	private WebElement sil;

	public WebElement SportsInternationalLevel() {
		return sil;
	}

	@FindBy(xpath = "//input[@id='btnAdditionalDetailsBack']")
	private WebElement back;

	public WebElement Back1() {
		return back;
	}

	@FindBy(xpath = "//input[@id='btnAdditionalDetailsNext']")
	private WebElement nxt;

	public WebElement Next2() {
		return nxt;
	}

	@FindBy(xpath = "//input[@id='popup_ok']")
	private WebElement ok2;

	public WebElement Ok2() {
		return ok2;
	}

	@FindBy(xpath = "//input[@id='popup_cancel']")
	private WebElement can2;

	public WebElement Cancel2() {
		return can2;
	}

	// EDUCATIONAL QUALIFICATION

	@FindBy(xpath = "//span[@class='radio-item']//span//label[contains(text(),'Passed')]")
	private WebElement passed;

	public WebElement Passed() {
		return passed;
	}

	@FindBy(xpath = "//span[@class='radio-item']//span//label[contains(text(),'Appeared')]")
	private WebElement appeared;

	public WebElement Appeared() {
		return appeared;
	}

	@FindBy(xpath = "//div[@class='col-lg-3']//label[contains(text(),'Yes')]")
	private WebElement disy;

	public WebElement DistinctionYes() {
		return disy;
	}

	@FindBy(xpath = "//div[@class='col-lg-3']//label[contains(text(),'No')]")
	private WebElement disn;

	public WebElement DistinctionNo() {
		return disn;
	}

	@FindBy(id = "ddl10thMarkType")
	private WebElement tenthmt;

	public void TenthMarkType(String tmt) {
		Select mt1 = new Select(tenthmt);
		mt1.selectByVisibleText(tmt);
	}

	@FindBy(id = "txt10thMaxMark")
	private WebElement tmaxmarks;

	public WebElement TenthMaxMarks() {
		return tmaxmarks;
	}

	@FindBy(id = "txt10thSecuredMark")
	private WebElement tsecmarks;

	public WebElement TenthSecuredMarksorCGPA() {
		return tsecmarks;
	}

	@FindBy(id = "ddlPlusTwoStream")
	private WebElement tstream;

	public void PlusTwoStream(String ts) {
		Select ts1 = new Select(tstream);
		ts1.selectByVisibleText(ts);
	}

	@FindBy(id = "ddlPlusTwoMarkType")
	private WebElement ptmt;

	public void PlusTwoMarkType(String pmt) {
		Select mt2 = new Select(ptmt);
		mt2.selectByVisibleText(pmt);
	}

	@FindBy(id = "ddlPlusTwoBoard")
	private WebElement brd;

	public void PlusTwoBoard(String board) {
		Select br = new Select(brd);
		br.selectByVisibleText(board);
	}

	@FindBy(id = "ddlPlusTwoYOP")
	private WebElement pyop;

	public void PlusTwoYOP(String plustwoyop) {
		Select p = new Select(pyop);
		p.selectByVisibleText(plustwoyop);
	}

	@FindBy(id = "txtPlusTwoRoll")
	private WebElement prno;

	public WebElement PlusTwoRollNo() {
		return prno;
	}

	@FindBy(id = "txtPlusTwoMaxMark")
	private WebElement pmaxmarks;

	public WebElement PlusTwoMaxMarks() {
		return pmaxmarks;
	}

	@FindBy(id = "txtPlusTwoSecuredMark")
	private WebElement psecmarks;

	public WebElement PlusTwoSecuredMarksorCGPA() {
		return psecmarks;
	}

	@FindBy(id = "ddlGraduationStream")
	private WebElement gstream;

	public void GraduationStream(String gs) {
		Select gs1 = new Select(gstream);
		gs1.selectByVisibleText(gs);
	}

	@FindBy(id = "ddlGraduationMarkType")
	private WebElement gtmt;

	public void GraduationMarkType(String gmt) {
		Select mt2 = new Select(gtmt);
		mt2.selectByVisibleText(gmt);
	}

	@FindBy(id = "ddlGraduationBoard")
	private WebElement university;

	public void GraduationUniversity(String uni) {
		Select u = new Select(university);
		u.selectByVisibleText(uni);
	}

	@FindBy(id = "ddlGraduationYOP")
	private WebElement gyop;

	public void GraduationYOP(String gradyop) {
		Select g = new Select(gyop);
		g.selectByVisibleText(gradyop);
	}

	@FindBy(id = "txtGraduationRoll")
	private WebElement gno;

	public WebElement GraduationRollNo() {
		return gno;
	}

	@FindBy(id = "txtPlusTwoMaxMark")
	private WebElement gmaxmarks;

	public WebElement GraduationMaxMarks() {
		return gmaxmarks;
	}

	@FindBy(id = "txtPlusTwoSecuredMark")
	private WebElement gsecmarks;

	public WebElement GraduationSecuredMarksorCGPA() {
		return gsecmarks;
	}

	// Select Graduation Subject

	@FindBy(xpath = "//label[contains(text(),'Honours')]")
	private WebElement honours;

	public WebElement Honours() {
		return honours;
	}

	@FindBy(id = "ddlGraduationHons")
	private WebElement core;

	public void CoreorHonours(String hon) {
		Select h = new Select(core);
		h.selectByVisibleText(hon);
	}

	@FindBy(id = "ddlCredit")
	private WebElement credit1;

	public void HonoursCredit(String cr) {
		Select c1 = new Select(credit1);
		c1.selectByVisibleText(cr);
	}

	@FindBy(id = "ddlGraduationElective1")
	private WebElement Genel;

	public void GeneralElective(String ge) {
		Select h1 = new Select(Genel);
		h1.selectByVisibleText(ge);
	}

	@FindBy(id = "ddlElective1Credit")
	private WebElement credit2;

	public void ElectiveCredit(String gcr) {
		Select c2 = new Select(credit2);
		c2.selectByVisibleText(gcr);
	}

	@FindBy(xpath = "//div[@id='divHonsPass']//div[@class='col-sm-8']//div[@class='row']//div[@class='col-lg-3']//span[@class='radio-item']//span//label[contains(text(),'Pass')]")
	private WebElement pass;

	public WebElement Pass() {
		return pass;
	}

	@FindBy(id = "ddlGraduationElective2")
	private WebElement ele;

	public void Elective2(String el) {
		Select h2 = new Select(ele);
		h2.selectByVisibleText(el);
	}

	@FindBy(id = "ddlElective2Credit")
	private WebElement credit3;

	public void ElectiveCredit2(String gcr1) {
		Select c3 = new Select(credit3);
		c3.selectByVisibleText(gcr1);
	}

	// Select Subject(s) For PG Entrance Examination

	@FindBy(id = "ddlPGEntranceSubject")
	private WebElement pgsub;

	public void PGSubjectofAdmission(String psub) {
		Select pg = new Select(pgsub);
		pg.selectByVisibleText(psub);
	}

	@FindBy(id = "ddlCPreference")
	private WebElement cu;

	public void CollegeorUniversityPreference(String col) {
		Select cuni = new Select(cu);
		cuni.selectByVisibleText(col);
	}

	@FindBy(xpath = "//input[@id='btnADD']")
	private WebElement add;

	public WebElement ADD() {
		return add;
	}

	@FindBy(xpath = "//*[@id=\"gvPGSubject\"]/tbody/tr[2]/td[8]/button")
	private WebElement delete;

	public WebElement Delete() {
		return delete;
	}

	// Preference Of Examination Centre

	@FindBy(id = "ddlFirstPrefernce")
	private WebElement uni1;

	public void UniversityorCollegeName1(String col1) {
		Select cuni1 = new Select(uni1);
		cuni1.selectByVisibleText(col1);
	}

	@FindBy(id = "ddlSecondPrefernce")
	private WebElement uni2;

	public void UniversityorCollegeName2(String col2) {
		Select cuni2 = new Select(uni2);
		cuni2.selectByVisibleText(col2);
	}

	@FindBy(id = "ddlThirdPrefernce")
	private WebElement uni3;

	public void UniversityorCollegeName3(String col3) {
		Select cuni3 = new Select(uni3);
		cuni3.selectByVisibleText(col3);
	}

	@FindBy(xpath = "//input[@id='btnEducationalQualificationBack']")
	private WebElement back2;

	public WebElement Back2() {
		return back2;
	}

	@FindBy(xpath = "//input[@id='btnEducationalQualificationNext']")
	private WebElement nxt3;

	public WebElement Next3() {
		return nxt3;
	}

	@FindBy(xpath = "//input[@id='popup_ok']")
	private WebElement ok3;

	public WebElement Ok3() {
		return ok3;
	}

	@FindBy(xpath = "//input[@id='popup_cancel']")
	private WebElement can3;

	public WebElement Cancel3() {
		return can3;
	}

}
