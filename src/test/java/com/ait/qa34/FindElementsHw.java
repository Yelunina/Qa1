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

    @Test
    public void findElementByCssSelector() {
        driver.findElement(By.cssSelector("ul"));

        driver.findElement(By.cssSelector("#bar-notification"));
        driver.findElement(By.cssSelector("#dialog-notifications-error"));
        driver.findElement(By.cssSelector("#dialog-notifications-success"));

        driver.findElement(By.cssSelector(".ajax-loading-block-window"));
        driver.findElement(By.cssSelector(".loading-image"));
        driver.findElement(By.cssSelector(".master-wrapper-main"));

        driver.findElement(By.cssSelector("[type='text/javascript']"));
        driver.findElement(By.cssSelector("[href='/newproducts']"));
        driver.findElement(By.cssSelector("[href='/privacy-policy']"));
        driver.findElement(By.cssSelector("[href*='shoes']"));
        driver.findElement(By.cssSelector("[href^='/apparel']"));
        driver.findElement(By.cssSelector("[href^='/privacy']"));
        driver.findElement(By.cssSelector("[href$='shoes']"));
    }

    @Test
    public void findElementByXpath() {
        driver.findElement(By.xpath("//ul"));

        driver.findElement(By.xpath("//*[@id='bar-notification']"));
        driver.findElement(By.xpath("//*[@id='dialog-notifications-error']"));
        driver.findElement(By.xpath("//*[@id='dialog-notifications-success']"));

        driver.findElement(By.xpath("//*[@class='ajax-loading-block-window']"));
        driver.findElement(By.xpath("//*[@class='loading-image']"));
        driver.findElement(By.xpath("//*[@class='master-wrapper-main']"));

        driver.findElement(By.xpath("//*[contains(.,'shoes')]"));

        driver.findElement(By.xpath("//*[starts-with(@href,'/apparel')]"));
        driver.findElement(By.xpath("//*[starts-with(@href,'/privacy')]"));

    }


    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
