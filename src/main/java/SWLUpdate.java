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
import java.io.*;
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

        File logFile = new File(currentDir.toAbsolutePath()+"\\logFile.txt");
        PrintStream ps = new PrintStream(logFile);
        String newLine = System.getProperty("line.separator");



        //  WebDriver driver;


        HashMap<String, String> msgFlag = new HashMap<String, String>() {{
            put("MALHOTRA Manas", "N");
            put("SHARMA Ashutosh", "N");
            put("PATHANIA Rishi", "N");
            put("CHAUDHARI Swapnil", "N");
            put("SHIRUDE Shubham", "N");
            put("SHARMA Shruti", "N");
            put("MITTAL Neeraj", "N");
            put("DAR Nasib", "N");
            put("ARORA Aniket", "N");
            put("KWATRA Akash", "N");
            put("TIWARI Manish", "N");
            put("SINGH Abhishek", "N");
            put("SHARMA Monika", "N");
            put("GAWADE Satish", "N");
            put("PUNJ Ruchika", "N");
            put("AGARWAL Neeraj", "N");

        }};
        try {
            WebElement wb;
            WebDriver driver = SwlUtility.openBrowser();  //Opening Browser
            System.setProperty("webdriver.chrome.driver", currentDir.toAbsolutePath() + "\\chromedriver.exe");
            // WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            WebDriverWait wait;
            wait = new WebDriverWait(driver, 60, 5);

            SwlUtility.openURL(driver,SwlPom.url); //Navigating to a specific URL
            SwlUtility.teamSignIn(wait,SwlPom.signInTeams); // Signing in Teams application
            SwlUtility.switchToFirstTab(driver); //Switching to next tab after clicking on sign in and closing first tab
            SwlUtility.ssoAuthentication(wait,driver,SwlPom.emailidField,SwlPom.emailID,SwlPom.submitEmailID,SwlPom.passwordField,SwlPom.password,3000); //sso authentication with SWL connection check
            SwlUtility.callAuthentication(wait,driver,SwlPom.signInAnotherWay,SwlPom.callXPath,SwlPom.donotshowthisgain); // Call authentication process
            Thread.sleep(20000);
            SwlUtility.goToChatgroup(wait,SwlPom.useWebApp,SwlPom.chats,SwlPom.tmsGroup); // Navigate to TMS group
            Thread.sleep(15000);
            SwlUtility.updateAbsenteesFlag(driver,SwlPom.dateToStr,SwlPom.scrollJScript,SwlPom.userName,SwlPom.chatMsgText,ps,newLine,msgFlag);//check for messages and update the flags
            SwlUtility.sendOutputString(wait,driver,SwlPom.receiverName,SwlPom.msgBoxXpath,msgFlag,ps,newLine); // create output string and send



            //Entering emailid
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

            //driver.navigate().refresh();
            //Clicking on Web instead
            //clicking on chat box and getting it ready for typing
            // wb = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/div/messages-header/div[2]/div/message-pane/div/div[3]/new-message/div/div[2]/form/div[4]/div[1]/div[2]/div/div/div[2]/div/div/div")));





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



            //for maintaining List
              /* for (WebElement webElement : chatName) {
                    String name = webElement.getText();
                    if( name.equals("WATVE Vikram"));
                       chatName.remove(webElement);

                    System.out.println(name);

                }*/

            //iterating through hashmap and removing Vikram and blanks from list


            //Searching another chat for posting results
            //    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[(text() = 'PATHANIA Rishi')]"))).click();

            //wb.click();
            // Thread.sleep(1000);
            //wb.submit();
            //
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

        } catch (Exception ex) {

            StringWriter sw = new StringWriter();
            ex.printStackTrace(new PrintWriter(sw));
            String exceptionAsString = sw.toString();
            System.out.println(exceptionAsString);
            ps.write(exceptionAsString.getBytes());
            ps.close();
            ex.printStackTrace();
            System.out.println(ex);
        }

    }
    public static void writeLog(PrintStream ps, String s,String newline) throws IOException {
        ps.write(s.getBytes());
        ps.write(newline.getBytes());
    }
}