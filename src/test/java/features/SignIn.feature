Feature: Signin Feature


  @test
  Scenario: User should be able to signin with valid credentials
  Given  user on Macys Homepage
    And user enter valid email address and password
    When user click on sign in button
    Then user should be able to successfully Sign in
