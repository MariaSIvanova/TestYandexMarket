import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import steps.BaseSteps;
import steps.ElectronicsSteps;

import static org.junit.Assert.assertTrue;

/**
 * Created by User on 21.07.2017.
 */
@RunWith(SerenityRunner.class)
public class TVTest extends BaseSteps{


    @Steps
    ElectronicsSteps electronicsSteps;
    @Steps
    BaseSteps baseSteps;


    @Test
    public void checkTVTest(){
        baseSteps.goToMarket();
        baseSteps.goToElectronics();
        electronicsSteps.goToTV();
        baseSteps.goToFullSearch();
        baseSteps.insertPrice(20000);
        electronicsSteps.goToChooseLG();
        electronicsSteps.goToChooseSamsung();
        baseSteps.goToSearch();
        //baseSteps.doList();
        assertTrue("найдено 12 результатов", baseSteps.getNumOfResults()==12);
        String name = baseSteps.nameOfFirstResult();
        baseSteps.insertStringForSearch(name);
        baseSteps.clickButtonForSearch();
        Assert.assertEquals(baseSteps.resultSearch(),name);




}
}
