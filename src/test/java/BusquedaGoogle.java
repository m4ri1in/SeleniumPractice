import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class BusquedaGoogle {

    @Test
    public void CP_001() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        // Le indicamos que nos abra el navegador en pantalla completa
        driver.manage().window().maximize();


        // 1- Ingresar a google
        // 2- Seleccionar input de busqueda y enviar la palabra QA
        // 3- Apretar enter
        // 4- validar que nos dirija a la pagina de los resultados


        //1-Ingresamos a google

        driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");


        //2-elemento caja de busqueda


        WebElement inputEmail = driver.findElement(By.id("email"));
        WebElement inputPassword = driver.findElement(By.id("passwd"));
        WebElement buttonSignIn = driver.findElement(By.id("SubmitLogin"));


        inputEmail.sendKeys("emildsn09@gmail.com");
        inputPassword.sendKeys("Password1");
        buttonSignIn.click();


        //elemento que nos aparece al hacer la busqueda
        WebElement resultados = driver.findElement(By.xpath("//h1[normalize-space()='My account']"));
        String resultado_real = resultados.getText();

        // el resultado esperado que nos debería aparecer
        String resultadoEsperado = "MY ACCOUNT";

        // Acá validamos que el resultado esperado sea igual que el resultado obtenido
        Assert.assertEquals(resultado_real, resultadoEsperado);

        //cerrar webdriver
        driver.quit();
    }

    @Test
    public void ejemplo3() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.demoblaze.com");
        WebElement logInButton = driver.findElement(By.xpath("//a[@id='login2']"));
        logInButton.click();
        WebElement userNameBox = driver.findElement(By.id("loginusername"));
        userNameBox.sendKeys("pepepompin");
        WebElement logInBox = driver.findElement(By.xpath("//input[@id='loginpassword']"));
        logInBox.sendKeys("kamchatka");
        WebElement logButton = driver.findElement(By.xpath("//button[normalize-space()='Log in']"));
        logButton.click();
        WebElement Validacion = driver.findElement(By.xpath("//*[contains(text(),'Welcome pepepompin')]"));
        String ValidacionReal = Validacion.getText();
        String ValidacionEsperada = "Welcome pepepompin";
        Assert.assertEquals(ValidacionReal, ValidacionEsperada);
        driver.quit();
    }

    @Test
    public void CP_002() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        // Le indicamos que nos abra el navegador en pantalla completa
        //Realiza el siguiente TC
        //1-Abrir Chrome
        //2-Abrir la url http://www.ebay.com

        driver.get("https://www.ebay.com/");
        //3-Ingresar en el input Buscar articulos la palabra “Pilas"
        WebElement inputBuscarArticulos = driver.findElement(By.xpath("//input[@id='gh-ac']"));
        inputBuscarArticulos.sendKeys("Pilas");
        //4-Hacer click sobre el boton buscar
        WebElement botonBuscar = driver.findElement(By.id("gh-btn"));
        botonBuscar.click();
        WebElement resultadosPilas = driver.findElement(By.xpath("//span[@aria-label='Todos los anuncios Vista actual']"));
        String resultado_real = resultadosPilas.getText();
        // el resultado esperado que nos debería aparecer
        String resultadoEsperado = "Todos los anuncios";
        // Acá validamos que el resultado esperado sea igual que el resultado obtenido
        Assert.assertEquals(resultado_real, resultadoEsperado);
        //cerrar webdriver
        driver.quit();
    }


    @Test
    public void CP_003() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        // Le indicamos que nos abra el navegador en pantalla completa
        //Realiza el siguiente TC
        //1-Abrir Chrome
        //2-Abrir la url http://www.ebay.com

        driver.get("https://www.google.com/");
        //3-Ingresar en el input Buscar articulos la palabra “Pilas"
        WebElement inputBuscador = driver.findElement(By.xpath("//input[@id='gh-ac']"));
        inputBuscador.sendKeys("Pilas");
        //4-Hacer click sobre el boton buscar
        WebElement botonBuscar = driver.findElement(By.id("gh-btn"));
        botonBuscar.click();
        WebElement resultadosPilas = driver.findElement(By.xpath("//span[@aria-label='Todos los anuncios Vista actual']"));
        String resultado_real = resultadosPilas.getText();
        // el resultado esperado que nos debería aparecer
        String resultadoEsperado = "Todos los anuncios";
        // Acá validamos que el resultado esperado sea igual que el resultado obtenido
        Assert.assertEquals(resultado_real, resultadoEsperado);
        //cerrar webdriver
        driver.quit();
    }


}
