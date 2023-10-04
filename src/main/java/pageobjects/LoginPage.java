package pageobjects;

import lombok.Getter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Getter
public class LoginPage  {


    @Autowired
    public LoginPage (WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@placeholder='First Name']")
    private WebElement txtNombre;

    @FindBy(xpath = "//input[@placeholder='Last Name']")
    private WebElement txtApellido;

    @FindBy(xpath = "//input[@type='email']")
    private WebElement txtemail;

    @FindBy(xpath = "//input[@type='tel']")
    private WebElement txttelefono;

    @FindBy(xpath = "//input[@value='Male']")
    private WebElement radioMale;

    @FindBy(xpath = "//input[@value='FeMale']")
    private WebElement radioFemale;

    @FindBy(xpath = "//select[@id='Skills']")
    private WebElement selectSkills;

    @FindBy(xpath = "//span[@role='combobox']")
    private WebElement selectPais;

    @FindBy(xpath = "//select[@id='yearbox']")
    private WebElement selecYear;

    @FindBy(xpath = "//select[@placeholder='Month']")
    private WebElement selectMes;

    @FindBy(xpath = "//select[@id='daybox']")
    private WebElement selectDia;

    @FindBy(xpath = "//input[@id='firstpassword']")
    private WebElement txtpassword;

    @FindBy(xpath = "//input[@id='secondpassword']")
    private WebElement txtconfimPassword;

    @FindBy(xpath = "//button[@id='submitbtn']")
    private WebElement btnConfirmar;



}
