Feature: Verify API Response

  @coin
  Scenario: Verify BPI details
    When I call the API
    Then I verify that the API response contains 3 BPIs USD, GBP, EUR
    And I verify that the GBP description equals "British Pound Sterling"
