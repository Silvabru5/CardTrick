package exercise1;
import java.util.*;
/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks the user to pick a card.
 * It then searches the array of cards for the match to the user's card. 
 * To be used as starting code in Exercise
 *
 * @author Bruno Silva
 * @Date Jan,31,2023
 */
public class CardTrick {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Card[] hand = new Card[7];
        Random rand = new Random();
        
        String suit = "";
        int value;
        for (int i = 0; i < hand.length; i++) {
            hand[i] = new Card();
            
            hand[i].setValue(rand.nextInt(8));
           
            hand[i].setSuit(Card.SUITS[rand.nextInt(4)]);
           // System.out.println(hand[i].getSuit() + hand[i].getValue());
        }
      
        System.out.println("Choose any card suit.\n Hearts, Diamonds, Spades, Clubs (please enter suit number)");
        suit= sc.next();

        System.out.println("Choose any card value. \n 1-13 1 = Ace 11 = Jack 12 = Queen 13 = King");
        value = sc.nextInt();

        for(int i = 0; i < hand.length; i++){
            if(hand[i].getSuit().equals(suit) && hand[i].getValue() == value)
            {
                printInfo();
            }
        }
    }

    /**
     * A simple method to print out personal information. Follow the instructions to 
     * replace this information with your own.
     * @author Paul Bonenfant Jan 2022
     */
    private static void printInfo() {
    
        System.out.println("Congratulations, you guessed right!");
        System.out.println();
        
        System.out.println("My name is Bruno, but you call me whatever you want");
        System.out.println();
        
        System.out.println("My career ambitions:");
        System.out.println("Become more active on LinkedIn");
        System.out.println("Pass with an average of 85 or above!");
	System.out.println();	

        System.out.println("My hobbies:");
        System.out.println(" Investing");
        System.out.println(" Video Games");
        System.out.println(" Reading/Watching TV");
        System.out.println(" Play sports!");

        System.out.println();
        
    
    }

    private static void printinfo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
