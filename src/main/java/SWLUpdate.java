import com.sun.rowset.internal.Row;
import javafx.scene.control.Cell;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.DateFormat;
import java.util.*;
import java.util.List;


public class SWLUpdate {

    public static void main(String... args) throws Exception {

          //  System.setProperty("webdriver.gecko.driver", "c:\\geckodriver.exe");
           // WebDriver driver = new FirefoxDriver();

        Path currentDir = Paths.get("");
        System.out.println(currentDir.toAbsolutePath());
        System.setProperty("webdriver.chrome.driver", currentDir.toAbsolutePath()+"\\chromedriver.exe");
       WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            WebDriverWait wait;
            wait = new WebDriverWait(driver, 60, 5);
            //driver.get("https://www.google.com/");
            WebElement wb;


        //  WebDriver driver;



        HashMap<String, String> msg_flag = new HashMap<String, String>()
        {{
            put("MALHOTRA Manas","N");
            put("SHARMA Ashutosh","N");
            put("PATHANIA Rishi","N");
            put("CHAUDHARI Swapnil","N");
            put("SHIRUDE Shubham","N");
            put("SHARMA Shruti","N");
            put("MITTAL Neeraj","N");
            put("DAR Nasib","N");
            put("ARORA Aniket","N");
            put("KWATRA Akash","N");
            put("TIWARI Manish","N");
            put("SINGH Abhishek","N");
            put("SHARMA Monika","N");
            put("GAWADE Satish","N");
            put("PUNJ Ruchika","N");
            put("AGARWAL Neeraj","N");

        }};
        try {
            //getting the google search box
           /* WebElement wb= wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("q")));
            wb.click();
            wb.clear();
            //Entering Teams to search
            wb.sendKeys("Teams");
            wb.submit();
            wb.clear();
            //Clicking on the first option from the list
            wb=  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[5]/div[2]/div[9]/div[1]/div[2]/div/div[2]/div[2]/div/div/div[1]/div/div[1]/a")));
            wb.click();*/
            driver.get("https://www.microsoft.com/en-in/microsoft-365/microsoft-teams/group-chat-software");
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/section/div[2]/div/section/div/div[1]/div/div/div/div/div[2]/a"))).click();
           //Switching tabs
            ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
            driver.switchTo().window(tabs2.get(0));
            driver.close();
            driver.switchTo().window(tabs2.get(1));
            wait = new WebDriverWait(driver, 60, 5);

            //Entering emailid
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("i0116"))).sendKeys("midhat.zehra@soprasteria.com");
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("idSIButton9"))).click();
            Thread.sleep(3000);
            //Entering password on SSO
            WebElement wb1=  wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("passwordInput")));
            Thread.sleep(3000);
            wb1.sendKeys("Koocha@27129");
            wb1.submit();

            //passwordInput through Robot

