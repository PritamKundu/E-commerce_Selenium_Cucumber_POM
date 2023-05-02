Feature: User registers a new account

  Scenario: User registers with valid data
    Given We are on registerpage
    When user enters "abc" in the first name and "abc" in the last name
#    And user enters "01", "January" and "1988"
    And user enters "abc@abc.com" in the email address
    And user enters "123456" in password
    And user enters "123456" in confirm password
    Then the user is registered and successfully and the message "Your registration completed" appears

  Scenario Outline: User registers with invalid data
    Given We are on registerpage
    When user enters "<firstname>" in the first name and "<lastname>" in the last name
    And user enters "<email>" in the email address
    And user enters "<password>" in password
    And user enters "<confPassword>" in confirm password
    Then error message for invalid data appears
    Examples:
      |firstname  |lastname |email| password|confPassword|
      |abc  |abc |abcdef| 123456|123456|
      |abc  |abc |abc@abc.com|1234|1234|
      |abc  |abc |abc@abc.com|1234567|123456|

  Scenario: User registers with empty data field
    Given We are on register page
    When user enters "" in the first name and "" in the last name
    And user enters "" in the email address
    And user enters "" in password
    And user enters "" in confirm password
    Then error message for empty field appears

  Scenario: User registers with existing email
    Given We are on registerpage
    When user enters "abc" in the first name and "abc" in the last name
    And user enters "abc@abc.com" in the email address
    And user enters "123456" in password
    And user enters "123456" in confirm password
    Then error message for existing email appears


