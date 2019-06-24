package cucumber.stepDefinition;

import org.junit.runner.RunWith;

import cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@Cucumber.Options(format={"pretty","html:reports/test-report"},tags= "@smokeTest")
public class TestRunner {


	/*
	 * public TestRunner() { fail("Not yet implemented"); }
	 */


}
