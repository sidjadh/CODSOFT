import java.util.*;

class Number_game
{
    public static void main(String[] args) 
    {   
        Random r = new Random();
        int num;
        int chances;
        Scanner sc = new Scanner(System.in);

        //start the game
        System.out.println();
        System.out.println("********** WELCOME TO THE NUMBER GAME **********");
        System.out.println();
        System.out.println("    Enter 1 to PLAY");
        System.out.println("    Enter 2 to EXIT");

        int choice = sc.nextInt();

        System.out.println();

        while(choice==1)
        {
            //generate a random number
            num = r.nextInt(100) + 1;
            System.out.println("Number is generated");
            chances = 5;

            while(chances!=0)
            {
                System.out.println();
                System.out.println("Guess the number (" + chances + " chances left)");
                int guess_no = sc.nextInt();

                if(num == guess_no)
                {
                    System.out.println("Your guess is correct");
                    System.out.println("SCORE = " + chances);
                    break;
                }

                else if(guess_no<num)
                {
                    System.out.println("Your guess is lower");
                }

                else
                {
                    System.out.println("Your guess is higher");
                }

                chances--;
            }
            
            if(chances == 0)
            {
                System.out.println();
                System.out.println("You were unable to guess the number");
                System.out.println("SCORE = 0");
            }

            System.out.println();
            System.out.println("Enter 1 to REPLAY");
            System.out.println("Enter 2 to EXIT");

            choice = sc.nextInt();
        }

        sc.close();
    }
}
