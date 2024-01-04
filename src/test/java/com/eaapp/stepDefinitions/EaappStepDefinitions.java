package com.eaapp.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EaappStepDefinitions {
    @Given("The user is on the home page")
    public void the_user_is_on_the_home_page() {

    }
    @When("The user log in as {string} and {string}")
    public void the_user_log_in_as_and(String admin, String password) {

    }
    @Then("clicks on {string} button and navigates to Employee Page")
    public void clicks_on_button_and_navigates_to_employee_page(String EmployeeList) {

    }
    @Then("clicks on {string} button on the Employee List")
    public void clicks_on_button_on_the_employee_list(String CreateNew) {

    }
    @Then("enters {string}, {string}, {string}")
    public void enters(String Name, String Salary, String Email) {

    }
    @Then("selects {string} in DurationWorked dropbox")
    public void selects_in_duration_worked_dropbox(String Value) {

    }
    @Then("selects {string} in the Grade dropbox")
    public void selects_in_the_grade_dropbox(String Grade) {

    }
    @Then("clicks on the {string} button")
    public void clicks_on_the_button(String Create) {

    }

    @Then("Verifies that the new employee info is in the Employee List page")
    public void verifies_that_the_new_employee_info_is_in_the_employee_list_page() {

    }
    @Then("clicks on {string} button for newly created Employee")
    public void clicks_on_button_for_newly_created_employee(String Delete) {

    }
    @Then("clicks on {string} for confirmation")
    public void clicks_on_for_confirmation(String deleteConfirmButton) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("verify that the new employee is deleted from the Employee List")
    public void verify_that_the_new_employee_is_deleted_from_the_employee_list() {

    }
}
