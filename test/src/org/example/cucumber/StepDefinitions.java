package org.example.cucumber;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.junit.Assert;

import org.example.Fridge;

public class StepDefinitions {
    private Fridge fridge;

    private int remainingBottles;

    @Given("I have {int} water bottles")
    public void i_have_water_bottles(int int1) {
        fridge = new Fridge(int1);
    }
    @Given("I have drunk {int} water bottles")
    public void i_have_drunk_water_bottles(int int1) {
        fridge.Take(int1);
    }
    @When("I go to my fridge")
    public void i_go_to_my_fridge() {
        remainingBottles = fridge.getStock();
    }
    @Then("I should have {int} water bottles")
    public void i_should_have_water_bottles(int int1) {
        Assert.assertEquals(int1 , remainingBottles);
    }
}
