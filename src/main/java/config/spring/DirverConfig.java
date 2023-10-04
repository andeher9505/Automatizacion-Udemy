package config.spring;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "pageobjects")
public class DirverConfig {

    // La anotacipn Bean es un objeto de java, se usa en diferentes lugares del proyecto en este caso en el objeto WebDriver
    //El Bean es incializado y manejado por el contenedor se spring, se delega las instancias a spring
    // y nos olvidamos de la instancia del driver

    @Bean
    public WebDriver webDriver(){
        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");
        return new ChromeDriver();
    }


}
