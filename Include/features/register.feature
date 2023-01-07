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


  @kemenag_pusat
  Scenario Outline: as user
    i want to Register account in https://bioskoponline.com/

    Given I want to register to  bioskoponline
    When aplication open
    Then I input name
    And I input invalid email format
    Then Alert email invalid displayed
    When I input registered emai
    
    When I input valid email format
    Then Alert email invalid disappear 
    When I input phone number kurang dari sepuluh karakter
    Then Alert phone number displayed
    When I input phone number using 62
    Then Alert phone number displayed
    And I input phone number using valid phone number
    And I can Filter by Institution <institution>
    And I Can Filter by Santri
    Then I Can See Detail of Santri
    And I Can Export Detail santri to PDF

    Examples: 
      | name           |invalid_email| email                  | phone        | password |
      | Athalla Tsaqif |afsyussalaam| afsyussalaam@gmail.com | 081310490880 | Password |
