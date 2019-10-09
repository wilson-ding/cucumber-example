@SmokeTest
Feature: Multiplication
  I multiply two numbers
  Scenario: multiply a and b
    Given I have variable a 4
    And I have variable b 4
    When I multiplication a and b
    Then I display the Result