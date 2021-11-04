package Demoqa.Paginas;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Demoqa.Steps.Botones;

public class DatePicker {

	
	private WebDriver driver;
	private Botones botones = new Botones (driver);
	
	public DatePicker(WebDriver driver) {	

		PageFactory.initElements(driver, this);
		this.driver = driver;
		this.botones =new Botones(driver);
}

	@FindBy(how = How.CSS, using = "div.icon > svg")
	private WebElement Elements;
		
	@FindBy(how = How.XPATH, using = "//div[contains(text(),'Widgets')]")
	private WebElement Widgets;
			
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Date Picker')]")
	private WebElement DatePicker;
	
	@FindBy(how = How.XPATH, using = "//input[@id='datePickerMonthYearInput']")
	private WebElement SelectDate;

	@FindBy(how = How.XPATH, using = "//input[@id='dateAndTimePickerInput']")
	private WebElement DateTime;
	
	@FindBy(how = How.XPATH, using = "//div[contains(text(),'11')]")
	private WebElement Fecha;
	
	@FindBy(how = How.XPATH, using = "//li[normalize-space()='00:00']")
	private WebElement Time;

	@FindBy(how = How.XPATH, using = "//ul[@class='react-datepicker__time-list']")
	private WebElement Time1;
		
	
	@Test
	public  void  Date  () throws Throwable   {	
		
		Elements.click();
		botones.scrollBajar();		
		Widgets.click();		
		DatePicker.click();
		SelectDate.click();
		Fecha.click();
		DateTime.click();
		Actions action = new Actions(driver);
		action.moveToElement(Fecha).click().perform();
		Fecha.click();
		Time.click();
		//Select drpCountry = new Select(Time1);
		//drpCountry.selectByVisibleText("10:00");
	}
	
	
}
