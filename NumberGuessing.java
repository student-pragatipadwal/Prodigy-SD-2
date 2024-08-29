import java.util.Scanner;
import java.util.Random;

public class NumberGuessing 
{
    public static void main(String[] args) 
    {
    int round=0,TotalScore=0,TotalTries=0;

     Scanner pa=new Scanner(System.in);
    
     String play="yes";
    
     //int x,anObject,s;r
     System.out.println();
     System.out.println("\nA number is chosen between 1 to 100. Guess the number.\n");
     while (play.equals("yes")) 
     {
        round++;
        int guess,i,k=12,tries=0,score=5;
        Random random=new Random();

        int number=random.nextInt(100) + 1;

        for(i=0;i<k;i++)
        {
            System.out.println();
            System.out.print("Guess the number: ");
            guess=pa.nextInt();

            if(number==guess)
            {
                tries++;
                System.out.println("Congratulations! You guessed the number.");
                System.out.println();
                System.out.println("\nTries : "+tries);
                System.out.println("Score : "+score);
                TotalTries+=tries;
                TotalScore+=score;
                System.out.println();
                System.out.print("Would you like to play again? yes or no: ");
                play=pa.next().toLowerCase();
                break;
            }
            else
              if(number>guess && i!=k-1)
              {
                System.out.println("The number is greater than "+guess);
                tries++;
                score--;
              }
              else
              {
                System.out.println("The number is less than "+guess);
                tries++;
                score--;
              }
        }
        if(i==k)
        {
          System.out.println("You have exhausted 5 tries.");
            System.out.println("The number was"+number);
            TotalTries+=tries;
            TotalScore+=score;
            System.out.println("\nTries :"+tries);
            System.out.println("Score :"+score);
            System.out.println();
            System.out.print("Would you like to play again? yes or no: ");
            play=pa.next().toLowerCase();
              
        }
     }
     System.out.println("\n Rounds :"+round);
     System.out.println("Total Tries :"+TotalTries);
     System.out.println("Total Score :"+TotalScore);
    }
}