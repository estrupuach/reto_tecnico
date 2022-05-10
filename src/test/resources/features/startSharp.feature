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
    |strNameBusiness  |strParentUnit |NameMeeting|NumberMeeting|type  |fechaInicio|hourStart|endDate   |endHour|location|organizedBy |reporter  |attendee    |
    |business-cristian|Administration|TestMeeting| abc123    |Customer|05/10/2022 |14:10    |05/10/2022|15:50  |HQ-01   |Brian Morgan|Jose Hayes|Alexis Lopez|
    Then new meeting is created
    |NameMeeting|strNameBusiness|
    |TestMeeting|business-cristian|