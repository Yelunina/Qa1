package com.ait.firstSeleniumTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class FindElementsTests {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://ilcarro.web.app");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test
    public void findElementByTagName() {
        WebElement element = driver.findElement(By.tagName("h1"));
        System.out.println(element.getText());
        WebElement element1 = driver.findElement(By.tagName("a"));
        System.out.println(element1.getText());
        List<WebElement> elements = driver.findElements(By.tagName("a"));
        System.out.println(elements.size());
    }
    @Test
    public void findElementByLocators() {
        driver.findElement(By.id("city"));
        driver.findElement(By.className("input-container"));
        driver.findElement(By.linkText("Let the car work"));
        driver.findElement(By.partialLinkText("work"));
    }
    @Test
    public void findElementByCssSelector() {
        driver.findElement(By.cssSelector("h1"));
        driver.findElement(By.cssSelector("#city"));
        driver.findElement(By.cssSelector(".input-container"));
        driver.findElement(By.cssSelector("[for='city']"));
        driver.findElement(By.cssSelector("[href='/search']"));
        driver.findElement(By.cssSelector("[href*='car']"));
        driver.findElement(By.cssSelector("[href^='/let']"));
        driver.findElement(By.cssSelector("[href$='work']"));
    }
    @Test
    public void findElementByXpath() {
        driver.findElement(By.xpath("//h1"));
        driver.findElement(By.xpath("//*[@id='city']"));
        driver.findElement(By.xpath("//*[@class='input-container']"));
        driver.findElement(By.xpath("//*[contains(.,'car')]"));
        driver.findElement(By.xpath("//*[starts-with(@href,'/let')]"));
        driver.findElement(By.xpath("//span[text()=' Never mistaken for anything else ']"));
        driver.findElement(By.xpath("//span[.=' Never mistaken for anything else ']"));
        driver.findElement(By.xpath("//span[contains(text(),'mistake')]"));
        driver.findElement(By.xpath("//span[contains(.,'mistake')]"));
    }


    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
