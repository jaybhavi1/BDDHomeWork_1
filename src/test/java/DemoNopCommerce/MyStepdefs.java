package DemoNopCommerce;

import cucumber.annotation.en.And;
import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;

/**
 * Created by user on 23/04/2017.
 */
public class MyStepdefs extends BaseTest
{

    @Given("^I am on HomePage$")
    public void iAmOnHomePage()
    {
        openBrowser();
    }

    @When("^I Click on Computer Category$")
    public void iClickOnComputerCategory()
    {
        driver.findElement(By.linkText("Computers")).click();
    }

    @And("^I Click on Desktop Category$")
    public void iClickOnDesktopCategory()
    {
        driver.findElement(By.xpath("//div/div/div[2]/ul/li/ul/li/a[@href='/desktops']")).click();
    }

    @Then("^I navigate to Desktop Category Successfully$")
    public void iNavigateToDesktopCategorySuccessfully()
    {
        Assert.assertTrue(driver.findElement(By.cssSelector("h1")).getText().contains("Desktops"),"I am not on Desktop page");
    }

    @Given("^I on Desktop Category page$")
    public void iOnDesktopCategoryPage()
    {

    }

    @When("^I click on Add To Cart Tab of Lenovo IdeaCentre (\\d+) All-in-One PC Product$")
    public void iClickOnAddToCartTabOfLenovoIdeaCentreAllInOnePCProduct(int arg0)
    {
        driver.findElement(By.xpath("(//input[@value='Add to cart'])[3]")).click();
    }

    @Then("^Product Successfully added to Shopping Cart$")
    public void productSuccessfullyAddedToShoppingCart()
    {
        Assert.assertTrue(driver.findElement(By.cssSelector("p.content")).getText().contains("The product has been added to your shopping cart"),
                "Product is not add to Cart");
        closeBrowser();
    }
}
