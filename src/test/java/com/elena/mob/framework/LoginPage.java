package com.elena.mob.framework;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class LoginPage extends  HelperBase{
    public LoginPage(AppiumDriver driver) {
        super(driver);
    }

    public void fillLoginForm() throws InterruptedException {
        type(By.id("user"), "rochman.elena@gmail.com");
        waitForElementLocatedAndClick(By.xpath("//*[@text='LOG IN']"), 20);
//        Thread.sleep(5000);
//        if(isElementPresent(By.xpath("//*[@text='LOG IN']"))){
//            click(By.xpath("//*[@text='LOG IN']"));
//            Thread.sleep(5000);
//            if(waitForElementPresent(By.id("button_once"), 30)){
//                click(By.xpath("//*[@text='JUST ONCE']"));
//            }
               // Thread.sleep(7000);
                waitForElementLocatedAndClick(By.xpath("//*[@content-desc='Continue']"), 60);
        Thread.sleep(7000);

        type(By.id("password"), "12345.com");
    }



    public void confirmLogin() {
        click(By.id("authenticate"));
    }
}
