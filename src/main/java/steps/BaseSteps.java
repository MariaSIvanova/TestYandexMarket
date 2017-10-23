package steps;

import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Step;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import pages.BasePage;
import pages.ElectronicsPage;

import java.util.concurrent.TimeUnit;


/**
 * Created by User on 25.08.2017.
 */
public class BaseSteps {


    @Managed(driver = "chrome")
    public WebDriver driver;

    @Before
    public void beforeMethod(){
        driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
        driver.get(System.getProperty("app.url"));
        driver.manage().window().maximize();
    }

    BasePage basePage;

    @Step("открыли Маркет")
    public void goToMarket(){  basePage.marketButtonElement.click();}
    @Step("открыли Электронику")
    public void goToElectronics(){ basePage.electronicsButtonElement.click();}
    @Step("открыли расширенный поиск")
    public void goToFullSearch(){
        basePage.filtrButtonElement.click();
    }
    @Step("указали цену От value")
    public void insertPrice(int intValue){
        String value = Integer.toString(intValue);
        basePage.priceFromFieldElement.sendKeys(value);
    }
    @Step("выполнили поиск с применением фильтров")
    public void goToSearch(){
        basePage.searchButtonElement.click();
    }
    @Step("результат в виде списка")
    public void doList(){basePage.listButtonElement.click();}
    @Step("посчитали количество элементов на странице")
    public  int getNumOfResults(){
        return basePage.resultListElement.size();
    }
    @Step("вернули текст наименования первого товара")
    public String nameOfFirstResult(){
        return basePage.firstResultElement.getText();
    }
    @Step("в поисковик вводим скопированное значение")
    public void insertStringForSearch(String name){
        basePage.searchInMarketFieldElement.sendKeys(name);
    }
    @Step("нажимаем поиск")
    public void clickButtonForSearch(){
        basePage.searchInMarketButtonElement.click();
    }
    @Step()
    public String resultSearch(){
        return basePage.finalSearchElement.getText();
    }


    @After
    public void afterMethod(){
                driver.quit();
    }


}
