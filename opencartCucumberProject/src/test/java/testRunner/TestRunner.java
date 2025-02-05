package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		// features= {".//Features/"}, //all the feature folder features will execute
		// features= {".//Features/Login.feature"},
		// features= {".//Features/Registration.feature"},

		//features= {".//Features/LoginDDTExcel.feature"},
		features = { ".//Features/Login.feature", ".//Features/Registration.feature" }, // executing multiple feature
																						// file
		// features= {"@target/rerun.txt"}, //only failure scenarios
		glue = { "stepsDefinition" ,"hooks"}, // specify the package name
		plugin = { "pretty", "html:reports/myreport.html", // to run in pretty format and it will generates cucumber
															// report
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:", // to genarte extent report
		// "rerun:target/rerun.txt", //only failure scenarios

		},

		dryRun = false, //checks mapping between scenario steps and step definition methods
		monochrome = true, //to avoid junk characters in output
		publish = true, //to publish report in cucumber server
		// tags="@sanity" // this will execute scenarios tagged with @sanity
		// tags="@regression"
		// tags="@sanity and @regression" //Scenarios tagged with both @sanity and
		// @regression
		// tags="@sanity and not @regression" //Scenarios tagged with @sanity but not
		// tagged with @regression
		tags = "@sanity or @regression" //Scenarios tagged with either @sanity or @regression
)
public class TestRunner {

}
