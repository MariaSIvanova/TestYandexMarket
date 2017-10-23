package pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by User on 25.08.2017.
 */
public class HeadphonesPage extends PageObject{

    @FindBy(xpath = "//div[@class=\"catalog-menu__list\"]/a[@class=\"link catalog-menu__list-item metrika i-bem metrika_js_inited\"][contains(text(),\"Наушники\")]")
    public WebElement headphoneButtonElement;

    @FindBy(xpath = "//label[text()=\"Beats\"]")
    public WebElement chooseBeatsElement;

}
