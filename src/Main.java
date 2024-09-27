import javax.swing.*;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String choice = "";
        boolean doneInputA = false;
        boolean doneInputB = false;
        boolean doneInput = false;
        boolean matchPlays = true;

        do
        {
            do
            {
                System.out.println("Enter your Rock, Paper, Scissors move [R,P,S, or, r,p,s]: ");
                choice = in.nextLine();

                if(choice.equalsIgnoreCase("R"))
                {
                    System.out.println("You chose Rock!");
                }
                else if (choice.equalsIgnoreCase("P"))
                {
                    System.out.println("You chose Paper!");
                }
                else if (choice.equalsIgnoreCase("S"))
                {
                    System.out.println("You chose Scissors!");
                }
                else
                {
                    System.out.println("You entered " + choice + " which is not an acceptable move!");
                    System.out.println("Run the program again with correct input");
                }

            }while(doneInputA == false);

            do
            {
                System.out.println("Enter your Rock, Paper, Scissors move [R,P,S, or, r,p,s]: ");
                choice = in.nextLine();

                if(choice.equalsIgnoreCase("R"))
                {
                    System.out.println("You chose Rock!");
                }
                else if (choice.equalsIgnoreCase("P"))
                {
                    System.out.println("You chose Paper!");
                }
                else if (choice.equalsIgnoreCase("S"))
                {
                    System.out.println("You chose Scissors!");
                }
                else
                {
                    System.out.println("You entered " + choice + " which is not an acceptable move!");
                    System.out.println("Run the program again with correct input");
                }

            }while(doneInputB == false);

        matchPlays = doneInputA & doneInputB;
        if(doneInputA == 'R', doneInputB == 'R')
        {
            System.out.println("Rock vs. Rock, it's a tie!");
        }
        else if(doneInputA == 'R', doneInputB = 'P')
        {
            System.out.println("Paper covers Rock, Player B wins!");
        }
        else if(doneInputA == 'R', doneInputB = 'S')
        {
            System.out.println("Rock crushes Scissors, Player A wins!");
        }
        else if(doneInputA == 'P', doneInputB = 'R')
        {
            System.out.println("Paper covers Rock, Player A wins!");
        }
        else if(doneInputA == 'P', doneInputB = 'P')
        {
            System.out.println("Paper vs. Paper, it's a tie!");
        }
        else if(doneInputA == 'P', doneInputB = 'S')
        {
            System.out.println("Scissors cuts Paper, Player B wins!");
        }
        else if(doneInputA == 'S', doneInputB = 'R')
        {
            System.out.println("Rock crushes Scissors, Player B wins!");
        }
        else if(doneInputA == 'S', doneInputB = 'P')
        {
            System.out.println("Scissors cuts Paper, Player A wins!");
        }
        else if(doneInputA == 'S', doneInputB = 'S')
        {
                System.out.println("Scissors vs. Scissors, it's a tie!");
        }

            System.out.println("Continue Playing [Y/N]?");
        }while(!doneInput == false);


    }
}
