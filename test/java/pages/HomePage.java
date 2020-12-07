package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HomePage extends NavegadorBasePage {


    public HomePage(WebDriver navegador) {
        super(navegador);
    }

    public ReportarMantisPage cadastrarErro(){
         navegador.findElement(By.linkText("Report Issue")).click();

         return new ReportarMantisPage(navegador);

     }

    public HomePage selecionarProjeto() {
        WebElement element = navegador.findElement(By.name("project_id"));
        Select combo = new Select(element);
        combo.selectByVisibleText("Julio Morais´s Project");

        return this;

    }
    public HomePage clicarSwitch(){
        navegador.findElement(By.xpath("/html/body/table[1]/tbody/tr/td[3]/form/input")).click();

        return this;

    }
}
