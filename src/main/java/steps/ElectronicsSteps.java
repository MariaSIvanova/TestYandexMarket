package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import pages.ElectronicsPage;

/**
 * Created by User on 25.08.2017.
 */
public class ElectronicsSteps extends ScenarioSteps{
    ElectronicsPage electronicsPage;

    @Step("открыли Телевизоры")
    public void goToTV(){
        electronicsPage.TVButtonElement.click();
    }
    @Step("выбрали LG")
    public void goToChooseLG(){
        electronicsPage.chooseLGElement.click();
    }
    @Step("выбрали Samsung")
    public void goToChooseSamsung(){
        electronicsPage.chooseSamsungElement.click();
    }

}
