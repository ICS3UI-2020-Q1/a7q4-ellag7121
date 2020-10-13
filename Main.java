/**
 * gets a number, tells the user the last digit of the number
 * @author Graham Ellacott
 */
public class Main {

  //the method that will find the last digit in a given number
  public static int lastDigit(int number){
    int remainder = number % 10; //gets the reaminder of the given number and 10 (gets the last digit)
    return remainder; //returns the last digit
  }

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    //make a loop to check a bunch of numbers
    for(int i = 0; i < 100; i += 7){
      int num = lastDigit(i); //store the last digit in a variable
      System.out.println(num); //print it to the screen
    }
    
  }
}
