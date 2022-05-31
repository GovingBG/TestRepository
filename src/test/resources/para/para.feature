Feature: Validate pets

  Scenario Outline: 
    Given open the browser
    And user should be in login page
    When user enters the username and password
    And user clicks on the login button
    When user should be navigated to home page
    Then user search for the pets
