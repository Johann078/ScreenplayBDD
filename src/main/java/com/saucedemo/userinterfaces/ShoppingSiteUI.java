package com.saucedemo.userinterfaces;


import net.serenitybdd.screenplay.targets.Target;

public class ShoppingSiteUI {
    public static final Target TXT_USERNAME = Target.the("Username input")
            .locatedBy("#user-name");
    public static final Target TXT_PASSWORD = Target.the("Password input")
            .locatedBy("#password");
    public static final Target BTN_LOGIN = Target.the("Login button")
            .locatedBy("#login-button");
    public static final Target ADD_TO_CART_BUTTON = Target.the("Add to cart button")
            .locatedBy("//*[@name='{0}']");
    public static final Target SHOPPING_CART_BUTTON = Target.the("Shoppin cart button")
            .locatedBy("//*[@id='shopping_cart_container']");
    public static final Target TXT_NAME = Target.the("Name input")
            .locatedBy("//*[@id='first-name']");
    public static final Target TXT_LASTNAME = Target.the("Lastname input")
            .locatedBy("//*[@id='last-name']");
    public static final Target TXT_POSTALCODE = Target.the("zipcode input")
            .locatedBy("//*[@id='postal-code']");
    public static final Target CHECKOUT_BUTTON = Target.the("Checkout button")
            .locatedBy("#checkout");

    public static final Target CONTINUE_BUTTON = Target.the("Continue button")
            .locatedBy("#continue");
    public static final Target FINISH_BUTTON = Target.the("finish button")
            .locatedBy("#finish");
    public static final Target THANK_YOU_MESSAGE = Target.the("thank you message")
            .locatedBy("//h2[@class='complete-header']");
}