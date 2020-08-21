import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.text.DateFormat;
import java.util.*;

public class TestClass {
    public static void main(String... args) throws Exception {
        Date currentDate = new Date();
        String  dateToStr = DateFormat.getDateInstance().format(currentDate);
        System.out.println("Date Format : "+dateToStr);
      /*  System.setProperty("webdriver.gecko.driver", "c:\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        WebDriverWait wait;
        wait = new WebDriverWait(driver, 60, 5);

        driver.get("https://www.google.com/search?source=hp&ei=8U86X5yxHIHA3LUPyo62qAQ&q=Teams");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        Thread.sleep(5000);
       // js.executeScript("window.scrollBy(0,-1000)");

        js.executeScript("document.getElementByClassName('drag-handle handle-hiding').scrollTop= 450");*/
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
            put("TIWARI Manish","Y");
            put("SINGH Abhishek","Y");
            put("SHARMA Monika","Y");
            put("GAWADE Satish","Y");
            put("PUNJ Ruchika","N");
            put("AGARWAL Neeraj","N");

        }};
        String outputMsg="Hi Vikram, ";

        int count = Collections.frequency(new ArrayList<String>(msg_flag.values()), "Y");
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

        if (value.equals("Y")) {
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
/*String name="ZEHRA Midhat";
String firstName;
        firstName=name.substring(name.indexOf(" ")+1);
        firstName=firstName.concat(" "+name.substring(0,1));
System.out.println(firstName + count);
*/

    }
}
