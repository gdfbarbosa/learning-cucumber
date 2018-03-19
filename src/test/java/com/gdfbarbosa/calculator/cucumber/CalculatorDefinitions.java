package com.gdfbarbosa.calculator.cucumber;

import com.gdfbarbosa.calculator.Calculator;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CalculatorDefinitions {
    private Logger LOG = LoggerFactory.getLogger(CalculatorDefinitions.class);

    private Calculator calculator;

    public CalculatorDefinitions() {
        calculator = new Calculator();
    }

    @Given("^Given (\\d+) and (\\d+)")
    public void given(Integer x, Integer y) {
        calculator = new Calculator(x, y);
        LOG.info(String.format("Given %1$d and %2$d", x, y));
    }

    @When("^I sum (\\d+) and (\\d+)")
    public void when(Integer x, Integer y) {
        calculator.sum(x, y);
        LOG.info(String.format("When I sum %1d and %2$d", x, y));
    }

    @Then("^I get (\\d+)")
    public void then(Integer result) {
        LOG.info(String.format("Then I get %1$d", result));
        Assert.assertEquals(result, calculator.getResult());
    }
}
