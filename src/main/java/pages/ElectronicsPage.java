package pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

import java.util.List;

/**
 * Created by User on 25.08.2017.
 */
public class ElectronicsPage extends PageObject{

    @FindBy(xpath = "//a[@class=\"link catalog-menu__list-item metrika i-bem metrika_js_inited\"][contains(text(),\"Телевизоры\")]")
    public WebElement TVButtonElement;

    @FindBy(xpath = "//label[@class=\"checkbox__label\"][contains(text(),\"LG\")]")
    public WebElement chooseLGElement;

    @FindBy(xpath = "//label[@class=\"checkbox__label\"][contains(text(),\"Samsung\")]")
    public WebElement chooseSamsungElement;

}
