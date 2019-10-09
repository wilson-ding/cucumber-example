@SmokeTest2
Feature: test Selenium

  I want to send username and password to login

  Scenario: Selenium Login

    Given username and password are ready
    When try to login
    Then login successfully