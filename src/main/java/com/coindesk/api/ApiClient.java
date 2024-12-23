package com.coindesk.api;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class ApiClient {

    private static final String BASE_URL = "https://api.coindesk.com/v1/bpi/currentprice.json";

    public ApiResponse getApiResponse() {
        Response response = RestAssured.get(BASE_URL);
        return response.as(ApiResponse.class);
    }
}
