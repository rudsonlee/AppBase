import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class TelaLogin {


    public TelaLogin(AppiumDriver<MobileElement> driver){
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

@AndroidFindBy(accessibility = "email")  //acessando email
    private MobileElement campoEmail;

    @AndroidFindBy(accessibility = "password") //acessando senha
    private MobileElement campoSenha;

    @AndroidFindBy(accessibility = "login-button") // clicando no botão de entrar
    private MobileElement botaoEntrar;



    public void logar () throws InterruptedException {
        Thread.sleep(5000);  //aguardando 5segundos
        campoEmail.sendKeys("teste@teste.com"); //digitar o email
        campoSenha.sendKeys("123456");// digitar a senha
        botaoEntrar.click(); //clicando no botao entrar
    }

}
