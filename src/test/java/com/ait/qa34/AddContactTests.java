package com.ait.qa34;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddContactTests extends TestBase{
    @BeforeMethod
    public void ensurePrecondition() {
        click(By.cssSelector("[href='/login']"));
        type(By.name("email"), "manuel@gm.com");
        type(By.name("password"), "Manuel1234$");
        click(By.cssSelector("[name='login']"));
    }

    @Test
    public void addContactPositiveTest() {

        click(By.cssSelector("[href='/add']"));

        type(By.cssSelector("input:nth-child(1)"),"Karl");

        type(By.cssSelector("input:nth-child(2)"),"Adam");

        type(By.cssSelector("input:nth-child(3)"),"1234567890");

        type(By.cssSelector("input:nth-child(4)"),"adam@gm.com");

        type(By.cssSelector("input:nth-child(5)"),"Berlin");

        type(By.cssSelector("input:nth-child(6)"),"goalkeeper");

    }
}
