package com.proyect.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class RegisterPage extends Base{

    private WebDriver driver;

    By myAccountLocator = By.className("dropdown");
    By registerLocator = By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[1]/a");

    By pageLocator = By.id("column-right");

    By firstNameLocator = By.name("firstname");
    By lastNameLocator = By.name("lastname");
    By mailLocator = By.id("input-email");

    By telephoneLocator =By.id("input-telephone");
    By passwordLocator = By.name("password");
    By confirmpassLocator = By.name("confirm");
    By checkBoxLocator = By.name("agree");
    By continueLocator = By.xpath("//*[@id=\"content\"]/form/div/div/input[2]");

    By titleLocator = By.xpath("/html/head/title");

    public RegisterPage(WebDriver driver) {

        super(driver);
    }



    public void registerUser() throws InterruptedException {
        Thread.sleep(2000);
        click(myAccountLocator);
        Thread.sleep(2000);
        click(registerLocator);
        if (isDisplayed(pageLocator)){
            type("Gabriel",firstNameLocator);
            type("Albornoz",lastNameLocator);
            type("lucioga1177727894@gmail.com",mailLocator);
            type("3813557788",telephoneLocator);
            type("123456",passwordLocator);
            type("123456",confirmpassLocator);
            click(checkBoxLocator);
            click(continueLocator);
        }else {
            System.out.println("Lapagina de registro no fue encontrada");
        }
    }





}
