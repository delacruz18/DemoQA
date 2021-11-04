package Demoqa.Paginas;

import java.io.IOException;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Demoqa.Steps.Utility;
import Demoqa.Steps.Botones;

public class WebElements {

	
	
	private WebDriver driver;
	private Botones botones = new Botones (driver);
	
	
	
	public WebElements(WebDriver driver) {

		PageFactory.initElements(driver, this);
		this.driver = driver;
		this.botones =new Botones(driver);
		
		
}

	
	
	@FindBy(how = How.ID, using = "item-3")
	private WebElement WebTables;	
		
	@FindBy(how = How.ID, using = "addNewRecordButton")
	private WebElement Add;	
		
	@FindBy(how = How.ID, using = "firstName")
	private WebElement Nombre;	
	
	@FindBy(how = How.ID, using = "lastName")
	private WebElement Apellido;	
	
	@FindBy(how = How.ID, using = "userEmail")
	private WebElement Email;	
	
	@FindBy(how = How.ID, using = "age")
	private WebElement Edad;	
	
	@FindBy(how = How.ID, using = "salary")
	private WebElement Salario;	
	
	@FindBy(how = How.ID, using = "department")
	private WebElement Department;	
		
	@FindBy(how = How.XPATH, using = "//div[2]/div[3]/div/div")
	private WebElement Tabla;
	
	@FindBy(how = How.ID, using = "searchBox")
	private WebElement Buscar;
		
	@FindBy(how = How.ID, using = "delete-record-3")
	private WebElement Borrar;
	
	
	
	
	@Test
	public  void  TablasWeb () throws Throwable   {	
		
		WebDriverWait wait = new WebDriverWait(driver,10);		
		driver.switchTo().defaultContent();
		botones.scrollBajar();
		WebTables.click();	
		Actions action = new Actions(driver);
		action.moveToElement(Add).click().perform();	   				  
	}
	
	
	
	
	@FindBy(how = How.ID, using = "submit")
	private WebElement Enviar;	
	
	@Test
	public void CrearRegisto() throws IOException {
		
				
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.elementToBeClickable(Nombre));		
		Nombre.sendKeys(Utility.locatorValues("FirstName"));
		Apellido.sendKeys(Utility.locatorValues("LastName"));
		Email.sendKeys(Utility.locatorValues("Email"));
		Edad.sendKeys(Utility.locatorValues("Age"));
		Salario.sendKeys(Utility.locatorValues("Salary"));
		Department.sendKeys(Utility.locatorValues("Department"));
		wait.until(ExpectedConditions.elementToBeClickable(Enviar));
		Enviar.click();}
	
	@Test
	public  void  BorrarRegistro () throws Throwable   {	
		
		WebDriverWait wait = new WebDriverWait(driver,10);		
		wait.until(ExpectedConditions.visibilityOf(Tabla));			
		 String Name1 = Tabla.getText();
		 Buscar.sendKeys(Name1); 
		 Borrar.click();
		 Buscar.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
		
	}
	
	
			
}
