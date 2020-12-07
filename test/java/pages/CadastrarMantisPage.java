package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CadastrarMantisPage extends NavegadorBasePage {

    public CadastrarMantisPage(WebDriver navegador) {
        super(navegador);
    }

    public CadastrarMantisPage category(String Category){
        WebElement category = navegador.findElement(By.name("category_id"));
        Select cat = new Select(category);
        cat.selectByVisibleText("Category");
        return this;
    }
    public CadastrarMantisPage reproducibility(String Reproducibility ){
        WebElement reproducibility = navegador.findElement(By.name("reproducibility"));
        Select repro = new Select(reproducibility);
        repro.selectByVisibleText(Reproducibility);
        return this;
    }

    public CadastrarMantisPage severity(String Severity){
        WebElement severity = navegador.findElement(By.name("severity"));
        Select seve = new Select(severity);
        seve.selectByVisibleText(Severity);
        return this;
    }
    public CadastrarMantisPage priority(String Priority){
        WebElement priority = navegador.findElement(By.name("priority"));
        Select prio = new Select(priority);
        prio.selectByVisibleText(Priority);

        return this;
}
    public CadastrarMantisPage selectProfile(String Profile) {
        WebElement profile = navegador.findElement(By.name("profile_id"));
        Select prof = new Select(profile);
        prof.selectByVisibleText(Profile);

        return this;
    }

    public CadastrarMantisPage platform(String Platform) {
        navegador.findElement(By.id("platform")).sendKeys(Platform);

        return this;
    }
    public CadastrarMantisPage os(String OS) {
        navegador.findElement(By.id("os")).sendKeys(OS);

        return this;
    }
    public CadastrarMantisPage osVersion(String OSVersion) {
        navegador.findElement(By.id("os_build")).sendKeys(OSVersion);

        return this;
    }
    public CadastrarMantisPage summary(String Summary) {
        navegador.findElement(By.name("summary")).sendKeys(Summary);

        return this;
    }
    public CadastrarMantisPage description(String Description ) {
        navegador.findElement(By.name("description")).sendKeys(Description);

        return this;
    }
    public CadastrarMantisPage stepsReproduce(String stepsReproduce) {
        navegador.findElement(By.name("steps_to_reproduce")).sendKeys(stepsReproduce);

        return this;
    }
    public CadastrarMantisPage aditionalInfomation(String aditionalInfomation ) {
        navegador.findElement(By.name("additional_info")).sendKeys(aditionalInfomation);

        return this;
    }
    public CadastrarMantisPage viewStatus() {
        navegador.findElement(By.xpath("/html/body/div[3]/form/table/tbody/tr[13]/td[2]/label[2]/input")).click();

        return this;
    }
    public CadastrarMantisPage reportStay() {
        navegador.findElement(By.id("report_stay")).click();

        return this;
    }
    public CadastrarMantisPage clicarSubmitReport() {
        navegador.findElement(By.xpath("/html/body/div[2]/form/table/tbody/tr[15]/td[2]/input")).click();

        return this;
    }

    public CadastrarMantisPage preencherFormulario (String Priority, String summary, String description, String Severity){
        WebElement category = navegador.findElement(By.name("category_id"));
        Select cat = new Select(category);
        cat.selectByVisibleText("[All Projects] Teste");

        WebElement reproducibility = navegador.findElement(By.name("reproducibility"));
        Select repro = new Select(reproducibility);
        repro.selectByVisibleText("sometimes");

        WebElement priority = navegador.findElement(By.name("priority"));
        Select prio = new Select(priority);
        prio.selectByVisibleText(Priority);


        WebElement profile = navegador.findElement(By.name("profile_id"));
        Select prof = new Select(profile);
        prof.selectByVisibleText("Desktop  Windows 10");

        navegador.findElement(By.id("platform")).sendKeys("Report");
        navegador.findElement(By.id("os")).sendKeys("OS356");
        navegador.findElement(By.id("os_build")).sendKeys("VE99874");
        navegador.findElement(By.name("summary")).sendKeys(summary);
        navegador.findElement(By.name("description")).sendKeys(description);
        navegador.findElement(By.name("steps_to_reproduce")).sendKeys("Usuário ativado");
        navegador.findElement(By.name("additional_info")).sendKeys("Usuário desativado");

        WebElement severity = navegador.findElement(By.name("severity"));
        Select seve = new Select(severity);
        seve.selectByVisibleText(Severity);

       // navegador.findElement(By.xpath("/html/body/div[3]/form/table/tbody/tr[13]/td[2]/label[2]/input")).click();

        navegador.findElement(By.id("report_stay")).click();
        navegador.findElement(By.xpath("/html/body/div[3]/form/table/tbody/tr[15]/td[2]/input")).click();

        return this;
    }

}

