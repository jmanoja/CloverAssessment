package org.search.automation.actions;

import org.openqa.selenium.support.PageFactory;
import org.search.automation.PageObjects.SearchPageLocators;
import org.search.automation.PageObjects.SearchResultsPageLocators;
import org.search.automation.utils.HelperClass;


public class SearchResultsPageActions{

    SearchResultsPageLocators searchResultsPageLocators = null;

    public SearchResultsPageActions() {
        this.searchResultsPageLocators = new SearchResultsPageLocators();
        PageFactory.initElements(HelperClass.getDriver(),searchResultsPageLocators);
    }
    public String getSearchResultText(int searchResultPosition) {
      return searchResultsPageLocators.searchResults.get(searchResultPosition).getText();
    }
}
