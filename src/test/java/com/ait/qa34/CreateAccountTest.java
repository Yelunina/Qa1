package com.ait.qa34;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateAccountTest extends TestBase {
    @Test(enabled = true)
    public void createNewAccountPositiveTest() {
       //Random random = new Random();
        //int i = random.nextInt(1000)+1000;
        //click on Register link
        click(By.cssSelector("[href='/register']"));

        //click on First name
       //driver.findElement(By.id("FirstName")).click();
       //driver.findElement(By.id("FirstName")).clear();
       //driver.findElement(By.id("FirstName")).sendKeys("Iryna");
        type(By.id("FirstName"),"Iryna");


        //click on Last name
        //driver.findElement(By.id("LastName")).click();
        //driver.findElement(By.id("LastName")).clear();
        //driver.findElement(By.id("LastName")).sendKeys("Yelunina");
        type(By.id("LastName"),"Yelunina");

        //enter Email
        //driver.findElement(By.id("Email")).click();
        //driver.findElement(By.id("Email")).clear();
        //driver.findElement(By.id("Email")).sendKeys("yelunina@ukr.net");
        //type(By.name("email"), "manuel" + i + "@gm.com")
        type(By.id("Email"),"yelunina@ukr.net");


        //enter Password
        //driver.findElement(By.id("Password")).click();
        //driver.findElement(By.id("Password")).clear();
        //driver.findElement(By.id("Password")).sendKeys("Yelunina1234$");
        type(By.id("Password"),"Yelunina1234$");

        //Confirm password
        //driver.findElement(By.id("ConfirmPassword")).click();
        //driver.findElement(By.id("ConfirmPassword")).clear();
        //driver.findElement(By.id("ConfirmPassword")).sendKeys("Yelunina1234$");
        type(By.id("ConfirmPassword"),"Yelunina1234$");



        //click on Register button
        //driver.findElement(By.id("register-button")).click();
        click(By.id("register-button"));

        //assert Continue button is present
        Assert.assertTrue(isElementPresent(By.cssSelector("[href='/customer/info']")));
    }
}
