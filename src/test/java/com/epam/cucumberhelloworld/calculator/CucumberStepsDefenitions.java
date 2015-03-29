package com.epam.cucumberhelloworld.calculator;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Vyacheslau Karachun on 26.03.2015.
 */
public class CucumberStepsDefenitions {

    private Calculator calculator;

    private Scenario scenario;

    private Map<String, Integer> vars;
    private int result;

    public CucumberStepsDefenitions() {
        this.calculator = new Calculator();
        this.vars = new HashMap<String, Integer>();
    }

    @Before
    public void beforeScenario(Scenario scenario) {
        this.scenario = scenario;
    }

    @Given("^var '(.*)' equal '(\\d+)'$")
    public void createVar(String varName, int value) {
        this.vars.put(varName, value);
    }

    @When("^user '(.*)' numbers vars '(.*)' and '(.*)'$")
    public void userAddNumbersVars(String operation, String var1Name, String var2Name) throws Throwable {
        this.result = calculator.operation(operation, this.vars.get(var1Name), this.vars.get(var2Name));
    }

    @Then("^the result is '(\\d+)'$")
    public void verifyResult(int expectedResult) {
        Assert.assertTrue("Expected [" + expectedResult + "] result is not equal actual [" + this.result + "].",
                expectedResult == this.result);
    }

    @After
    public void afterScenario(Scenario scenario) {
        scenario.write("<a href=\"http://tut.by\" target=\"blank\">Tut.by</a>");
    }

}
