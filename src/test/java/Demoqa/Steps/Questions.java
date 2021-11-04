package Demoqa.Steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import net.thucydides.core.annotations.Step;

public class Questions {

	private WebDriver driver;	
	private Botones botones = new Botones (driver);
	
	
	public Questions(WebDriver driver) {

		PageFactory.initElements(driver, this);
		this.driver = driver;

}
	
	
	@FindBy(how = How.ID, using = "close-fixedban")
	private WebElement Publicidad;	
		
	
	@Step 
	public void OcultarPublidad (WebDriver driver)   {
		
		
		
	
		   
	}
	
	

	
}