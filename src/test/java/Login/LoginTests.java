package Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LoginTests {
    private WebDriver driver;

    //import chromeDriver
    public void setUp() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();

        //input project URL = Github login URL
        driver.get("https://github.com/");
        //waiting for globally
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //maximise the window
        driver.manage().window().maximize();
        //get page title
        System.out.println(driver.getTitle());

        //Locate Sign In button
        driver.findElement(By.xpath("/html/body/div[1]/header/div/div[2]/div[2]/a[1]")).click();

        //Locate username field
        driver.findElement(By.id("login_field")).sendKeys("oyejideoyekunle@gmail.com");

        //Locate password field
        driver.findElement(By.id("password")).sendKeys("holyspirit17.");

        //Click on sign in button
        driver.findElement(By.xpath("//*[@id=\"login\"]/form/div[4]/input[12]")).click();


        Thread.sleep(10000);
        //close the  after test
        driver.quit();
    }


    //initiate the test run command
    public static void main (String[] args) throws InterruptedException {
        LoginTests test = new LoginTests();
        test.setUp();
    }
}

