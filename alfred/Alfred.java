import java.util.Date;
public class Alfred{
    
    public String basicGreeting() {
        // You do not need to code here, this is an example method
        return "Hello, lovely to see you. How are you?";
    }
    
    public String guestGreeting(String name) {
        
        return String.format("lovely to see you" ,name);
    }
    
    public String dateAnnouncement() {
        
        return String.format("It is currently"+ new Date());
    }
    
    public String respondBeforeAlexis(String conversation) {
        if(conversation.indexOf("Alexes")>-1){
            return "doesn't exist";
        }
        if(conversation.indexOf("alfred")>-1){
            return "what i can do for you?";
        }
        return "right. and with that i shall retire";
        
    }
    
	// NINJA BONUS
	// See the specs to overload the guessGreeting method
    // SENSEI BONUS
    // Write your own AlfredQuote method using any of the String methods you have learned!
}

