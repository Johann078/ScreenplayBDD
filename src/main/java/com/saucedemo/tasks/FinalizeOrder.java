package com.saucedemo.tasks;

import com.saucedemo.userinterfaces.ShoppingSiteUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class FinalizeOrder implements Task {

    public static FinalizeOrder theItems() {
        return Tasks.instrumented(FinalizeOrder.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ShoppingSiteUI.FINISH_BUTTON)
        );
    }
}