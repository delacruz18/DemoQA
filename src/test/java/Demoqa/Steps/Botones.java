package Demoqa.Steps;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import net.thucydides.core.annotations.Step;

public class Botones {
	
private WebDriver driver;
	

	
	
	public Botones(WebDriver driver) {

		PageFactory.initElements(driver, this);
		this.driver = driver;
}
	
	
	
	
	@Step
	public void scrollBajar() {
		 //WebElement continuar = driver.findElement(By.id("continue"));
		  JavascriptExecutor scroll = (JavascriptExecutor) driver;
	       scroll.executeScript("window.scrollBy(0,500)");
	      // js.executeScript("arguments[0].scrollIntoView();", Element);    		        
	}
	
	
	@Step
	public void scrollSubir() {		 
		  JavascriptExecutor scroll = (JavascriptExecutor) driver;
	       scroll.executeScript("window.scrollBy(0,-160)");	      		        
	}
	
	@Step
	public void Alerta() {	
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		// Espera a que se muestre la alerta y almacenala en una variable
		Alert alert = wait.until(ExpectedConditions.alertIsPresent());

		// Almacena el texto de la alerta en una variable
		String text = alert.getText();
		// Imprime el texto contenido en la alerta
		System.out.println(text);
		// Presiona el botón OK
		alert.accept();
	}
	
	
}
