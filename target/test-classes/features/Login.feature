Feature: Login
  As user, I want to be able to login with username and password

  Background: open login page
    Given user is on the login page

  @help_desk
  Scenario: Login as help desk and verify that title is Portal
    When user logs in as a help desk
    Then user should verify that title is a Portal

  @marketing
  Scenario: Login as marketing and verify that title is Portal
    When user logs in as a marketing
    Then user should verify that title is a Portal

  @hr
  Scenario: Login as a hr and verify title is Portal
    When user logs in as a hr
    Then user should verify that title is a Portal

  @loginWithParams
  Scenario: Login with parameters
    When user enters "helpdesk28@cybertekschool.com" username and "UserUser" password
    Then user should verify that title is a Portal