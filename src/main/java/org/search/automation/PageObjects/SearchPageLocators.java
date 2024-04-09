package org.search.automation.PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPageLocators {

  @FindBy(xpath = "//textarea[@title='Search']")
  public WebElement searchField;

  @FindBy(xpath = "(//*[@value='Google Search'])[2]")
  public WebElement subTextBtn;
  @FindBy(xpath = "(//h3[text()='Selenium'])[1]")
  public WebElement firstResult;

}