/**
           Thread.sleep(20000);
           //Entering credentials through Robot
            String s1 = "midhat.zehra@soprasteria.com";
            String s2 = "Koocha@27129";

            int a;
            Robot robot = new Robot();
            for (int i = 0; i < s1.length(); i++) {
                a = s1.charAt(i);
                a = a - 32;
                System.out.println(a);
                if (s1.charAt(i) == '.') {
                    robot.keyPress(KeyEvent.VK_DECIMAL);
                } else if (s1.charAt(i) == '@') {

                    robot.keyPress(KeyEvent.VK_SHIFT);


                    robot.keyPress(KeyEvent.VK_2);  // VK_WINDOWS key still pressed
                    robot.keyRelease(KeyEvent.VK_2);
                    robot.keyRelease(KeyEvent.VK_SHIFT);
                } else {
                    robot.keyPress(a);  // VK_WINDOWS key still pressed
                }

                Thread.sleep(300);
            }
            robot.keyPress(KeyEvent.VK_TAB);
            robot.keyRelease(KeyEvent.VK_TAB);
            for (int i = 0; i < s2.length(); i++) {
                a = s2.charAt(i);
                a = a - 32;
                System.out.println(a);
                if (s2.charAt(i) == 'K') {
                    robot.keyPress(KeyEvent.VK_SHIFT);
                    robot.keyPress(KeyEvent.VK_K);
                    robot.keyRelease(KeyEvent.VK_SHIFT);
                } else if (s2.charAt(i) == '@') {

                    robot.keyPress(KeyEvent.VK_SHIFT);


                    robot.keyPress(KeyEvent.VK_2);  // VK_WINDOWS key still pressed
                    robot.keyRelease(KeyEvent.VK_2);
                    robot.keyRelease(KeyEvent.VK_SHIFT);
                    break;
                } else {
                    robot.keyPress(a);  // VK_WINDOWS key still pressed
                }
                Thread.sleep(500);
            }


            robot.keyPress(KeyEvent.VK_2);
            robot.keyPress(KeyEvent.VK_7);
            robot.keyPress(KeyEvent.VK_1);
            robot.keyPress(KeyEvent.VK_2);
            robot.keyPress(KeyEvent.VK_9);
            robot.keyPress(KeyEvent.VK_ENTER);

            // wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("passwordInput"))).sendKeys("Koocha@27129");
            // wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("submitButton"))).click();
            Thread.sleep(2000);
**/
            //Clicking on Sign in another way
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("signInAnotherWay"))).click();
            //Selecting phone calling option
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/form/div/div/div[1]/div[2]/div[2]/div/div[2]/div/div[2]/div/div[2]/div"))).click();
           //Do not ask this again
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("idSIButton9"))).click();
            Thread.sleep(20000);
            //driver.navigate().refresh();
            //Clicking on Web instead
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/promote-desktop/div/div/div/div[1]/div[2]/div/a"))).click();
            //Selecting chats
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("app-bar-86fcd49b-61a2-4701-b771-54728cd291fb"))).click();
            //clicking on top most chat box
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[2]/div[2]/div[1]/div/left-rail/div/div/left-rail-chat-tabs/div/div/div[1]/div/div/chat-list-bridge/div/div[1]/div/ul/li[1]/div[2]/div/div/a"))).click();
             //Enter New message
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/div/messages-header/div[2]/div/message-pane/div/div[3]/new-message/div/div[2]/form/div[4]/div[1]/div[2]/div/div/div[2]/div/div/div"))).click();
            //clicking on chat box and getting it ready for typing
            // wb = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/div/messages-header/div[2]/div/message-pane/div/div[3]/new-message/div/div[2]/form/div[4]/div[1]/div[2]/div/div/div[2]/div/div/div")));
             //wb.sendKeys("Hi");
            Thread.sleep(15000);


            //Initializing array List for Storing Names and message
            ArrayList<WebElement> ChatName1 = new ArrayList<WebElement>();
            List<WebElement> msgText= new List<WebElement>() {
                public int size() {
                    return 0;
                }

                public boolean isEmpty() {
                    return false;
                }

                public boolean contains(Object o) {
                    return false;
                }

                public Iterator<WebElement> iterator() {
                    return null;
                }

                public Object[] toArray() {
                    return new Object[0];
                }

                public <T> T[] toArray(T[] a) {
                    return null;
                }

                public boolean add(WebElement webElement) {
                    return false;
                }

                public boolean remove(Object o) {
                    return false;
                }

                public boolean containsAll(Collection<?> c) {
                    return false;
                }

                public boolean addAll(Collection<? extends WebElement> c) {
                    return false;
                }

                public boolean addAll(int index, Collection<? extends WebElement> c) {
                    return false;
                }

                public boolean removeAll(Collection<?> c) {
                    return false;
                }

                public boolean retainAll(Collection<?> c) {
                    return false;
                }

                public void clear() {

                }

                public WebElement get(int index) {
                    return null;
                }

                public WebElement set(int index, WebElement element) {
                    return null;
                }

                public void add(int index, WebElement element) {

                }

                public WebElement remove(int index) {
                    return null;
                }

                public int indexOf(Object o) {
                    return 0;
                }

                public int lastIndexOf(Object o) {
                    return 0;
                }

                public ListIterator<WebElement> listIterator() {
                    return null;
                }

                public ListIterator<WebElement> listIterator(int index) {
                    return null;
                }

                public List<WebElement> subList(int fromIndex, int toIndex) {
                    return null;
                }
            };   //for storing message content
            List<WebElement> chatName= new List<WebElement>() {
                public int size() {
                    return 0;
                }

                public boolean isEmpty() {
                    return false;
                }

                public boolean contains(Object o) {
                    return false;
                }

                public Iterator<WebElement> iterator() {
                    return null;
                }

                public Object[] toArray() {
                    return new Object[0];
                }

                public <T> T[] toArray(T[] a) {
                    return null;
                }

                public boolean add(WebElement webElement) {
                    return false;
                }

                public boolean remove(Object o) {
                    return false;
                }

                public boolean containsAll(Collection<?> c) {
                    return false;
                }

                public boolean addAll(Collection<? extends WebElement> c) {
                    return false;
                }

                public boolean addAll(int index, Collection<? extends WebElement> c) {
                    return false;
                }

                public boolean removeAll(Collection<?> c) {
                    return false;
                }

                public boolean retainAll(Collection<?> c) {
                    return false;
                }

                public void clear() {

                }

                public WebElement get(int index) {
                    return null;
                }

                public WebElement set(int index, WebElement element) {
                    return null;
                }

                public void add(int index, WebElement element) {

                }

                public WebElement remove(int index) {
                    return null;
                }

                public int indexOf(Object o) {
                    return 0;
                }

                public int lastIndexOf(Object o) {
                    return 0;
                }

                public ListIterator<WebElement> listIterator() {
                    return null;
                }

                public ListIterator<WebElement> listIterator(int index) {
                    return null;
                }

                public List<WebElement> subList(int fromIndex, int toIndex) {
                    return null;
                }
            };  //for storing name


            //chatName=driver.findElements(By.xpath(".//*[contains (text(), '8/17') and @class ='ts-created message-datetime']/parent::div/preceding-sibling::div"));



           //For scrolling up
    /**  Actions move = new Actions(driver);
           WebElement   myElement = (new WebDriverWait(driver, 30))
                  .until(ExpectedConditions.visibilityOfElementLocated(By.className("tse-scrollbar simple-scrollbar overflowed")));


           // myElement.click();
            move.moveToElement(myElement).perform();
            Thread.sleep(500);
            move.moveToElement(myElement).clickAndHold();
            move.moveByOffset(0,-500);
            move.release();
            move.perform();
            Thread.sleep(500);
**/
            //Fetchin current date in the specifiled format
            Date currentDate = new Date();
            String  dateToStr = DateFormat.getDateInstance().format(currentDate);
            System.out.println("Date Format : "+dateToStr);
            Thread.sleep(10000);
            //Finding Names on the mentioned date

            //driver.findElements(By.xpath("//*[contains(@title,'Aug 18, 2020')]/parent::div/preceding-sibling::div"));

            EventFiringWebDriver ef= new EventFiringWebDriver(driver);
            ef.executeScript("document.querySelector('.ts-message-list').scrollTop=-1000");
            Thread.sleep(5000);

            chatName=driver.findElements(By.xpath(".//*[contains(@title,'"+dateToStr+"')]/parent::div/preceding-sibling::div"));
         //   chatName=driver.findElements(By.xpath(".//*[contains(@title,'Aug 19, 2020')]/parent::div/preceding-sibling::div"));
           // Thread.sleep(15000);
           //Finding message on mentioned date
            msgText=driver.findElements(By.xpath(".//*[contains(@title, '"+dateToStr+"')]/parent::div/parent::div/parent::div/following-sibling::div//div//div//div[contains (text(),'pdate')]"));


            //printing sizes
              System.out.println(chatName.size());
              System.out.println(msgText.size());


              //for maintaining List
              /* for (WebElement webElement : chatName) {
                    String name = webElement.getText();
                    if( name.equals("WATVE Vikram"));
                       chatName.remove(webElement);

                    System.out.println(name);

                }*/

            //iterating through hashmap and removing Vikram and blanks from list
            Iterator itr = chatName.iterator();
            while (itr.hasNext())
            {
                //int x = (Integer)itr.next();

                WebElement web  = (WebElement) itr.next();
                String name = web.getText();

                if( (name.equals("WATVE Vikram")) || (name.equals("")))
               itr.remove();


            }

            //Printing new size after removing extras
            System.out.println(chatName.size());

            //Replacing N by Y if name is SWL is updated
            for (int j = 0;j<chatName.size();j++ ){
                String name = chatName.get(j).getText();
               // String txt = msgText.get(j).getText();
                //if (name.equals(""))
                //name = "ZEHRA Midhat";
               // System.out.println(name+" : "+ txt);
                System.out.println(name);
                msg_flag.replace(name,"Y");
            }

            //Printing final version of HAshmap
            Iterator itr1 = msg_flag.entrySet().iterator();
            while (itr1.hasNext())
            {
                HashMap.Entry pair = (HashMap.Entry)itr1.next();
                System.out.println(pair.getKey() + " = " + pair.getValue());

            }

            //Searching another chat for posting results
             wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[(text() = 'PATHANIA Rishi')]"))).click();
            Thread.sleep(3000);

            //Actions actions = new Actions(driver);
           // actions.moveToElement(wb).click().perform();
            //  wb.click();
           // wb.sendKeys("Hi");
            // wb.sendKeys("Hi Rishi, Please note that these employees did not update SWL");
            String outputMsg="Hi Vikram, ";

            int count = Collections.frequency(new ArrayList<String>(msg_flag.values()), "N");
            if (count == 0)
            {
                outputMsg=outputMsg.concat("All updated SWL.");

            }
            else {


                Iterator itr2 = msg_flag.entrySet().iterator();
                String key = null;
                String value = null;

                while (itr2.hasNext()) {
                    HashMap.Entry pair = (HashMap.Entry) itr2.next();

                    value = (String) pair.getValue();
                    key = (String) pair.getKey();

                    if (value.equals("N")) {
                        String firstName;

                        if (count ==1 && !outputMsg.contains("and")){

                            outputMsg = outputMsg.concat("Only ");
                            firstName=key.substring(key.indexOf(" ")+1);
                            firstName=firstName.concat(" "+key.substring(0,1));
                            outputMsg = outputMsg.concat(firstName);

                            outputMsg = outputMsg.concat(" is left.");
                            break;
                        }
                        else if (count ==1 ) {
                            firstName = key.substring(key.indexOf(" ") + 1);
                            firstName = firstName.concat(" " + key.substring(0, 1));
                            outputMsg = outputMsg.concat(firstName);
                            outputMsg = outputMsg.concat(" are left.");
                            break;
                        }
                        else{
                            firstName = key.substring(key.indexOf(" ") + 1);
                            firstName = firstName.concat(" " + key.substring(0, 1));
                            outputMsg = outputMsg.concat(firstName);
                            count--;
                            if (count == 1) {
                                outputMsg = outputMsg.concat(" and ");
                            } else
                                outputMsg = outputMsg.concat(", ");
                        }

                    }

                }

            }
            System.out.println(outputMsg);

         wb=   wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/div/messages-header/div[2]/div/message-pane/div/div[3]/new-message/div/div[2]/form/div[4]/div[1]/div[2]/div/div/div[2]/div/div/div")));
           wb.sendKeys(outputMsg);
        Thread.sleep(3000);
       //wb.click();
          // Thread.sleep(1000);
        //wb.submit();
              wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/div/messages-header/div[2]/div/message-pane/div/div[3]/new-message/div/div[3]/div[2]/button"))).click();

            //  robot.keyPress(KeyEvent.VK_ENTER);
            ///html/body/div[2]/div[2]/div[2]/div[1]/div/messages-header/div[2]/div/message-pane/div/div[3]/new-message/div/div[2]/form/div[4]/div[1]/div[2]/div/div/div[2]/div/div/div/div
            // driver.switchTo().alert();
            //Alert alert = wait.until(ExpectedConditions.alertIsPresent());
            //alert.authenticateUsing(new UserAndPassword("mzehra", "Koocha@27129"));
            //Selenium-WebDriver Java Code for entering Username & Password as below:
            //  driver.findElement(By.xpath("//div[@label='User Name:']")).sendKeys("mzehra");
            // driver.findElement(By.xpath("//div[@label='Password:']")).sendKeys("Koocha@27129");
            //  driver.switchTo().alert().accept();
            // driver.switchTo().defaultContent();

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e);
        }

    }
}