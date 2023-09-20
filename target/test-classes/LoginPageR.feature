Feature: Title of your feature
  I want to use this template for my feature file

  Background: 
    Given user is navigated to "https://opensource-demo.orangehrmlive.com/"

  @ValidCredentials
  Scenario: Verify login with valid credentials
    When user enters the user name as "Admin"
    And enters password as "admin123"
    And clicks on Login button
    Then user must be able to land on home page

  @InvalidCredentials
  Scenario Outline: Verify login with invalid credentials
    When user enters credentials as "<uname" and "<uPWD>"
    And clicks on signin button
    Then user must be presented with an error message as "<Error_Message>"

    Examples: 
      | uname   | uPWD      | Error_Message       |
      | Admin   | admin3    | Invalid credentials |
      | admin$$ | admin123  | Invalid credentials |
      | abc123  | xyz123    | Invalid credentials |
