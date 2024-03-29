package TestCitiBankHomePage;

import CitiBank.CitiBankHomePage;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class TestCitiBankHome extends CommonAPI {
    CitiBankHomePage home;
    String url = "https://online.citi.com/";

    @BeforeClass
    public void init(){
        home = PageFactory.initElements(driver,CitiBankHomePage.class);
        driver.get(url);
    }

    @AfterMethod
    public void getback(){}

}