package com.juaracoding.appium;

import com.juaracoding.appium.pages.Calculator;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;


import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

import static org.testng.Assert.assertEquals;
public class TestCalculator {

    private static AndroidDriver<MobileElement> driver;
    private Calculator calculator;

    @BeforeClass
    public void setUp() throws MalformedURLException{
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName","Pixel_2_API_24");
        capabilities.setCapability("uuid","emulator-5554");
        capabilities.setCapability("platformName","Android");
        capabilities.setCapability("platformVersion","13.0");
        capabilities.setCapability("appPackage","com.google.android.calculator2");
        capabilities.setCapability("appActivity","com.google.android.calculator2.Calculator");

        driver = new AndroidDriver<MobileElement>(new URL("http//127.0.0.1:4723/wd/hub"), capabilities);
    }
    @BeforeMethod
    public void pageObject(){
        calculator = new Calculator(driver);
    }
    @Test
    public void testKurang(){
        calculator.calcKurang();
        System.out.println("Hasil ="+calculator.getTxtResult());
        Assert.assertEquals(calculator.getTxtResult(),"3");
    }
    @Test
    public void testKali(){
        calculator.calcKali();
        System.out.println("Hasil ="+calculator.getTxtResult());
        Assert.assertEquals(calculator.getTxtResult(),"3");
    }
    @Test
    public void testBagi(){
        calculator.calcBagi();
        System.out.println("Hasil ="+calculator.getTxtResult());
        Assert.assertEquals(calculator.getTxtResult(),"3");
    }
    @AfterClass
    public void closeApp(){
        driver.quit();
    }
}
