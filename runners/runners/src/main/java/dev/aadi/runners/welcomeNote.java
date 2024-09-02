package dev.aadi.runners;

import org.springframework.stereotype.Component;

@Component
public class welcomeNote {

    public String getWelcome(){
        return "Welcome to runners club";

    }
}
