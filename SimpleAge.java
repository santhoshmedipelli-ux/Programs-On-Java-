import java.util.Scanner;
import java.util.*;
public class SimpleAge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your birth year: ");
        int birthYear = sc.nextInt();

        int age = 2026 - birthYear;

        System.out.println("Your age is: " + age);

        sc.close();
    }
}