package com.saucedemo.tasks;

import com.saucedemo.userinterfaces.ShoppingSiteUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class ShoppingCart implements Task {

    public static ShoppingCart theItems() {
        return Tasks.instrumented(ShoppingCart.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ShoppingSiteUI.SHOPPING_CART_BUTTON)
        );
    }
}