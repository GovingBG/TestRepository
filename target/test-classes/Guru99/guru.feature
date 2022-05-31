Feature: Log in to Guru99Bank
@SmokeTest
Scenario: Successful Login
Before 
    Given User navigates to "http://demo.guru99.com/V4"
    When User enters valid credentials
    
    Then User should be able to Login Successful
    After