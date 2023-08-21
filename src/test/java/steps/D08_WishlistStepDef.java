package steps;

import base.TestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;
import pages.P03_homePage;

public class D08_WishlistStepDef extends TestBase {
    P03_homePage P03_homePageObject = new P03_homePage(driver);
    @Given("User in Home Pagee")
    public void user_in_home_pagee() {
        P03_homePageObject.navigateToHomePage();
    }
    @When("User Click On Wishlist Button On This Product \"HTC One M8 Android L {double} Lollipop")
    public void user_click_on_wishlist_button_on_this_product_htc_one_m8_android_l_lollipop(Double double1) {
        P03_homePageObject.clickOnWishlistButton();

    }
    @Then("User Should See Success Message")
    public void user_should_see_success_message() {
       P03_homePageObject.getTextOfsuccessBar();
       Assert.assertEquals(driver.findElement(By.xpath("//p[@class='content']")).getText(),"The product has been added to your wishlist");
    }
    @Given("Useer Go To home page")
    public void useer_go_to_home_page() {
       P03_homePageObject.navigateToHomePage();
    }
    @When("User Click On Wishlist Button On This Product \"HTC One M8 Android L Lollipop")
    public void user_click_on_wishlist_button_on_this_product_htc_one_m8_android_l_lollipop() {
        P03_homePageObject.clickOnWishlistButton();
    }
    @When("User Click On Wishlist Button After The Succses Bar disappear")
    public void user_click_on_wishlist_button_after_the_succses_bar_disappear() {
        P03_homePageObject.clickOnWishListInSuccessBar();
    }
    @Then("User should get Qty value and verify it's bigger than {int}")
    public void user_should_get_qty_value_and_verify_it_s_bigger_than(Integer int1) {
        String count =   driver.findElement(By.className("qty-input")).getAttribute("value");
        int countint=    Integer.parseInt(count);
        Assert.assertTrue(countint>0);
    }
}
