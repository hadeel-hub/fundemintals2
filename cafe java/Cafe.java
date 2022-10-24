public class Cafe {
    public static void main(String[] args) {
        // APP VARIABLES
        // Lines of text that will appear in the app. 
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";
        String falseMessage="sorry for wrong delivery";
        String differenceIs="your total differenceis";
        
        // Menu variables (add yours below)
        double dripCoffee = 3.5;
        double latte =6;
        double cappuccino=8;
    
        // Customer name variables (add yours below)
        String customer1 = "Sam";
        String customer2="Jimmy";
        String customer3="Noah";

    
        // Order completions (add yours below)
        boolean isReadyOrder1 = false;
        boolean isReadyOrder2=true;
        boolean isReadyOrder3=true;
    
        // APP INTERACTION SIMULATION (Add your code for the challenges below)
        // Example:
        System.out.println(generalGreeting + customer1); // Displays "Welcome to Cafe Java, Cindhuri"
    	// ** Your customer interaction print statements will go here ** //
        System.out.println(customer1+pendingMessage+displayTotalMessage+ dripCoffee );
        System.out.println(customer2 +readyMessage );
        if(isReadyOrder2){
            System.out.println(customer3+ readyMessage+displayTotalMessage+cappuccino);
        }
        if(isReadyOrder3){
        System.out.println(displayTotalMessage+2*latte);
        }
        System.out.println(customer2+ falseMessage+ differenceIs+(latte-dripCoffee));

        
    }
}
