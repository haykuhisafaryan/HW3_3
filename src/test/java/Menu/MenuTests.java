package Menu;

import Pages.MenuPage;
import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class MenuTests extends BaseTests {

    @Test
    public void goToHomePage(){
        MenuPage menu = homePage.clickCompete();
        menu.goToHomePage();

    }
    @Test
    public void goToCompetePage(){
        MenuPage menu = homePage.clickCompete();
        menu.goToCompetePage();

    }

    @Test
    public void goToDataPage(){
        MenuPage menu = homePage.clickCompete();
        menu.goToDataPage();

    }
    @Test
    public void goToCodePage(){
        MenuPage menu = homePage.clickCompete();
        menu.goToCodePage();

    }
    @Test
    public void goToCommunitiesPage(){
        MenuPage menu = homePage.clickCompete();
        menu.goToCommunitiesPage();

    }
    @Test
    public void goToCoursesPage(){
        MenuPage menu = homePage.clickCompete();
        menu.goToCoursesPage();

    }
}




