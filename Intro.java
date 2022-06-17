import java.util.Scanner;
public class Intro
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String a = sc.nextLine();
        System.out.println("Welcome Back Mr. " + a);
    }
}