import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TableTest {

    WebDriver wd;

    @Test
    public void tableCss(){
        wd = new ChromeDriver();
        wd.manage().window().maximize();
        wd.navigate().to("https://www.w3schools.com/css/css_table.asp");

        WebElement el = wd.findElement(By.cssSelector("#customers td:last-child"));

    }

    @Test
    public void homework(){
        wd = new ChromeDriver();
        wd.manage().window().maximize();
        wd.navigate().to("file:///C:/Users/natal/Downloads/index.html");

        WebElement item1 = wd.findElement(By.cssSelector("[href='#item1']"));
        WebElement item1_1 = wd.findElement(By.cssSelector("#nav ul li:first-child"));

        WebElement item2 = wd.findElement(By.cssSelector("[href='#item2']"));
        WebElement item2_1 = wd.findElement(By.cssSelector("#nav ul li [href='#item2']"));

        WebElement item3 = wd.findElement(By.cssSelector("[href='#item3']"));
        WebElement item3_1 = wd.findElement(By.cssSelector("#nav ul li [href='#item3']"));

        WebElement item4 = wd.findElement(By.cssSelector("[href='#item4']"));
        WebElement item4_1 = wd.findElement(By.cssSelector("#nav ul li:last-child"));

        WebElement input = wd.findElement(By.cssSelector("[placeholder='Type your name']"));
        WebElement input1 = wd.findElement(By.cssSelector("[name='name']"));
        WebElement input2 = wd.findElement(By.cssSelector("[placeholder='Type your surename']"));
        WebElement input3 = wd.findElement(By.cssSelector("[name='surename']"));

        WebElement button = wd.findElement(By.cssSelector("#form1 .btn"));

        //first column
        WebElement table = wd.findElement(By.cssSelector("#country-table td:first-child"));

        //midlle column
        WebElement table1 = wd.findElement(By.cssSelector("#country-table td:nth-child(2)"));

        //last column
        WebElement table2 = wd.findElement(By.cssSelector("#country-table td:last-child"));

        //Ukraine
        WebElement uk = wd.findElement(By.cssSelector("#country-table tr:nth-child(2) td:first-child"));

        //Russia
        WebElement ru = wd.findElement(By.cssSelector("#country-table tr:nth-child(3) td:nth-child(2)"));

        //Mexico
        WebElement me = wd.findElement(By.cssSelector("#country-table tr:last-child td:last-child"));

        //Israel
        WebElement il = wd.findElement(By.cssSelector("#country-table tr:nth-child(2) td:nth-child(2)"));

        //USA
        WebElement usa = wd.findElement(By.cssSelector("#country-table tr:nth-child(2) td:last-child"));

        //Chine
        WebElement ch = wd.findElement(By.cssSelector("#country-table tr:last-child td:nth-child(2)"));

        //Red Square
        WebElement sq = wd.findElement(By.cssSelector("#alert .message"));

    }
}
