#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Login

  @tag1
  Scenario Outline: User Login Invalid
    Given User navigate to Website Shop Demo
    When User click button My Account
    And User enter <username> and <password>
    And User click button login
    Then User login with <status> credential

    Examples: 
      | username | password  | status |
      | exo | 8wkTjk+rrzEk3z355PUADw== | invalid username |
      | citra1 | WCrxDONgCPU= | invalid password |
  
  Scenario: User Login with null username
  	When User enter null username
  	Then User required username
  
  Scenario: User Login with null password 
  	When User enter null password
  	Then User required password
  	
  Scenario: User Login Valid Credential
  	When User enter valid username password
  	Then User login success
  