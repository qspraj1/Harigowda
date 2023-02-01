package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Generic.Generic;

public class Pom extends Sample 
{
@FindBy(id="email")
private WebElement username;
@FindBy(id="pass")
private WebElement password;
@FindBy(name="login")
private WebElement btn;
public Pom(WebDriver driver)
{
	PageFactory.initElements(driver,this);
}
public void UN(String un)
{
	username.sendKeys(un);
	
}
public void PWD(String pwd)
{
	password.sendKeys(pwd);
}
public void BTN()
{
	btn.click();
}
}
