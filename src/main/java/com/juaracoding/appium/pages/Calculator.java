package com.juaracoding.appium.pages;

import org.openqa.selenium.By;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
public class Calculator {

    private AndroidDriver<MobileElement> driver;

    public Calculator(AndroidDriver<MobileElement> driver){
        this.driver = driver;
    }
    By btnSatu = By.id("com.google.android.calculator:id/digit_1");
    By btnDua = By.id("com.google.android.calculator:id/digit_2");
    By btnKurang = By.id("com.google.android.calculator:id/op_sub");
    By btnKali = By.id("com.google.android.calculator:id/op_mul");
    By btnBagi = By.id("com.google.android.calculator:id/op_div");
    By btnSamaDengan = By.id("com.google.android.calculator:id/eq");
    By hasil = By.id("com.google.android.calculator:id/result_final");

    public void calcKurang(){
        driver.findElement(btnSatu).click();
        driver.findElement(btnKurang).click();
        driver.findElement(btnDua).click();
        driver.findElement(btnSamaDengan);
    }
    public void calcKali(){
        driver.findElement(btnSatu).click();
        driver.findElement(btnKali).click();
        driver.findElement(btnDua).click();
        driver.findElement(btnSamaDengan);
    }
    public void calcBagi(){
        driver.findElement(btnSatu).click();
        driver.findElement(btnBagi).click();
        driver.findElement(btnDua).click();
        driver.findElement(btnSamaDengan);
    }
    public String getTxtResult(){
        return driver.findElement(hasil).getText();
    }
}
