package elevania;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class elevaniaproduct {

    private WebDriver driver;

    private void SetUp(){
        System.setProperty("webdriver.chrome.driver", "resource/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.elevenia.co.id/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id=\"mainPopBanner\"]/div[2]/a")).click();
        driver.findElement(By.id("AKCKwd")).click();
        driver.findElement(By.id("AKCKwd")).sendKeys("komputer");
        driver.findElement(By.cssSelector(".header-big .btn-search")).click();
        driver.findElement(By.cssSelector("#prod_25434442 img")).click();
        driver.findElement(By.cssSelector(".btnL:nth-child(1)")).click();
        driver.findElement(By.linkText("Ya")).click();
        driver.findElement(By.linkText("Hapus")).click();
        driver.findElement(By.id("chkDelPopY")).click();
        driver.quit();
    }
    public static void main(String args[]){
        elevaniaproduct productAdd = new elevaniaproduct();
        productAdd.SetUp();
    }
}
