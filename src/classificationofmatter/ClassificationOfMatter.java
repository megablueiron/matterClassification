/*
 * Michael Botros
 * Oct, 7th 2019
 * This program uses nested if statements to classify your subtance into a category type
 */

package classificationofmatter;

//importing scanner library
import java.util.Scanner;



/**
 *
 * @author mibot3117
 */
public class ClassificationOfMatter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //declaring all variables and making a new scanner object
        Scanner keyedInput = new Scanner(System.in);
        
        String answer1;
        String answer2;
        String answer3;
        
        //display instructions and first question and then prompt user
        System.out.println("Classify your substance. Type in 'yes' or 'no' to the questions.");
        System.out.println("Can your substance be physically separated?");
        answer1 = keyedInput.nextLine();
        
        //The following if statements are nested in order to be able to make a tree of options to classify and output answers
        if (answer1.equals ("yes")) 
        {
            System.out.println("Is your composition uniform?");
            answer2 = keyedInput.nextLine();
            
            if (answer2.equals ("yes"))
            {
                System.out.println("Your substance is homogenous and is a solution");
            }
            else if (answer2.equals ("no"))
            {
                System.out.println("Your substance is a mechanical mixture");
            }
        }
        else if (answer1.equals ("no"))
        {
        System.out.println("Can your substance be chemically decomposed?");
            answer3 = keyedInput.nextLine();
            
            if (answer3.equals ("yes"))
            {
                System.out.println("Your substance is a compound");
            }
            else if (answer3.equals ("no"))
            {
                System.out.println("Your substance is a pure element");
            }
        }
        
    }
    
}
