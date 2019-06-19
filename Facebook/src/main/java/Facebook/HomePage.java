package Facebook;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends CommonAPI {

    @FindBy(xpath = "//*[@id=\"u_0_e\"]")
    WebElement FirstName;

}
