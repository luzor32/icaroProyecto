package com.proyect.pom;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Register_test {

    private WebDriver driver;

    RegisterPage registerPage;

    @Before
    public void setUp(){
       registerPage = new RegisterPage(driver);
       driver = registerPage.ChromeDriverConnection();
       registerPage.visit("https://opencart.abstracta.us/");
    }
    @After
    public void tearDown(){
       //driver.quit();
    }
    @Test
    public void test() throws InterruptedException {
        registerPage.registerUser();

        assertTrue(driver.getTitle().equals("Your Account Has Been Created!"));

    }
}
