package config.spring;

import enums.Navegador;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import util.driver.DriverFactory;

import java.time.Duration;

@Configuration
@ComponentScan(basePackages = "pageobjects")
@PropertySource("classpath:/application.properties")
public class DirverConfig {

    // La anotacipn Bean es un objeto de java, se usa en diferentes lugares del proyecto en este caso en el objeto WebDriver
    //El Bean es incializado y manejado por el contenedor se spring, se delega las instancias a spring
    // y nos olvidamos de la instancia del driver

    @Value("${driver.type}")
    private Navegador driverType;

    @Value("${element.wait.timeout.seconds}")
    private int webDriverTimeout;
    @Bean
    public WebDriver webDriver(){
        return DriverFactory.obtener(driverType);
    }

    @Bean
    public WebDriverWait waitFor (){
        return new WebDriverWait(webDriver(), Duration.ofSeconds(webDriverTimeout));
    }


}
