package Demoqa.Definitions;

import org.openqa.selenium.WebDriver;

import Demoqa.Paginas.*;
import Demoqa.Steps.*;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class DefinitionsSteps {


	private WebDriver driver;
	private Conexion conexion = new Conexion();	
	private Botones botones = new Botones (driver);
	private WebElements webElements = new WebElements (driver);
	private DatePicker datePicker = new DatePicker (driver);
	private AlertsFrame alertsFrame = new AlertsFrame (driver);
	
	@Given("^Abrir el navegador$")
	public void abrir_navegador() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		this.conexion = new Conexion();
		this.driver = this.conexion.abrirNavegador();
	    
	}
	

@When("^Web tables y agregar un nuevo registro$")
public void web_tables_y_agregar_un_nuevo_registro() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	
	  this.webElements = new WebElements(driver); 
	  this.webElements.TablasWeb();
	  this.webElements.CrearRegisto();
	  this.webElements.BorrarRegistro();
	  
    
}


@Then("^Date Picker seleccionar fecha$")
public void date_Picker_seleccionar_fecha() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	this.datePicker = new DatePicker (driver);
	this.datePicker.Date();
   
}


@Then("^Alerts interactuar con las ventanas emergentes$")
public void alerts_interactuar_con_las_ventanas_emergentes() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	
	this.alertsFrame = new AlertsFrame (driver);
	this.alertsFrame.Alerts();
   
}


}