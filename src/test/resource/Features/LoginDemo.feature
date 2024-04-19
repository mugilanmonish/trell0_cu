@important
Feature: Test login fuctionality

  @smoke
  Scenario Outline: Check login is successful with valid credentials
    Given browser is open
    And user is on login page
    When user enters <username> and <password>
    And user clicks on login
    Then user is navigated to home page

    Examples: 
      | username                | password |
      | mugilanmonish@gmail.com | Qwerty@1 |
#     | mugi@gmail.com          | Wert     |

  @smoke
  Scenario: Validate google search is working
    Given open browser
    And user is on google search page
    When user enters a text in search box
    And hits enter
    Then user is navigated to search results