package com.ait.qa34;

import org.testng.annotations.BeforeMethod;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddItemToCart extends TestBase {
    @BeforeMethod
    public void ensurePrecondition(){
        clickOnLoginLink();
        fillLoginRegistracionForm(new User().setEmail("yelunina@ukr.net").setPassword("Yelunina1234$"));
        clickOnSaveButton();
    }

    @Test
    public void fillProduductPositivTest(){
        click(By.cssSelector(".item-box:nth-child(3) .buttons"));
        click(By.cssSelector(".ico-cart>.cart-label"));


    }

}
