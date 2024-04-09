package org.search.automation.actions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.search.automation.PageObjects.SearchPageLocators;
import org.search.automation.utils.HelperClass;
import org.openqa.selenium.support.PageFactory;


public class SearchPageActions {

    SearchPageLocators searchPageLocators = null;
    public SearchPageActions() {
        this.searchPageLocators = new SearchPageLocators();
        PageFactory.initElements(HelperClass.getDriver(),searchPageLocators);
    }

    public void enterSearchKeyword(String word){
        searchPageLocators.searchField.click();
        searchPageLocators.searchField.sendKeys(word);
        searchPageLocators.searchField.sendKeys(Keys.ENTER);
    }
}
