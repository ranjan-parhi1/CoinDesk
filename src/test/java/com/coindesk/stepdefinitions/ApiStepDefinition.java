package com.coindesk.stepdefinitions;

import com.coindesk.api.ApiClient;
import com.coindesk.api.ApiResponse;
import com.coindesk.api.Currency;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.Assert.*;

public class ApiStepDefinition {

    ApiClient apiClient = new ApiClient();
    ApiResponse apiResponse;

    @When("I call the API")
    public void iCallTheAPI() {
        apiResponse = apiClient.getApiResponse();
    }

    @Then("I verify that the API response contains 3 BPIs USD, GBP, EUR")
    public void iVerifyThatTheApiResponseContains3BPIs() {
        assertNotNull("USD is missing in BPI", apiResponse.getBpi().getUsd());
        assertNotNull("GBP is missing in BPI", apiResponse.getBpi().getGbp());
        assertNotNull("EUR is missing in BPI", apiResponse.getBpi().getEur());
    }

    @Then("I verify that the GBP description equals {string}")
    public void iVerifyThatTheGBPDescriptionEquals(String expectedDescription) {
        Currency gbp = apiResponse.getBpi().getGbp();
        assertEquals("GBP description mismatch", expectedDescription, gbp.getDescription());
    }
}
