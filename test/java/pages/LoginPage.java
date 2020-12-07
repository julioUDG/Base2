package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends NavegadorBasePage {

    public LoginPage(WebDriver navegador) {
        super(navegador);
    }


    public LoginPage  digitarUsuario(String usuario) {
        navegador.findElement(By.name("username")).sendKeys(usuario);

        return this;
    }
    public LoginPage digitarSenha(String senha){
        navegador.findElement(By.name("password")).sendKeys(senha);

        return this;
    }
    public HomePage clicarLogin(){
        navegador.findElement(By.className("button")).click();

    return new HomePage(navegador);

    }
}
