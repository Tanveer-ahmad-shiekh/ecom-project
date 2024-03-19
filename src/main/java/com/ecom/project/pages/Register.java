package com.ecom.project.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ecom.project.base.SetUp;
import com.ecom.project.utility.Dd;

public class Register extends SetUp {
	
	//1. Constructor 
	
	public Register()
	{
		PageFactory.initElements(driver,this);
	}
   
	
	//WebElements 
	@FindBy(xpath="//a[@class='ico-register']")
	WebElement Register;
	
	/** @author Vishali - K*/
	
	//1. Find element Gender(radio)--> click , for input--->send Keys
	
	@FindBy(xpath="//input[@id='gender-female']")
	WebElement genFemale;
	
	@FindBy(xpath="//input[@id='FirstName']")
	WebElement fname;
	
	@FindBy(xpath="//input[@id='LastName']")
	WebElement lname;
	
	@FindBy(xpath="//select[@name='DateOfBirthDay']")
	WebElement BirthDay;
	
	@FindBy(xpath="//select[@name='DateOfBirthMonth']")
	WebElement BirthMonth;
	
	@FindBy(xpath="//select[@name='DateOfBirthYear']")
	WebElement BirthYear;
	
	@FindBy(xpath="//input[@id='Email']")
	WebElement email;
	
	@FindBy(xpath="//input[@id='Company']")
	WebElement company;
	
	@FindBy(xpath="//input[@type='checkbox']")
	WebElement checkbox;
	
	@FindBy(xpath="//input[@id='Password']")
	WebElement pass;
	
	@FindBy(xpath="//input[@id='ConfirmPassword']")
	WebElement confPass;
	
	//Actions 
	public void clickOnRegister()
	{
		Register.click();
	}
	
	public void clickOnGenderFemale()
	{
		genFemale.click();
	}
	
	public void  inputFname()
	{
		fname.sendKeys("vishali");
	}
	
	public void  inputLname()
	{
		lname.sendKeys("K");
	}
	
	public void clickDay()
	{
		Dd.selectDayByIndex(BirthDay);
	}
	
	public void clickMonth()
	{
		Dd.selectMonthByIndex(BirthMonth);
	}
	
	public void clickYear()
	{
		Dd.selectYearByVtest(BirthYear,"1998");
	}
	
	public void inputEmail()
	{
		email.sendKeys("vishalik0398@gmail.com");
	}
	
	public void inputCompany()
	{
		company.sendKeys("ABC Company");
	}
	
	public void clickOnCheckBox()
	{
		 checkbox.isSelected();
	}
	
	public void  inputPassword()
	{
		pass.sendKeys("password1");
	}
	
	public void  inputConfirmPass()
	{
		confPass.sendKeys("password1");
	}
	
}
