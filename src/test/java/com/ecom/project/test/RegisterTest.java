package com.ecom.project.test;

import org.testng.annotations.Test;

import com.ecom.project.base.SetUp;
import com.ecom.project.pages.Register;

public class RegisterTest extends SetUp{
	
	Register obj1;
	
	RegisterTest() {
		intilization();      //    open chrome and url 
		obj1=new Register();
	}
	
	
	@Test(priority=1)
	public void clickOnRegister() 
	{
		obj1.clickOnRegister();
	}
	
	
	/** @author Vishali -K ,, call those methods which you have created in Register Page*/
     /** also give prioriy -->2,,3 */
	
	@Test(priority=2)
	public void clickOnVerifyGenderFemale()
	{
		
		obj1.clickOnGenderFemale();
	}
	
	@Test(priority=3)
	public void fname()
	{
		obj1.inputFname();
	
	}
	
	@Test(priority=4)
	public void lname()
	{
		obj1.inputLname();
	
	}
	
	@Test(priority=5)
	public void checkDay()
	{
		obj1.clickDay();
	}
	
	@Test(priority=6)
	public void checkMonth()
	{
		obj1.clickMonth();
	}
	
	@Test(priority=7)
	public void checkYear() 
	{
		obj1.clickYear();
	}
	
	@Test(priority=8)
	public void checkOnEmail() 
	{
		obj1.inputEmail();
	}
	
	@Test(priority=9)
	public void checkOnCompany() 
	{
		obj1.inputCompany();
	}
	
	@Test(priority=10)
	public void checkOnCheckBox() 
	{
		obj1.clickOnCheckBox();
	}
	
	@Test(priority=11)
	public void password() 
	{
		obj1.inputPassword();
	}
	
	@Test(priority=12)
	public void checkOnConfirmPass() 
	{
		obj1.inputConfirmPass();
	}

}
