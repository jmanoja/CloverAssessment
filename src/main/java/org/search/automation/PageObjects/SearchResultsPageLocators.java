package org.search.automation.PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SearchResultsPageLocators {


  @FindBy(xpath = "//div[@id='search']/div/div/div")
  public List<WebElement> searchResults;

}
