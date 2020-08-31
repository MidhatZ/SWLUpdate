import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.DateFormat;
import java.util.Date;

public class SwlPom {
   static Path currentDir = Paths.get("");
   static String url = "https://www.microsoft.com/en-in/microsoft-365/microsoft-teams/group-chat-software";
   static String search = "Teams";
   static String firstInList = "/html/body/div[5]/div[2]/div[9]/div[1]/div[2]/div/div[2]/div[2]/div/div/div[1]/div/div[1]/a";
   static String signInTeams = "/html/body/section/div[2]/div/section/div/div[1]/div/div/div/div/div[2]/a";
   static String emailidField = "i0116";
   static String emailID = "midhat.zehra@soprasteria.com";
   static String submitEmailID = "idSIButton9";
   static String passwordField = "passwordInput";
   static String password = "Koocha@27129";
   static String signInAnotherWay = "signInAnotherWay";
   static String callXPath = "/html/body/div/form/div/div/div[1]/div[2]/div[2]/div/div[2]/div/div[2]/div/div[2]/div";
   static String donotshowthisgain = "idSIButton9";
   static String useWebApp = "/html/body/promote-desktop/div/div/div/div[1]/div[2]/div/a";
   static String chats ="app-bar-86fcd49b-61a2-4701-b771-54728cd291fb";
   static String tmsGroup =".//*[(text() = 'Talent Management Systems')]";
   static String dateToStr = DateFormat.getDateInstance().format(new Date());
   static String scrollJScript ="document.querySelector('.ts-message-list').scrollBy(0,-500)";
   static String userName =".//*[contains(@title,'" + dateToStr + "')]/parent::div/preceding-sibling::div";
   static String chatMsgText =".//*[contains(@title, '" + dateToStr + "')]/parent::div/parent::div/parent::div/following-sibling::div//div//div//div[contains (text(),'pdate')]";
   static String receiverName =".//*[(text() = 'PATHANIA Rishi')]";
   static String msgBoxXpath ="/html/body/div[2]/div[2]/div[2]/div[1]/div/messages-header/div[2]/div/message-pane/div/div[3]/new-message/div/div[2]/form/div[4]/div[1]/div[2]/div/div/div[2]/div/div/div";
}
