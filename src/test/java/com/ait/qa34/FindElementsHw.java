package com.ait.qa34;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class FindElementsHw {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test
    public void findElementByTagName() {
        //find element by tag name
        WebElement element = driver.findElement(By.tagName("ul"));
        System.out.println(element.getText());

        WebElement element1 = driver.findElement(By.tagName("img"));
        System.out.println(element1.getText());

        //find list of elements by tag name
        List<WebElement> elements = driver.findElements(By.tagName("li"));
        System.out.println(elements.size());
    }


    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
