package com.ecom.project.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.ecom.project.base.SetUp;
import com.ecom.project.utility.Dd;

public class Index extends SetUp{
	
	
	//1. constructor 
	//2. FindWebElements
	//3. Actions 
	
	public Index()
	{
		PageFactory.initElements(driver,this);
	}
	
	
	
	/** Find WebElements /OR(object repo)*/
	
//WebElement currencyDd=driver.findElement(By.xpath("//select[@id='customerCurrency']");
	
	
	@FindBy(xpath="//select[@id='customerCurrency']")
	WebElement currencyDd;
	
	@FindBy(xpath="//a[normalize-space()='Sitemap']")
	WebElement siteMap;
	
	@FindBy(xpath="//a[normalize-space()='Shipping & returns']")
	WebElement shipReturns;
	
	
	
	//Actions realted to the webElemets 
	
	public void changeCurrency()
	{

      Dd.selectByVtest(currencyDd, "Euro");  //generic Methods 
	}
	
	public void checkSiteMapPage()
	{
		siteMap.click();
		
	}
	
	public void clickOnShipAndReturn()
	{
		shipReturns.click();
	}
	
	

}
