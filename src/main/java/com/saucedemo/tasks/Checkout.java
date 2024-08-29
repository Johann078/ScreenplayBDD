package com.saucedemo.tasks;

import com.saucedemo.userinterfaces.ShoppingSiteUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Checkout implements Task {
    private final String name;
    private final String lastname ;
    private final String zipcode ;

    public Checkout(String name, String lastname,String zipcode) {
        this.name = name;
        this.lastname = lastname;
        this.zipcode = zipcode;

    }

    public static Checkout theItems(String name, String lastname,String zipcode) {
        return Tasks.instrumented(Checkout.class,name,lastname,zipcode);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ShoppingSiteUI.CHECKOUT_BUTTON),

                Enter.theValue(name).into(ShoppingSiteUI.TXT_NAME),
                Enter.theValue(lastname).into(ShoppingSiteUI.TXT_LASTNAME),
                Enter.theValue(zipcode).into(ShoppingSiteUI.TXT_POSTALCODE),

                Click.on(ShoppingSiteUI.CONTINUE_BUTTON)

        );
    }
}