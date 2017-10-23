import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import steps.BaseSteps;
import steps.ElectronicsSteps;
import steps.HeadphonesSteps;

import static org.junit.Assert.assertTrue;

/**
 * Created by User on 28.08.2017.
 */
@RunWith(SerenityRunner.class)
public class HeadphonesTest extends BaseSteps{


    @Steps
    HeadphonesSteps headphonesSteps;
    @Steps
    BaseSteps baseSteps;


    @Test
    public void checkHeadTest(){
        baseSteps.goToMarket();
        baseSteps.goToElectronics();
        headphonesSteps.goToHeadphones();
        baseSteps.goToFullSearch();
        baseSteps.insertPrice(5000);
        headphonesSteps.goToChooseBeats();
        baseSteps.goToSearch();
        //baseSteps.doList();
        assertTrue("найдено 12 результатов", baseSteps.getNumOfResults()==12);
        String name = baseSteps.nameOfFirstResult();
        baseSteps.insertStringForSearch(name);
        baseSteps.clickButtonForSearch();
        Assert.assertEquals(baseSteps.resultSearch(),name);

    }
}