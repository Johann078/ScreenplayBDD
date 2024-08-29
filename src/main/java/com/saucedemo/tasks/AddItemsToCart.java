package com.saucedemo.tasks;

import com.saucedemo.userinterfaces.ShoppingSiteUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import java.util.List;

public class AddItemsToCart implements Task {
    private final List<String> productIds;


    public AddItemsToCart(List<String> productIds) {
        this.productIds = productIds;
    }


    public static AddItemsToCart with(List<String> productIds) {
        return Tasks.instrumented(AddItemsToCart.class, productIds);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        for (String productId : productIds) {
            actor.attemptsTo(
                    Click.on(ShoppingSiteUI.ADD_TO_CART_BUTTON.of(productId))
            );
        }
    }
}