import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.io.PrintStream;
import java.text.DateFormat;
import java.time.Instant;
import java.util.*;

public class SwlUtility {


    public static WebDriver openBrowser()
    {
        System.setProperty("webdriver.chrome.driver", SwlPom.currentDir.toAbsolutePath() + "\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        return driver;
    }

    public  static void googleSearch(WebDriverWait wait, String search){
        //getting the google search box

        WebElement wb= wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("q")));
        wb.click();
        wb.clear();
        //Entering Teams to search
        wb.sendKeys(search);
        wb.submit();
        wb.clear();
        //Clicking on the first option from the list
        wb=  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
                SwlPom.firstInList)));
        wb.click();


    }
    public static void openURL(WebDriver driver,String url)
    {
        driver.get(url);
    }

    public static void teamSignIn(WebDriverWait wait, String signInButton){

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(signInButton))).click();

    }
    public static void switchToFirstTab(WebDriver driver)
    {
        ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(0));
        driver.close();
        driver.switchTo().window(tabs2.get(1));
    }
    public static  void ssoAuthentication(WebDriverWait wait,WebDriver driver,String emailidField, String emailID, String submitEmailID,String passwordField, String password, int sleep) throws Exception {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(emailidField))).sendKeys(emailID);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(submitEmailID))).click();
        Thread.sleep(sleep);

        if (SwlUtility.checkForElement(driver,passwordField) > 0) {
            WebElement wb1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(passwordField)));
            Thread.sleep(sleep);
            wb1.sendKeys(password);
            wb1.submit();
        }

    }
    public static int checkForElement(WebDriver driver, String elementName) {
        //Entering password on SSO
        List check = driver.findElements(By.id(elementName));
        return check.size();
    }

    public static void callAuthentication(WebDriverWait wait,WebDriver driver,String signInAnotherWay, String callXPath, String donotshowthisgain)
    {
        //Clicking on Sign in another way
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(signInAnotherWay))).click();
        //Selecting phone calling option
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(callXPath))).click();
        //Do not ask this again
        if (SwlUtility.checkForElement(driver,donotshowthisgain) > 0) {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(donotshowthisgain))).click();
        }
    }

    public static  void goToChatgroup(WebDriverWait wait, String useWebApp, String chats, String tmsGroup )
    {
        //use web instead
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(useWebApp))).click();
        //Selecting chats ".//*[(text() = 'WATVE Vikram')]"
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(chats))).click();
        //clicking on top most chat box
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(tmsGroup))).click();

        //  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[2]/div[2]/div[1]/div/left-rail/div/div/left-rail-chat-tabs/div/div/div[1]/div/div/chat-list-bridge/div/div[1]/div/ul/li[1]/div[2]/div/div/a"))).click();
        //Enter New message
        //  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/div/messages-header/div[2]/div/message-pane/div/div[3]/new-message/div/div[2]/form/div[4]/div[1]/div[2]/div/div/div[2]/div/div/div"))).click();


    }
    public static void writeLog(PrintStream ps, String s, String newline) throws IOException {
        ps.write(s.getBytes());
        ps.write(newline.getBytes());
    }

    public static  void  updateAbsenteesFlag(WebDriver driver, String currDate, String scrollJScript, String userName, String chatMsgText, PrintStream ps, String newLine, HashMap msgFlag) throws InterruptedException, IOException {

        //Initializing array List for Storing Names and message
        List<WebElement> msgText = new List<WebElement>() {
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
        List<WebElement> chatName = new List<WebElement>() {
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


        //Fetchin current date in the specifiled format
        //   Date currentDate = new Date();
        //   String dateToStr = DateFormat.getDateInstance().format(new Date());
        System.out.println("Date Format : " + currDate);
        Thread.sleep(10000);
        //Finding Names on the mentioned date

        //driver.findElements(By.xpath("//*[contains(@title,'Aug 18, 2020')]/parent::div/preceding-sibling::div"));

        EventFiringWebDriver ef = new EventFiringWebDriver(driver);
        ef.executeScript(scrollJScript);
        Thread.sleep(5000);

        chatName = driver.findElements(By.xpath(userName));
        //   chatName=driver.findElements(By.xpath(".//*[contains(@title,'Aug 19, 2020')]/parent::div/preceding-sibling::div"));
        // Thread.sleep(15000);
        //Finding message on mentioned date
        msgText = driver.findElements(By.xpath(chatMsgText));


        //printing sizes
        System.out.println(chatName.size());

        System.out.println(msgText.size());

        Iterator itr = chatName.iterator();
        while (itr.hasNext()) {
            //int x = (Integer)itr.next();

            WebElement web = (WebElement) itr.next();
            String name = web.getText();

            if ((name.equals("WATVE Vikram")) || (name.equals("")))
                itr.remove();


        }

        //Printing new size after removing extras
        System.out.println(chatName.size());
        String size = ((Integer) chatName.size()).toString();
        writeLog(ps,size,newLine);


        //Replacing N by Y if name is SWL is updated
        for (int j = 0; j < chatName.size(); j++) {
            String name = chatName.get(j).getText();
            // String txt = msgText.get(j).getText();
            //if (name.equals(""))
            //name = "ZEHRA Midhat";
            // System.out.println(name+" : "+ txt);
            System.out.println(name);
            writeLog( ps,  name, newLine);

            msgFlag.replace(name, "Y");
        }

        //Printing final version of HAshmap
        Iterator itr1 = msgFlag.entrySet().iterator();
        while (itr1.hasNext()) {
            HashMap.Entry pair = (HashMap.Entry) itr1.next();
            System.out.println(pair.getKey() + " = " + pair.getValue());

        }

    }

    public static  void sendOutputString(WebDriverWait wait,WebDriver driver,String receiverName, String msgBoxXpath,HashMap msgFlag,PrintStream ps, String newLine) throws InterruptedException, IOException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(receiverName))).click();
        Thread.sleep(3000);

        //Actions actions = new Actions(driver);
        // actions.moveToElement(wb).click().perform();
        //  wb.click();
        // wb.sendKeys("Hi");
        // wb.sendKeys("Hi Rishi, Please note that these employees did not update SWL");
        String outputMsg = "Hi Vikram, ";

        int count = Collections.frequency(new ArrayList<String>(msgFlag.values()), "N");
        if (count == 0) {
            outputMsg = outputMsg.concat("All updated the SWL.");

        } else {


            Iterator itr2 = msgFlag.entrySet().iterator();
            String key = null;
            String value = null;

            while (itr2.hasNext()) {
                HashMap.Entry pair = (HashMap.Entry) itr2.next();

                value = (String) pair.getValue();
                key = (String) pair.getKey();

                if (value.equals("N")) {
                    String firstName;

                    if (count == 1 && !outputMsg.contains("and")) {

                        outputMsg = outputMsg.concat("Only ");
                        firstName = key.substring(key.indexOf(" ") + 1);
                        firstName = firstName.concat(" " + key.substring(0, 1));
                        outputMsg = outputMsg.concat(firstName);

                        outputMsg = outputMsg.concat(" is left.");
                        break;
                    } else if (count == 1) {
                        firstName = key.substring(key.indexOf(" ") + 1);
                        firstName = firstName.concat(" " + key.substring(0, 1));
                        outputMsg = outputMsg.concat(firstName);
                        outputMsg = outputMsg.concat(" are left.");
                        break;
                    } else {
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
        writeLog( ps,  outputMsg, newLine);

        WebElement wb = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(msgBoxXpath)));
        wb.sendKeys(outputMsg);
        Thread.sleep(3000);
        wb =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/div/messages-header/div[2]/div/message-pane/div/div[3]/new-message/div/div[3]/div[2]/button")));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", wb);
    }


}

