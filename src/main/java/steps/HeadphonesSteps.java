package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import pages.HeadphonesPage;

/**
 * Created by User on 28.08.2017.
 */
public class HeadphonesSteps extends ScenarioSteps{
    HeadphonesPage headphonesPage;

    @Step("открыли Наушники")
    public void goToHeadphones(){headphonesPage.headphoneButtonElement.click();}
    @Step("выбрать производителя Beats")
    public void goToChooseBeats(){headphonesPage.chooseBeatsElement.click();}

}
