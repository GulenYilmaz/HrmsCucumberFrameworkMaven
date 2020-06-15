package com.hrms.testbase;


import com.hrms.pages.AddEmployeePageElements;
import com.hrms.pages.AwesomeGroup__US9__AdminLanguagePageElements;
import com.hrms.pages.DashboardPageElements;
import com.hrms.pages.LoginPageElements;
import com.hrms.pages.PersonalDetailsPageElements;
import com.hrms.pages.SauceDemoLoginPage;
import com.hrms.pages.ViewEmployeePageElements;

//initializes all pages class and stores references in static varibales
//that will called/used in test classes
public class PageInitializer extends BaseClass{

	public static LoginPageElements login;
	public static AddEmployeePageElements addEmp;
	public static DashboardPageElements dashboard;
	public static PersonalDetailsPageElements pdetails;
	public static ViewEmployeePageElements viewEmp;
	public static SauceDemoLoginPage sauceLogin;
	public static AwesomeGroup__US9__AdminLanguagePageElements language;
	public static void initialize() {
		
		login=new LoginPageElements();
		dashboard=new DashboardPageElements();
		addEmp=new AddEmployeePageElements();
		pdetails=new PersonalDetailsPageElements();
		viewEmp=new ViewEmployeePageElements();
		sauceLogin=new SauceDemoLoginPage();
		language=new AwesomeGroup__US9__AdminLanguagePageElements();
	}
}