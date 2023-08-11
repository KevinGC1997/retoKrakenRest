package io.swagger.petstore.test.stepdefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.eo.Se;
import io.swagger.petstore.test.steps.CreateUserSteps;
import io.swagger.petstore.test.steps.PlaceAnOrderSteps;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import org.hamcrest.Matchers;

import java.util.Map;

public class CreateUserStepDefinitions {

    @Steps
    CreateUserSteps createUserSteps;


    @Given("^A user send the request to create a new user in the endpoint \"([^\"]*)\"$")
    public void aUserSendTheRequestToCreateANewUserInTheEndpoint(String url, Map<String, String> body) {
        createUserSteps.sendRequest(url, body);
    }

    @Then("^Validate that the status code is (\\d+)$")
    public void validateThatTheStatusCodeIs(int statusCode) {
        createUserSteps.validateStatus(statusCode);
    }

    @And("^Validate that the response must be \"([^\"]*)\"$")
    public void validateThatTheResponseMustBe(String pathStructure) {
        createUserSteps.validateStructure(pathStructure);
    }


    @And("^Validate that the response contains the key \"([^\"]*)\" must be \"([^\"]*)\"$")
    public void validateThatTheResponseContainsTheKeyMustBe(String type, String typeStatus) {
       createUserSteps.validateType(type, typeStatus);
    }

    @And("^Validate that the response  \"([^\"]*)\" must be \"([^\"]*)\"$")
    public void validateThatTheResponseMustBe(String message, String messageStatus) {
        createUserSteps.validateMessage(message, messageStatus);
    }

}
