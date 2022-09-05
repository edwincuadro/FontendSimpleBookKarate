package com.speedup.qa.userInterfaces;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Login {
    public static final Target ENTER_LOGIN_SCREEN = Target
            .the("Select Log in button").located(By.className("nav__button-secondary"));

    public static final Target USER_NAME = Target
            .the("Input the username").located(By.id("username"));

    public static final Target USER_PASSWORD = Target
            .the("Input the password").located(By.name("session_password"));
}

