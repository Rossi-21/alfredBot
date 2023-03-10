import java.util.Date;
import java.text.SimpleDateFormat;
public class AlfredQuotes {
    
    public String basicGreeting() {
        // You do not need to code here, this is an example method
        return "Hello, lovely to see you. How are you?";
    }
    
    public String guestGreeting(String name) {
        // YOUR CODE HERE
        return String.format("Hello %s, lovely to see you. How are you?", name);
    }

    public String guestGreeting(String name, String dayPeriod ) {
        // YOUR CODE HERE
        return String.format("Good %s %s, lovely to see you. How are you?", dayPeriod, name);
    }
    
    public String guestGreeting() {
        // YOUR CODE HERE
        String pattern = "h:mm a";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        String date = simpleDateFormat.format(new Date());
        if (date.indexOf("PM") > -1) {
            return String.format("Good Evening! The time is now %s", date);
        }
        else {
            return String.format("Good Morning! The time is now %s", date);
        }
         
    }
    
    public String dateAnnouncement() {
        // YOUR CODE HERE
        Date date = new Date();
        return "The date today is " + date;
        //return "placeholder for date announcement return string";
    }
    
    public String respondBeforeAlexis(String conversation) {
        // YOUR CODE HERE
        if (conversation.indexOf("Alexis") > -1) {
            return "Right away, sir. She certainly isn't sophisticated enough for that.";
        }
        if (conversation.indexOf("Alfred") > -1) {
            return "At your service. As you wish, naturally.";
        }
        else {
            return "Right. And with that I shall retire.";
        }

        }
            
    }
    
	// NINJA BONUS
	// See the specs to overload the guestGreeting method
    // SENSEI BONUS
    // Write your own AlfredQuote method using any of the String methods you have learned!

