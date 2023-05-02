Feature: Feature to test the login
  Scenario: Validate that the registered login is working
    Given we are on the homepage
    When we click on the login button
    And we navigate to the loginpage
    And we enter the right email address and password
    And we click on the login button
    Then W
