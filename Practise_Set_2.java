import java.util.Scanner;
public class Practise_Set_2
{
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Question 1:");
        //Q1. What will be the result of the following expression:
        //      float a = 7/4*9/2
        //Sol:
        float a = 7/4.0f*9/2.0f;
        System.out.println(a);

        System.out.println("Question 2: ");
        //Q2. Write a java program to encrypt a grade by adding 8 to it. Decrypt
        //    it to show the correct grade.
        //Sol:
        char grade = 'B';
        //Encrypting the grade...
        grade = (char)(grade + 8);
        System.out.println(grade);
        //Decrypting the grade...
        grade = (char)(grade - 9);
        System.out.println(grade);

        System.out.println("Question 3: ");
        //Q3. Use comparison operators to find out whether a given number is greater
        //    than the user entered number or not.
        //Sol:
        float a = sc.nextFloat();
        System.out.println(a<45);


        System.out.println("Question 4: ");
        //write the following expression in a java program:
        //(v^2-u^2)/2aS
        //Sol:

        float a = 2f;
        float S = 4f;
        float v = 8f;
        float u = 4f;
        float frml = (v*v - u*u)  ;
        float total = frml / (2*a*S) ;
        System.out.println(total);
    }

}