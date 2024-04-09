package com.ait.qa34;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Random;

public class CreateAccountTest extends TestBase{

    @Test()
    public void createNewAccountPositiveTest(){
        Random random = new Random();
        int i = random.nextInt(1000)+1000;

        // click on Login link
        click(By.cssSelector("[href='/register']"));
        type(By.id("FirstName"),"Iryna");
        type(By.id("LastName"),"Yelunina");
        //enter email
        type(By.id("Email"), "yelunina" + i + "@ukr.net");
        //enter password
        type(By.name("Password"), "Yelunina1234$");
        type(By.name("ConfirmPassword"), "Yelunina1234$");
        //click on Registration button
        click(By.id("register-button"));
        click(By.cssSelector("[value='Continue']"));
        //assert Sing Out button is present
        Assert.assertTrue(isElementPresent(By.cssSelector("div[class='header-links'] a[class='account']")));

    }

}
