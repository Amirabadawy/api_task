Feature: API Test
  Scenario Outline: Verify API Response
    Given the API endpoint is "<endpoint>"
    When make a GET request
    Then the response code should be 200
    Examples:
      | endpoint                            |
      |https://www.boredapi.com/api/activity|