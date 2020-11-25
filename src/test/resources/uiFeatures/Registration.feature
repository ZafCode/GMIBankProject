@US002
Feature: GMIBank Registration Functionality

  As a user, I should not be able to register with invalid credentials.

  Background:
    Given User is on the login page
    When User click on user icon link
    Then User click on register link
    And Registration page is opened

  @TC001
  Scenario: User doesn't leave any field blank on the registration form

    And user enters a valid SSN
    And user enters a valid FirstName
    And user enters a valid LastName
    And user enters a valid Address
    And user enters a valid Mobile Phone Number
    And user enters a valid Username
    And user enters a valid Email
    And user enters a valid Password
    And user enters the same password for confirmation password
    Then user clicks on register button
    Then user should see a success message

  @TC002
  Scenario Outline: User doesn't leave any field blank on the registration form
    Given user is on the registration page
    When user leaves <field> field blank
    Then user gets your <field> is required message
    Examples:
      | field                 |
      | SSN                   |
      #| First Name            |
      #| Last Name             |
      #| Address               |
     # | Mobile Phone Number   |
      #| Username              |
      #| Email                 |
      #| Password              |
      #| Confirmation Password |


Feature: GMIBank Registration Functionality

  As a user, I should not be able to register with invalid credentials.

  @TC003
  Scenario:
    When User enters an SSN number and SSN number has -
    Then User shouldn't see invalid SSN message

  @TC004
  Scenario:
    When User enters an SSN number and SSN number contains a char
    Then User should see invalid SSN message

  @TC005
  Scenario:
    When User enters an SSN number and SSN number contains space
    Then User should see invalid SSN message

  @TC006
  Scenario:
    When User enters an SSN number and SSN number contains special character
    Then User should see invalid SSN message

  @TC007
  Scenario:
    When User enters an SSN number and SSN number contains punctuation
    Then User should see invalid SSN message


Feature: GMIBank Registration Functionality

  As a user, I should not be able to register with invalid credentials.

  @TC008
  Scenario:
    When User enters mobile phone number and mobile phone number has -
    Then User shouldn't see invalid mobile phone number message

  @TC009
  Scenario:
    When User enters mobile phone number and mobile phone number contains a char
    Then User should see invalid mobile phone number message

  @TC0010
  Scenario:
    When User enters mobile phone number and mobile phone number contains space
    Then User should see invalid mobile phone number message

  @TC0011
  Scenario:
    When User enters mobile phone number and mobile phone number contains special character
    Then User should see invalid mobile phone number message

  @TC0012
  Scenario:
    When User enters mobile phone number and mobile phone number contains punctuation
    Then User should see invalid mobile phone number message

Feature: GMIBank Registration Functionality

  As a user, I should not be able to register with invalid credentials.

  @TC0013
  Scenario:
    When User enters an email which contains @ sign and .com extension
    Then User shouldn't see email invalid message

  @TC0014
  Scenario:
    When User enters an email which doesn't  contain @ sign  and .com extension
    Then User should see email invalid message

  @TC0015
  Scenario:
    When User enters an email which contains @ sign but doesn’t contain .com extension
    Then User should see email invalid message

  @TC0016
  Scenario:
    When User enters an email which doesn't contain @ sign, but contains .com extension
    Then User should see email invalid message









