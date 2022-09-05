package com.speedup.qa.tasks;

import com.speedup.qa.models.CredencialsData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.speedup.qa.userInterfaces.Login.*;

public class LoginUser implements Task {

    private CredencialsData credencialsData;

    public LoginUser(CredencialsData credencialsData){
        this.credencialsData = credencialsData;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(ENTER_LOGIN_SCREEN));
        actor.attemptsTo(Enter.theValue(credencialsData.getUsername()).into(USER_NAME));
        actor.attemptsTo(Enter.theValue(credencialsData.getPassword()).into(USER_PASSWORD));
    }
    public static LoginUser withData(CredencialsData credencialsData){
       return new LoginUser(credencialsData);
    }
}
