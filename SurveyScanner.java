import java.util.Scanner;

public class SurveyScanner {
    public static void main(String[] args) {



        //*********PART A: PICKING UP THE USER'S ANSWERS*********
        System.out.println("\nWelcome. Thank you for taking the survey");

        Scanner scanner = new Scanner(System.in); 
        int counter = 0;

        System.out.println("\nWhat is your name?");
        String name = scanner.nextLine();
        counter++;

        System.out.println("\nHow much money do you spend on coffee?");
        double coffeePrice = scanner.nextDouble();
        counter++;

        System.out.println("\nHow much money do you spend on fast food?");
        double foodPrice = scanner.nextDouble();
        counter++;


        System.out.println("\nHow many times a week do you buy coffee?");
        int coffeeAmount = scanner.nextInt();
        counter++;

        System.out.println("\nHow many times a week do you buy fast food?");
        int foodAmount = scanner.nextInt();
        counter++;

        scanner.close();

        //*********PART B: RESPONDING TO THE USER**********
        // System.out.println("Thank you <name> for answering all <counter> questions");
        System.out.println("\nThank you " + name + " for answering all " +counter + "questions");

        // System.out.println("Weekly, you spend $<totalPrice> on coffee");
        System.out.println("Weekly, you spend "+ (coffeeAmount * coffeePrice)+" on coffee");

        // System.out.println("Weekly, you spend $<totalPrice> on food");
        System.out.println("Weekly, you spend " + (foodAmount * foodPrice) + "on food");


    }
}


//SCANNER:
    // A scanner contains me method that can scan for user input.
    //There are different methods for scaning different variables like for int there is nextInt, for double there is nextDouble and for Text use nextLine.
    
    //Now we have to import the scanner from the java util.....for that: [Scanner scanner] pahle humne Scanner ko imprt kiya "Scanner term se"....phir use jaise int, double ke liye karne ke liye varible create karte hai ussi tarah scanner ke liye bhi karenge [Scanner scanner] (jisme small s se scanner shuru hua hai woh variable hai.). We are doing this so that we can set this variavle to a new instance of a scanner that can recieve an input.

    //Scanner scanner = new Scanner(System.in);......by this we can now let user to put input.
    //Now Use scanner methods to pick up user inputs:
    /*
      1.  String name = scanner.nextLine();
     //yahan par nextLine jo hai woh wait karega user to input dene ke liye joki ek string value rahegi usse pick karega phir usse name variable me store karega

     2.  double coffeePrice = scanner.nextDouble();
     //Yahan par nextDouble wait karega joki double input pick karega aur variable me store karega
    
     3.  int coffeeAmount = scanner.nextInt();
     //yahan integer

     */

     //Now as u get out of scanner, close it so that there is no resource leak: