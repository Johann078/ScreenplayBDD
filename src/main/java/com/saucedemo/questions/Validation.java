package com.saucedemo.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class Validation implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        // Implementation is context-based and not provided here.
        return null;
    }

    public static Validation compare() {
        return new Validation();
    }
}