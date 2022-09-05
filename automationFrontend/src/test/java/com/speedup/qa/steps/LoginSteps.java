package com.speedup.qa.steps;

import com.speedup.qa.models.CredencialsData;
import com.speedup.qa.tasks.LoginUser;
import com.speedup.qa.tasks.OpenBrowser;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class LoginSteps {
    @Managed
    private WebDriver myBrowser; //Para levantar el navegador

    @Before
    public void setUpOnStage(){ //para generar el actor
        setTheStage(Cast.whereEveryoneCan(BrowseTheWeb.with(myBrowser)));
        theActorCalled("Edwin Cuadro");

    }
    @Given("^user is in the site$")
    public void userIsInTheSite() {
        OnStage.theActorInTheSpotlight().wasAbleTo(OpenBrowser.browser());
    }

    @When("^input the correct log in credentials$")
    public void inputTheCorrectLogInCredentials(List<CredencialsData> data) {
        OnStage.theActorInTheSpotlight().attemptsTo(LoginUser.withData(data.get(0)));
    }

    @Then("^get into the site$")
    public void getIntoTheSite() {

    }

}
