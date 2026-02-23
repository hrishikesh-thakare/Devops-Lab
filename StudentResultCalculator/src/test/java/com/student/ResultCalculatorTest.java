package com.student;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ResultCalculatorTest {

    @Test
    public void testResultCalculation() {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        java.io.File file = new java.io.File("index.html");
        driver.get("file:///" + file.getAbsolutePath());

        driver.findElement(By.id("marks1")).sendKeys("70");
        driver.findElement(By.id("marks2")).sendKeys("80");
        driver.findElement(By.id("marks3")).sendKeys("90");

        driver.findElement(By.tagName("button")).click();

        String total = driver.findElement(By.id("totalMarks")).getText();
        String average = driver.findElement(By.id("averageMarks")).getText();
        String status = driver.findElement(By.id("statusBadge")).getText();

        Assert.assertEquals(total, "240");
        Assert.assertEquals(average, "80.00%");
        Assert.assertEquals(status, "Pass");

        driver.quit();
    }
}