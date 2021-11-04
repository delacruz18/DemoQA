package Demoqa.Paginas;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Demoqa.Steps.Botones;

public class AlertsFrame {
	
	private WebDriver driver;
	private Botones botones = new Botones (driver);
	
	public AlertsFrame(WebDriver driver) {	

		PageFactory.initElements(driver, this);
		this.driver = driver;
		this.botones =new Botones(driver);
		}
	
	
	
	@FindBy(how = How.CSS, using = "div.icon > svg")
	private WebElement Elements;
	
	
	
	@FindBy(how = How.XPATH, using = "//div[contains(text(),'Alerts, Frame & Windows')]")
	private WebElement AlertsFrameW;
	
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Alerts')]")
	private WebElement Alerts;
	
	@FindBy(how = How.XPATH, using = "//button[@id='alertButton']")
	private WebElement SeeAlert;
	
	@FindBy(how = How.XPATH, using = "//button[@id='timerAlertButton']")
	private WebElement CincoAlert;
	
	@FindBy(how = How.XPATH, using = "//button[@id='confirmButton']")
	private WebElement confirmAlert;
	
	@FindBy(how = How.XPATH, using = "//button[@id='promtButton']")
	private WebElement promptAlert;
	
	
	 
	
	@Test
	public  void  Alerts  () throws Throwable   {	
		
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		Elements.click();
		botones.scrollBajar();
		int tamaño = driver.findElements (By.tagName ("iframe")). size ();
	    System.out.println ("Cuadros totales " + tamaño);
		wait.until(ExpectedConditions.elementToBeClickable(AlertsFrameW));
		AlertsFrameW.click();
		Alerts.click();
		SeeAlert.click();		
		botones.Alerta();				
		CincoAlert.click();
		botones.Alerta();
		confirmAlert.click();
		botones.Alerta();	
		promptAlert.click();	
		botones.Alerta();	
		
		
	}
	
}
