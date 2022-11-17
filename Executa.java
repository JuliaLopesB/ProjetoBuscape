package executa;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = "src/test/resources/features",
		glue = "runner" ,
		tags = "@executa and not @nExecuta" ,
		plugin = {"pretty" , "html:target/report.html"} , 
		dryRun = true,
		monochrome = true
		
)


public class Executa {

}
