package com.eaapp.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EaappPage extends  BasePage{

    @FindBy(id="UserName")
    public WebElement userNameInputBox;


    @FindBy(xpath = "//option[@value='1']")
    public WebElement gradeValue1;
    @FindBy(xpath = "//a[@href='/Employee/Delete/234']")
    public WebElement deleteLink;

}
