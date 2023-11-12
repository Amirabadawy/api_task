package com.activityApi.tests;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static org.testng.Assert.assertEquals;

public class ActivityStepDefs {
    private Response response;

    @Given("the API endpoint is {string}")
    public void setApiEndpoint(String endpoint) {
        RestAssured.baseURI = endpoint;
    }

    @When("make a GET request")
    public void makeGetRequest() {
        RequestSpecification httpRequest = RestAssured.given();
        response = httpRequest.get();
    }

    @Then("the response code should be {int}")
    public void verifyResponseCode(int expectedStatusCode) {
        int actualStatusCode = response.getStatusCode();
        assertEquals(expectedStatusCode, actualStatusCode);

    }




}
