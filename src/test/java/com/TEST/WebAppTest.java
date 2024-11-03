package com.TEST;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class WebAppTest {
    private WebDriver driver;

    @BeforeClass
    public void setUp() {
        // Set the path to your ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void testIndexPage() {
        driver.get("http://172.31.5.74:8080/CDEPLOYAPP/");
        WebElement heading = driver.findElement(By.tagName("h1"));
        Assert.assertEquals(heading.getText(), "Hello, World!");

        WebElement currentDateTime = driver.findElement(By.xpath("//p[contains(text(), 'Current date and time')]"));
        Assert.assertTrue(currentDateTime.getText().contains("Current date and time:"));
    }

    @Test
    public void testServlet() {
        driver.get("http://172.31.5.74:8080/CDEPLOYAPP/hello");
        WebElement servletMessage = driver.findElement(By.tagName("h2"));
        Assert.assertEquals(servletMessage.getText(), "Hello from HelloWorldServlet!");
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
