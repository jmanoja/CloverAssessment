package org.search.automation.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.search.automation.actions.SearchPageActions;
import org.search.automation.actions.SearchResultsPageActions;
import org.search.automation.utils.HelperClass;
import org.testng.Assert;

public class SearchPageDefinitions {
  SearchPageActions objSearchPage = new SearchPageActions();
  SearchResultsPageActions objSearchResultsPage = new SearchResultsPageActions();

  @When("I search for {string}")
  public void searchKeyword(String searchKeyword) {
    objSearchPage.enterSearchKeyword(searchKeyword);
  }

  @Given("I Open Google")
  public void i_open_google() {
    HelperClass.openPage();
  }
  @Then("I should see {string} is present in the {string} result")
  public void iShouldSeeIsPresentInTheStResult(String searchKeyword, String result) {
    Assert.assertTrue(objSearchResultsPage.getSearchResultText(Character.getNumericValue(result.charAt(0))-1).contains(searchKeyword), "Searched Keyword is not present in the results");
  }
}
