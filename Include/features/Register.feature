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
Feature: Register


  Scenario: User Register with already registered username
    Given User navigate to Website Shop Demo Register
    When User click button My Account Register
    And User enter already registered username
    And User click button register
    Then User already registered
  	
  
  Scenario: User Register with null email
  	When User enter null email register
  	Then User required email register
  	
  	
  Scenario: User Register valid credential
   	When User enter valid username email password
  	Then User register success
  	