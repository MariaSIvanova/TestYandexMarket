package pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

import java.util.List;

/**
 * Created by User on 28.08.2017.
 */
public class BasePage extends PageObject{
    @FindBy(xpath = "//*[contains(text(),\"Маркет\")]")
    public WebElement marketButtonElement;

    @FindBy(xpath = "//*[contains(text(),\"Электроника\")]")
    public WebElement electronicsButtonElement;

    @FindBy(xpath = "//a[contains(text(),\"Перейти ко всем фильтрам\")]")
    public WebElement filtrButtonElement;

    @FindBy(xpath = ".//input[@name=\"glf-pricefrom-var\"]")
    public WebElement priceFromFieldElement;

    @FindBy(xpath = "//span[@class=\"button__text\"][contains(text(),\"Показать подходящие\")]/parent::a")
    public WebElement searchButtonElement;

    @FindBy(xpath = "//span[@class=\"radio-button__text view-switcher__item view-switcher__item_type_list\"]")
    public WebElement listButtonElement;

    @FindBys(@FindBy(xpath = "//div[@class=\"price\"]"))
    public List<WebElement> resultListElement;

    @FindBy(xpath ="//span[@class=\"snippet-card__header-text\"]")
    public WebElement firstResultElement;

    @FindBy(xpath = ".//*[@id='header-search']")
    public WebElement searchInMarketFieldElement;

    @FindBy(xpath = "//*[contains(text(),\"Найти\")]/parent::button")
    public WebElement searchInMarketButtonElement;

    @FindBy(xpath = "//div[@class=\"n-title__text\"]/h1")
    public WebElement finalSearchElement;

}
