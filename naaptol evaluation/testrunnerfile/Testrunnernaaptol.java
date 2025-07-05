package naaptoltestrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"C:\\Users\\Mahesh\\git\\cucmberproject\\Cucumber\\src\\test\\resources\\feature_file_demo\\naapto.feature"},
glue= {"naaptolevaluation"})

public class Testrunnernaaptol extends AbstractTestNGCucumberTests {
	
}
