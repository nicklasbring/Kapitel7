import java.util.Random;
import java.util.Scanner;
public class Opgave7_1 {
    public static void main(String[] args)
    {

        Scanner input = new Scanner(System.in);


        System.out.println("Opgave 7.1");
        System.out.println();

        System.out.println("Enter number of students: ");
        int students = input.nextInt();
        int[] scores = new int[students];

        System.out.println("Enter " + scores.length + " scores");
            for (int i = 0 ; i < scores.length ; i++) {
                scores[i] = input.nextInt();
        }




        gradeStudents(scores, bestScore(scores));
    }




    public static int bestScore(int[]scores)
    {

        int bScore = scores[0];

        for (int i = 1; i < scores.length; i++)
            if (bScore < scores[i])
                bScore = scores[i];

            return bScore;
    }




    public static void gradeStudents(int[] scores, int bestScore)
    {
        for (int i = 0 ; i < scores.length ; i++)
            if (scores[i] >= bestScore - 10)
                System.out.println("Student " + i + " score is " + scores[i] + " and grade is A ");

            else if (scores[i] >= bestScore - 20)
                System.out.println("Student " + i + " score is " + scores[i] + " and grade is B ");

            else if (scores[i] >= bestScore - 30)
                System.out.println("Student " + i + " score is " + scores[i] + " and grade is C ");

            else if (scores[i] >= bestScore - 40)
                System.out.println("Student " + i + " score is " + scores[i] + " and grade is D ");

            else
                System.out.println("Student " + i + " score is " + scores[i] + " and grade is F ");
    }


    }

