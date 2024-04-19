#Mugilan
#09 April 2024
@FunctionalityScenario
Feature: feature to test help page

  @FunctionalityTest
  Scenario: Check help page is successfully opening
    Given user is login to application with valid username and password
    When user click help page
    And verify the title
    Then user navigate to home page