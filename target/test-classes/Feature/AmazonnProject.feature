 # This is used to write comments
# this is like your test plan
# This is my first feature file
@all
Feature: Testing amazon application

  # In the scenario if there are steps that are common to be executed in the begining
  # as a pre-requisite then we use the keyword Background
  # The below statements demonstrates the use of backgroud keyword
  # these statements will be executed before every scenario in the current feature file **
  Background: 
    Given I open the browser and enter URL
    Then I click on the signin button
    When I enter email and password
   

  # we are using Gherkin keywords
  # each step should have a matching Code
  # for every steps we have to write code in step definition file
  @regression
  Scenario: 
  Given It search for iphone13
  Then It clicks on it
  And adds it to the wishlist
