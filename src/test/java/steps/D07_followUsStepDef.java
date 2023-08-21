package steps;

import base.TestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.P03_homePage;

public class D07_followUsStepDef extends TestBase {
    P03_homePage P03_homePageObject = new P03_homePage(driver);
    @When("User Click on Facebook Button")
    public void user_click_on_facebook_button() {
       P03_homePageObject.clickOnFacebookIcon();
    }
    @Then("User Is Redirected To Facebook Page")
    public void user_is_redirected_to_facebook_page() {

        Assert.assertEquals(driver.getCurrentUrl(),"https://www.facebook.com/nopCommerce");
    }
    @When("User Click on Twitter Button")
    public void user_click_on_twitter_button() {
        P03_homePageObject.clickOnTwitterIcon();
    }
    @Then("User Is Redirected To Twitter Page")
    public void user_is_redirected_to_twitter_page() {
        Assert.assertEquals(driver.getCurrentUrl(),"https://twitter.com/nopCommerce");
    }

    @When("User Click on Rss Button")
    public void user_click_on_rss_button() {
        P03_homePageObject.clickOnRssIcom();
    }
    @Then("User Is Redirected To Rss Page")
    public void user_is_redirected_to_rss_page() {
        Assert.assertEquals(driver.getCurrentUrl()," https://demo.nopcommerce.com/new-online-store-is-open");
    }

    @When("User Click on Youtube Button")
    public void user_click_on_youtube_button() {
        P03_homePageObject.clickOnYoutubeIcon();
    }
    @Then("User Is Redirected To Youtube Page")
    public void user_is_redirected_to_youtube_page() {
        Assert.assertEquals(driver.getCurrentUrl(),"https://www.youtube.com/user/nopCommerce");
    }
}
