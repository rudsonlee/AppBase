import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class LoginTest {

private static TelaLogin TelaLogin;

   @BeforeClass
   public static void caps() throws MalformedURLException {
       DesiredCapabilities capabilities = new DesiredCapabilities();   // valores envviados para o Appium servidor
       capabilities.setCapability("deviceName", "Android Emulator"); // nome do emulador
       capabilities.setCapability("platformName", "Android"); // mostrando qual plataforma usando
       capabilities.setCapability("app", new File( "J:\\Automação\\Projetos\\ProjetoAPP\\apps\\qazandofood.apk")); //direcionando app integrado

       AppiumDriver<MobileElement> driver = new AndroidDriver<>(new URL("http://localhost:4723/wd/hub"), capabilities);
       TelaLogin = new TelaLogin(driver);
   }

   @Test
    public void testeLogin() throws InterruptedException { //
       TelaLogin.logar();

   }

}