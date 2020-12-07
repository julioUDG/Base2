package suporte;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class UrlWeb {
    public static WebDriver createChrome() {
        //Abrir navegador
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Julio\\driver\\chromedriver.exe");
        WebDriver navegador = new ChromeDriver();
        navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        //URL inicial
        navegador.get("http://mantis-prova.base2.com.br");

        return navegador;
    }
}
