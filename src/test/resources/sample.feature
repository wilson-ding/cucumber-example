@SmokeTest
Feature: Cucumber run test

  I want to run a sample feature file.

  Scenario: Cucumber setup

    Given sample feature file is ready 3
    When I run the feature file
    Then run should be successful