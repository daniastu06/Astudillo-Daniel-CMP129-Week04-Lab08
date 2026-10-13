import java.util.Scanner;

public class DriversLicenseExam {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        char[] answers = {'A', 'D', 'B', 'B', 'C',
                        'B',  'A', 'B', 'C', 'D',
                        'A', 'C', 'D', 'B', 'D',
                        'C', 'C', 'A', 'D', 'B'
        };

        char[] studentAnwers = new char[20];

        for(int i = 0; i < 20; i++){
            System.out.print("Enter answer for question " + (i + 1) + ": ");
            char answer = input.next().toUpperCase().charAt(0);
            
            while (answer != 'A' && answer != 'B' && answer != 'C' && answer != 'D'){
                System.out.print("Invalid. Please enter A, B, C, or D: ");
                answer = input.next().toUpperCase().charAt(0);
            }

            studentAnwers[i] = answer;
        }

        int correct = 0;
        int incorrect = 0;

        for (int i = 0; i < 20; i++){
            if (studentAnwers[1] == answers[i]){
                correct++;
            }else {
                incorrect++;
            }
        }

        if (correct >= 15){
            System.out.println("You passed the exam!");
        }else {
            System.out.println("You failed the exam!");
        }
        
        System.out.println("Correct answers: " + correct);
        System.out.println("Incorrect answers: " + incorrect);

        System.out.print("Questions missed: ");
        for (int i = 0; i < 20; i++) {
            if (studentAnwers[i] != answers[i]) {
                System.out.print((i + 1) + " ");
            }
        }

    }
}
