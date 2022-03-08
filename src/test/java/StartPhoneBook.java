import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class StartPhoneBook {

    WebDriver wd;

    @Test
    public void startPhoneBook(){
        wd = new ChromeDriver(); //opredeljaem v kakom brausere

        //wd.get("https://contacts-app.tobbymarshall815.vercel.app/login");// open brauser
        wd.navigate().to("https://contacts-app.tobbymarshall815.vercel.app/");// open +history
        wd.manage().window().maximize();//open vsego ekrana

        //steps of test login Success:
        // 1. open login form -> find login btn + click -> opened form login
       // WebElement el = wd.findElement(By.id("idel"));//найди элемент и положи в el
        //List<WebElement> list = wd.findElements(By.id("idel"));//поиск много элементов и собрать в коллекцию в List
        // WebElement a = wd.findElement(By.tagName("a")); поиск элементов с тегом "а"
        List<WebElement> elements = wd.findElements(By.tagName("a"));//выдаст коллекцию с тремя элементами "a"
        WebElement login = elements.get(2);// выдаст второй элемент "a", нумерация начинается с нуля
        login.click();

       // WebElement element = wd.findElement(By.id("root")); поиск по id
        //WebElement element1 = wd.findElement(By.className("container")); поиск по наименованию class



        // fill email -> find email element + click + clear + type email
        //fill password -> find password element + click + clear + type password
        //click login btn > find login element + click



        //Assert - sovpadaet li aktualnyi rez-t c ozhidaemym


        // wd.close();//close one Tab
       // wd.quit();//close all Tab
    }

    @Test

    public void home(){

        wd = new ChromeDriver();
        wd.navigate().to("https://contacts-app.tobbymarshall815.vercel.app/login");
        wd.manage().window().maximize();

        //wd.findElement(By.tagName());


        WebElement el1 = wd.findElement(By.tagName("body"));
        WebElement el2 = wd.findElement(By.tagName("div"));
        WebElement el3 = wd.findElement(By.tagName("h1"));
        WebElement el4 = wd.findElement(By.tagName("a"));
        WebElement el5 = wd.findElement(By.tagName("input"));
        WebElement el6 = wd.findElement(By.tagName("br"));
        WebElement el7 = wd.findElement(By.tagName("button"));

        //wd.findElement(By.id());

        WebElement el8 = wd.findElement(By.id("root"));

        //wd.findElement(By.className());

        WebElement el9 = wd.findElement(By.className("container"));
        WebElement el10 = wd.findElement(By.className("navbar-component_nav__1X_4m"));
        WebElement el11 = wd.findElement(By.className("active"));
        WebElement el12 = wd.findElement(By.className("login_login__3EHKB"));

        //by linkText

        WebElement el13 = wd.findElement(By.linkText("HOME"));
        WebElement el14 = wd.findElement(By.linkText("ABOUT"));
        WebElement el15 = wd.findElement(By.linkText("LOGIN"));
    }

    @Test
    public void cssLocatorTest() {

        wd = new ChromeDriver();
        wd.navigate().to("https://contacts-app.tobbymarshall815.vercel.app/login");
        wd.manage().window().maximize();

        wd.findElement(By.cssSelector(""));// поиск по CSS Selector

        //если моя стратегия By tagName
        wd.findElement(By.cssSelector("div"));
        wd.findElement(By.cssSelector("a"));

        //поиск By class
        wd.findElement(By.cssSelector(".login_login__3EHKB"));

        //поиск By id
        wd.findElement(By.cssSelector("#root"));

        //поиск по атрибуту
        wd.findElement(By.cssSelector("[placeholder]"));
        wd.findElement(By.cssSelector("[placeholder='Password']"));
        wd.findElement(By.cssSelector("[placeholder *='ss']"));
        wd.findElement(By.cssSelector("[placeholder $='rd']"));



    }
}
