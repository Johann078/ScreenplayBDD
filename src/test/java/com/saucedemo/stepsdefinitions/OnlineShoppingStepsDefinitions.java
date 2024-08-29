package com.saucedemo.stepsdefinitions;

import com.saucedemo.tasks.*;
import com.saucedemo.userinterfaces.ShoppingSiteUI;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;




import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class OnlineShoppingStepsDefinitions {

    @Managed(driver = "chrome")
    WebDriver hisDriver;

    @Before
    public void setUp() {
        OnStage.setTheStage(OnlineCast.ofStandardActors());
        OnStage.theActorCalled("shopper");
        theActorInTheSpotlight().can(BrowseTheWeb.with(hisDriver));
    }

    @Given("^the user is on the login page$")
    public void theUserIsOnTheLoginPage() {
        theActorInTheSpotlight().wasAbleTo(Open.url("https://www.saucedemo.com/"));
    }

    @When("^the user enters valid credentials$")
    public void theUserEntersValidCredentials() {
        theActorInTheSpotlight().attemptsTo(Login.withCredentials("standard_user", "secret_sauce"));
    }

    @When("^the user adds multiple items to the cart$")
    public void theUserAddsMultipleItemsToTheCart() {
              List<String> productIds = Arrays.asList(
                "add-to-cart-sauce-labs-backpack",
                "add-to-cart-sauce-labs-bike-light"
        );

        theActorInTheSpotlight().attemptsTo(AddItemsToCart.with(productIds));
    }
    @When("^the user clicks on the shopping cart button$")
    public void theUserClicksOnTheChoppingCartButton() {
        theActorInTheSpotlight().attemptsTo(ShoppingCart.theItems());
    }

    @When("^the user proceeds to checkout$")
    public void theUserProceedsToCheckout() {
        theActorInTheSpotlight().attemptsTo(Checkout.theItems("johan","Romero","123154651"));
    }



    @Then("^the cart should display one item$")
    public void theCartShouldDisplayOneItem() {
        // Assertions go here
    }

    @Then("^the user completes the checkout process$")
    public void theUserCompletesTheCheckoutProcess() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                FinalizeOrder.theItems(),
                WaitUntil.the(ShoppingSiteUI.THANK_YOU_MESSAGE, WebElementStateMatchers.isVisible())
        );

        String actualMessage = Text.of(ShoppingSiteUI.THANK_YOU_MESSAGE).viewedBy(OnStage.theActorInTheSpotlight()).resolve();
        assertThat("The thank you message was not as expected", actualMessage, equalTo("Thank you for your order!"));


    }



}