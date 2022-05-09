# Autor : Cristian Avendaño
  @stories
  Feature: StartSharp
    As a user, I want automate the StartSharp create new meeting
    Background:
      Given that Admin log in in the StartSharp page
      |strUsername|strPassword|
      |  admin    |serenity   |
  @scenario1
  Scenario: sign in startSharp and create business unit, meeting
    When he create the business unit and asociate with new meeting
    |strName|strParentUnit|
    |business-cristian|Administration|
    Then new meeting is created
