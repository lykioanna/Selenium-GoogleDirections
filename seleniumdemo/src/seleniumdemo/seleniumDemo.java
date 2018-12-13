package seleniumdemo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumDemo {

    public static void main(String[] args) throws InterruptedException {
        //declaration
        WebDriver driver= new ChromeDriver();
        driver.get("http://www.google.com");
        driver.manage().window().maximize();

        WebElement element= driver.findElement(By.name("q"));

        //searches for Intrasoft
        element.sendKeys("Intrasoft");
        Thread.sleep(2000);
        element.submit();

        //get directions
        driver.findElement(By.xpath("//*[@id=\"lu_map\"]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"pane\"]/div/div[1]/div/div/div[1]/button[2]/div")).click();

        //driver.quit();

    }
}
