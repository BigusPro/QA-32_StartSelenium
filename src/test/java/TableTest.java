import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TableTest {

    WebDriver wd;

    @Test
    public void tableCss(){
        wd = new ChromeDriver();
        wd.manage().window().maximize();
        wd.navigate().to("https://www.w3schools.com/css/css_table.asp");

        WebElement el = wd.findElement(By.cssSelector("#customers td:last-child"));

        //поиск по тексту xPath и CSS одного и того же пути
        wd.findElement(By.xpath("//*[text()='Maria Anders']"));//менее подвержена каким либо изменениям
        wd.findElement(By.cssSelector("#customers tr:nth-child(2) td:nth-child(2)"));// любые изменения могут привести к нарушению поиска
        wd.findElement(By.xpath("//*[@id='customers']//tr[2]/td[2]"));

    }

    @Test
    public void xPathTests(){
        wd = new ChromeDriver();
        wd.manage().window().maximize();
        wd.navigate().to("file:///C:/Users/natal/Downloads/index.html");

        WebElement item1 = wd.findElement(By.xpath("//a[@href='#item1']"));//нашли элемент
        String textItem1 = item1.getText();//у Webelement забираем text, он возвращает переменную типа String и результат вернет String с именем textItem1
        System.out.printf("Text of element Item1 --->"+textItem1);
        Assert.assertEquals(textItem1,"Item 1");//получи/вытяни textItem1 и сравни его с ожидаемым Item1.Если тексты равны, то тест пройден

        WebElement item2 = wd.findElement(By.xpath("//a[@href='#item2']"));
        String textItem2 = item2.getText();
        System.out.printf("Text of element Item1 --->"+textItem2);
        Assert.assertEquals(textItem2,"Item 2");

        WebElement item3 = wd.findElement(By.xpath("//a[@href='#item3']"));
        String textItem3 = item3.getText();
        System.out.printf("Text of element Item1 --->"+textItem3);
        Assert.assertEquals(textItem3,"Item 3");

        WebElement item4 = wd.findElement(By.xpath("//a[@href='#item4']"));
        String textItem4 = item4.getText();
        System.out.printf("Text of element Item1 --->"+textItem4);
        Assert.assertEquals(textItem4,"Item 4");

        //Table

        WebElement europe = wd.findElement(By.xpath("//*[text()='Europe']"));
        String textEurope = europe.getText();
        Assert.assertEquals(textEurope,"Europe");

        WebElement asia = wd.findElement(By.xpath("//*[text()='Asia']"));
        String textAsia = asia.getText();
        Assert.assertEquals(textAsia,"Asia");

        WebElement canada = wd.findElement(By.xpath("//*[text()='Canada']"));
        String textCanada = canada.getText();
        Assert.assertEquals(textCanada,"Canada");

        //click на красный квадрат и сверка надписи

        item1.click();//нажимаем на Item1
        WebElement message = wd.findElement(By.xpath("//p[@class='message']"));//нашли элемент
        String textMessage = message.getText();//забираем текст у message через get и закладываю в String textMessage
        Assert.assertEquals(textMessage,"Clicked by Item 1");//сверяем тексты, что ожидали то и получили


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
