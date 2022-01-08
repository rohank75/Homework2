import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // write your code here

        System.out.println("Hello, World!");

        Scanner s = new Scanner(System.in);

        System.out.print("What is your name?: ");
        String name = s.next();

        System.out.print("What is your age?: ");
        int age = s.nextInt();

        System.out.print("What is your weight?: ");
        Double weight = s.nextDouble();

        System.out.println("Name: " + name + ", " + "Age: " + age + ", " + "Weight: " + weight);

    }
}
