package io.swagger.petstore.test.stepdefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.swagger.petstore.test.steps.CreateUserSteps;
import io.swagger.petstore.test.steps.PlaceAnOrderSteps;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;

import java.util.Map;

public class PlaceAnOrderStepDefinitions {
    @Steps
    PlaceAnOrderSteps placeAnOrderSteps;
    @Steps
    CreateUserSteps createUserSteps;

    @Given("^A user send the request to place an order for pet in the endpoint \"([^\"]*)\"$")
    public void aUserSendTheRequestToPlaceAnOrderForPetInTheEndpoint(String url, Map<String, String> body) {
        createUserSteps.sendRequest(url, body);
    }

    @Then("^Validate in the response that the status code is (\\d+)$")
    public void validateInTheResponseThatTheStatusCodeIs(int statusCode) {
        placeAnOrderSteps.validateStatusCode(statusCode);
    }

    @And("^Validate that the response body must be \"([^\"]*)\"$")
    public void validateThatTheResponseBodyMustBe(String structure) {
        placeAnOrderSteps.validateStructureService(structure);
    }


    @And("^Validate in the response that the response contains the key \"([^\"]*)\" must be \"([^\"]*)\"$")
    public void validateInTheResponseThatTheResponseContainsTheKeyMustBe(String status, String expectedStatus) {
        placeAnOrderSteps.validateStatusKey(status,expectedStatus);
    }
}
