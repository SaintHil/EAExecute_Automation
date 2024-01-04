@AB
Feature: Create New Employee Function

  Background:
    Given The user is on the home page

  Scenario Outline: Create and then delete new employee in the Employee Page
    When The user log in as "admin" and "password"
    Then clicks on "Employee List" button and navigates to Employee Page
    And  clicks on "Create New" button on the Employee List
    And enters "<Name>", "<Salary>", "<Email>"
    And selects "Value" in DurationWorked dropbox
    And selects "Grade" in the Grade dropbox
    And clicks on the "Create" button
    Then Verifies that the new employee info is in the Employee List page
    And clicks on "Delete" button for newly created Employee
    And clicks on "deleteConfirmButton" for confirmation
    Then verify that the new employee is deleted from the Employee List
    Examples:

      | Name  | Salary | Email                   |
      | Saint | 1500   | SaintHill1996@gmail.com |

