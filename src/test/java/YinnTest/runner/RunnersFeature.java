package YinnTest.runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = { "src/test/resources/features" }, glue = { "Demoqa.Definitions" }
//,tags = {"@tag3"}
)

public class RunnersFeature {

}


//para mejor manejo consultar el reporte de serenuty en la carpeta origen