import java.util.Scanner;

public class DiceJack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        int roll1 = rollDice();
        int roll2 = rollDice();
        int roll3 = rollDice();
        
        System.out.print("Enter the number between 1 and 6: " );

       int num1 = scanner.nextInt();
       int num2 = scanner.nextInt();
       int num3 = scanner.nextInt();

        if(isLessThan1(num1, num2, num3) || isGreaterThan5(num1, num2, num3)){
            System.out.println("You entered the number outside the valid range");
            System.exit(0);
        }

        int sumOfNumber = num1 + num2 + num3;
        int sumOfDiceRoll = roll1 + roll2 + roll3;

        System.out.println("Your sum: " + sumOfNumber + "  Dice sum " + sumOfDiceRoll);

        if(userWon(sumOfNumber, sumOfDiceRoll)){
            System.out.println("Congratulations you won");
        }else{
            System.out.println("Better luck next time");
        }

        scanner.close();
    }
    
    public static boolean isLessThan1(int num1, int num2, int num3){
        return (num1 < 1 || num2 < 1 || num3 < 1);
    }
    public static boolean isGreaterThan5(int num1, int num2, int num3){
        return (num1 > 6 || num2 < 6 || num3 < 6);
    }
    public static boolean userWon(int sumNumbers, int sumDiceRolls){
        return (sumNumbers > sumDiceRolls && (sumNumbers - sumDiceRolls) > 3);
    }
    public static int rollDice(){
                         // 0 - 0.999999999999
    double randomNumber = Math.random() * 6; // 0 - 5.99999999999
    randomNumber += 1; // 1 - 6.9999999999
    return (int)randomNumber; // 1 - 6

    }
    
}

//We have to make a project in which we have to:
//RULES:
//1.The user have to choose three numbers. For example we are choosing (4 3 5) sum = 12
//2. Now we have to roll a dice three times and check what number we are getting. Ex. (3 4 4) sum = 11

//The user wins if:
//1. The sum of numbers gets from the dice is smaller than the sum of the number we choose.
//2. And the difference between two numbers is less than three.


/*
 public static boolean isLessThan1(int num1, int num2, int num3){
        return (num1 < 1 || num2 < 1 || num3 < 1);
    }
 */
//isme hum dekh rahe hai ki jo user ne number input me diya hai woh 1 se chota toh nahi

/*
public static boolean isGreaterThan5(int num1, int num2, int num3){
        return (num1 > 6 || num2 < 6 || num3 < 6);
    }
 
 */
//Isme hum dekh rahe hai ki number 6 de bada toh nahi.

/*
 if(isLessThan1(num1, num2, num3) || isGreaterThan5(num1, num2, num3)){
            System.out.println("You entered the number outside the valid range");
            System.exit(0);
        }
 */
//Agar ye condition true hui toh iska matalab user ne 1 se chota ya 6 se bada value kuch dala hai iss liye ab ye function terminate ho jaayega.

//Now we have to check weather the user wins or not:
/*
 public static boolean userWon(int sumNumbers, int sumDiceRolls){
        return (sumNumbers > sumDiceRolls && (sumNumbers - sumDiceRolls) > 3);
    }
 */
//Isme hum dekhenge ki agar jo ye boolean function hai woh true hai ki nahi 