package com.hrms.pages;


import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.testbase.BaseClass;

public class ViewEmployeePageElements {

	@FindBy(id = "empsearch_employee_name_empName")
	public WebElement empName;

	@FindBy(id = "empsearch_id")
	public WebElement empID;

	@FindBy(id = "searchBtn")
	public WebElement searchBtn;
	
	@FindBy(xpath="//table[@id='resultTable']/tbody/tr/td[3]")
	public WebElement awesome;
	
	
	@FindBy(xpath="(//a[text()='Qualifications'])[2]")
	public WebElement qualification;
	
	@FindBy(id="addLanguage")
	public WebElement languageADD;
	
	@FindBy(xpath="//select[@id='language_code']")
	public WebElement selectLanguage;
	
	@FindBy(xpath="//input[@id='btnLanguageSave']")
	public WebElement saveSelect;
	
	
	@FindBy(xpath="//select[@id='language_lang_type']")
	public WebElement selectFluency;
	
	@FindBy(xpath="//select[@id='language_competency']")
	public WebElement selectCompetency;
	
	@FindBy(xpath="//table[@id='lang_data_table']/tbody/tr")
	public  List<WebElement> LanguagesTable;
	
	@FindBy(xpath="//table[@id='lang_data_table']/tbody/tr[3]/td[2]")
	public  WebElement LanguagesTurkcee;
	
	@FindBy(xpath="//table[@id='recordsListTable']/tbody/tr/td/a")
	public List<WebElement> languageList;
	

	public ViewEmployeePageElements() {
		PageFactory.initElements(BaseClass.driver, this);
		
		
	}
}