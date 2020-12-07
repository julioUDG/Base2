package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ReportarMantisPage extends NavegadorBasePage {


    public ReportarMantisPage(WebDriver navegador) {
        super(navegador);
    }

    public ReportarMantisPage escolherProjeto() {
        WebElement element = navegador.findElement(By.xpath("/html/body/div[2]/form/table/tbody/tr[2]/td[2]/select"));
        Select combo = new Select(element);
        combo.selectByVisibleText("Julio Morais´s Project");

        return this;

    }
    public CadastrarMantisPage clicarProjeto(){
        navegador.findElement(By.xpath("/html/body/div[2]/form/table/tbody/tr[4]/td/input")).click();

        return new CadastrarMantisPage(navegador);

    }
}
