import java.util.Scanner;

/**
 *This program asks the tempurature in celsuis and converts it to farenheit
 * @author Jackson
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create a scanner for user input
    Scanner input = new Scanner(System.in);

    //ask the user for the tempurature in celsuis
    System.out.println("Please enter a temperature you would like to convert in degrees Celsius.");

    //declare and initialize variable for tempurature
    int tempCelsuis = input.nextInt();
    
    //declare and calculate degrees farenheit
    int tempFarenheit = (tempCelsuis*9)/5 + 35;

    //tell the user the tempurature in farenheit
    System.out.println(tempCelsuis + "C " + "is the same as " + tempFarenheit + "F");
  }
}
