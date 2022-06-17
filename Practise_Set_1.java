import java.util.Scanner;
public class Practise_Set_1
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Question 1: ");
        //Q1. Write a program to sum three numbers in java.
        //Sol:

        System.out.print("Enter the first number: ");
        int a = sc.nextInt();
        System.out.print("Enter the second number: ");
        int b = sc.nextInt();
        System.out.print("Enter the third number: ");
        int c = sc.nextInt();
        int d = a+b+c;
        System.out.println("Total sum is " + d);

        System.out.println("Question 2: ");
        //Q2. Write a program to calculate CGPA using marks of three subjects(out of 100).
        //sol:

        System.out.print("Enter subject1 marks: ");
        float e = sc.nextFloat();
        System.out.print("Enter subject2 marks: ");
        float f = sc.nextFloat();
        System.out.print("Enter subject3 marks: ");
        float g = sc.nextFloat();
        float h = (e+f+g)/30;
        System.out.println("CGPA = " + h);

        System.out.println("Question 3: ");
        //Q3. Write a java program which asks the user to
        //enter his/her name and greets them with "Hello <name>,
        //have a good day" text
        Scanner ac = new Scanner(System.in);
        System.out.print("Enter the name: ");
        String i = ac.nextLine();
        System.out.println("Hello " + i + ", have a good day.");

        System.out.println("Question 4: ");
        //Q4. Write a java program to convert kilometers to miles.
        //Sol:

        System.out.print("Enter kilometers: ");
        int j = sc.nextInt();
        double k = j*0.621371;
        System.out.println(j + " Kilometers = " + k + " Miles");


        System.out.println("Question 5: ");
        //Q5. Write a java program to detect whether a number
        // entered by the user in integer or not.
        //Sol:

        System.out.print("Enter the number: ");
        System.out.println(sc.hasNextInt());
    }
}
