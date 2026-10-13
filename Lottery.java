import java.util.Random;
import java.util.Scanner;

public class Lottery {
    public static void main(String[] args) {
        int[] lottery = new int[5];
        int[] user = new int[5];
        int matches = 0;

        Random rand = new Random();
        Scanner input = new Scanner(System.in);

        for(int i = 0; i < 5; i++){
            lottery[i] = rand.nextInt(10);
         }

         System.out.println("Enter 5 digits (0-9):");
         for(int i = 0; i < 5; i++){
            System.out.print("Digit " + (i + 1) + ": ");
            user[i] = input.nextInt();

            while (user[i] < 0 || user[i] > 9){
                System.out.print("Please enter a number form 0 to 9: ");
                user[i] = input.nextInt();
            }
         }

         for (int i = 0; i < 5; i++){
            if (lottery[i] == user[i]){
                matches++;
            }
         }

        System.out.println("Lottery numbers: ");
        for(int i = 0; i < 5; i++){
            System.out.print(lottery[i] + " ");
        }

        System.out.println();


         System.out.println("Your numbers: ");
         for (int i = 0; i < 5; i++){
            System.out.print(user[i] + " ");
         }

         System.out.println();

        System.out.println("You matched " + matches + " digits.");

        if(matches == 5){
            System.out.println("YOU WON THE GRAND PRIZE!");
        }


    }
   

}
