package search;

import Pages.*;
import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class SearchTests  extends BaseTests {
    @Test
    public void testSearchFromContainer(){
        SearchPage searchPage = homePage.clickSearch();
        searchPage.chooseFromContainer();

    }
    @Test
    public void testSearchWithValue(){
        SearchPage searchPage = homePage.clickSearch();
        searchPage.enterSearchValue("murder");
        SearchResultPage resultPage = searchPage.searchForValue();
        assertEquals("Searching for murder within", resultPage.searchResultPageSubheading());
    }

}
