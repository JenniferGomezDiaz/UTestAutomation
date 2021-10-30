package co.com.utest.certification.retotecnico.stepdefinitions;

import co.com.utest.certification.retotecnico.model.UTestAcademyData;
import co.com.utest.certification.retotecnico.tasks.JoinToday;
import co.com.utest.certification.retotecnico.tasks.OpenUp;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

/**
 * @author: Jennifer Gomez Diaz
 * @version: 29/10/2021
 * @see <a href = "jennifergomezdiaz1104@gmail.com" /> jennifergomezdiaz1104@gmail.com </a>
 */
public class UTestAcademyStepDefinitions {

    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^than Jennifer wants to learn at the uTest academy$")
    public void thanJenniferWantsToLearnAtTheUTestAcademy(List<UTestAcademyData> uTestAcademyData) throws Exception {
        OnStage.theActorCalled("Jennifer").wasAbleTo(OpenUp.thePage(), (JoinToday.onThePage(
                uTestAcademyData.get(0).getStrFirstName(),
                uTestAcademyData.get(0).getStrLastName(),
                uTestAcademyData.get(0).getStrEmail(),
                uTestAcademyData.get(0).getStrMonth(),
                uTestAcademyData.get(0).getIntDay(),
                uTestAcademyData.get(0).getIntYear(),
                uTestAcademyData.get(0).getStrMobileDevice(),
                uTestAcademyData.get(0).getStrModel(),
                uTestAcademyData.get(0).getStrOS(),
                uTestAcademyData.get(0).getStrClave()
                )));
    }

    @When("^she search for the course testing basics on the uTest academy platform$")
    public void sheSearchForTheCourseTestingBasicsOnTheUTestAcademyPlatform(List<UTestAcademyData> uTestAcademyData) throws Exception {

    }

    @Then("^she finds the course called testing basics$")
    public void sheFindsTheCourseCalledTestingBasics(List<UTestAcademyData> uTestAcademyData) throws Exception {

    }

}
