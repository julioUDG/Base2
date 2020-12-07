package tests;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;
import suporte.UrlWeb;


public class MantisSemCampoObrigatorio {
    private WebDriver navegador;

    @Before
    public void setUp() {
        navegador = UrlWeb.createChrome();
    }

    @Test
    public void novoMantis() {
        new LoginPage(navegador)
                .digitarUsuario("julio.morais")
                .digitarSenha("497979")
                .clicarLogin()
                .cadastrarErro()
                .escolherProjeto()
                .clicarProjeto()
                .preencherFormulario("low","","","block");

        Assert.assertTrue(navegador.findElement(By.xpath("/html/body/div[2]/table/tbody/tr[1]/td"))
                .getText().contains("APPLICATION ERROR #11"));

    }

    @After
    public void tearDown() {
        navegador.quit();
    }

}

