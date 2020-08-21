import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class Robo {
    public static void main(String[] args) throws IOException, AWTException, InterruptedException
    {
        String command = "notepad.exe";
        Runtime run = Runtime.getRuntime();
        run.exec(command);
        try {
            Thread.sleep(2000);
        }
        catch (InterruptedException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        String s1="midhat.zehra@soprasteria.com";
        // Create an instance of Robot class
        Robot robot = new Robot();
        // This gives the character 'a'
         // ascii is now 97.

        //System.out.println(s1.charAt(2));

        int d = 'a';
       //System.out.println((int)s1.charAt(2));

System.out.println(KeyEvent.VK_A + 32);

       System.out.println(d);
       /*** for(int i=0; i<=s1.length();i++)
        { *//*char character = s1.charAt(i);
            int ascii = (int) character;*/
            //robot.keyPress((int) s1.charAt(2));
     //   }
       /* robot.keyPress(KeyEvent.VK_SHIFT);
        robot.keyPress(KeyEvent.VK_R);  // VK_WINDOWS key still pressed
        robot.keyRelease(KeyEvent.VK_R);
        robot.keyPress(KeyEvent.VK_2);  // VK_WINDOWS key still pressed
        robot.keyRelease(KeyEvent.VK_2);
        robot.keyRelease(KeyEvent.VK_SHIFT);
        Thread.sleep(100);
        // Press keys using robot. A gap of
        // of 100 mili seconds is added after
        // every key press
        robot.keyPress(KeyEvent.VK_C);
        Thread.sleep(100);
        robot.keyPress(KeyEvent.VK_H);
        Thread.sleep(100);
        robot.keyPress(KeyEvent.VK_R);
        Thread.sleep(100);
        robot.keyPress(KeyEvent.VK_O);
        Thread.sleep(100);
        robot.keyPress(KeyEvent.VK_M);
        Thread.sleep(100);
        robot.keyPress(KeyEvent.VK_E);
        Thread.sleep(100);
        robot.keyPress(KeyEvent.VK_PERIOD);
        Thread.sleep(100);
        robot.keyPress(KeyEvent.VK_E);
        Thread.sleep(100);
        robot.keyPress(KeyEvent.VK_X);
        Thread.sleep(100);
        robot.keyPress(KeyEvent.VK_E);
        Thread.sleep(100);
        robot.keyPress(KeyEvent.VK_ENTER);*/
           /* robot.keyPress(KeyEvent.VK_M);
            Thread.sleep(100);
            robot.keyPress(KeyEvent.VK_SPACE);
            Thread.sleep(100);
            robot.keyPress(KeyEvent.VK_G);
            //Thread.sleep(100);
            robot.keyPress(KeyEvent.VK_E);
         //   Thread.sleep(100);
            robot.keyPress(KeyEvent.VK_E);
        //    Thread.sleep(100);
            robot.keyPress(KeyEvent.VK_K);
        //    Thread.sleep(100);
            robot.keyPress(KeyEvent.VK_S);
        //    Thread.sleep(100);
            robot.keyPress(KeyEvent.VK_F);
        //    Thread.sleep(100);
            robot.keyPress(KeyEvent.VK_O);
        //    Thread.sleep(100);
            robot.keyPress(KeyEvent.VK_R);
      //      Thread.sleep(100);
            robot.keyPress(KeyEvent.VK_G);
       //     Thread.sleep(100);
            robot.keyPress(KeyEvent.VK_E);
      //      Thread.sleep(100);
            robot.keyPress(KeyEvent.VK_E);
            Thread.sleep(100);
            robot.keyPress(KeyEvent.VK_K);
            Thread.sleep(100);
            robot.keyPress(KeyEvent.VK_S);
            */
    }
}
