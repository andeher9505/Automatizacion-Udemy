package util.driver;

import enums.Navegador;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {

    public static WebDriver obtener(Navegador navegador){

        if (Navegador.chrome == navegador){
            System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");
            return new ChromeDriver();
        }
        if (Navegador.firefox == navegador){
            System.setProperty("webdriver.gecko.driver", "src/main/resources/drivers/geckodriver.exe");
            return new FirefoxDriver();
        }
        throw new IllegalArgumentException("El navegador no existe" + navegador);
    }

}
