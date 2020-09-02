import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = scan.nextLine();
        System.out.println("Hello, " + name + "! It's nice to meet you!");

        System.out.println("What is your favorite color, " + name + "?");
        String color = scan.nextLine();
        System.out.println("I like " + color + " too!");

        System.out.println("What is your favorite movie, " + name + "?");
        String movie = scan.nextLine();
        System.out.println(movie + " is pretty good.");
        
        System.out.println("What is your favorite food, " + name + "?");
        String food = scan.nextLine();
        System.out.println(food + " tastes good.");

        System.out.println("What is your favorite class, " + name + "?");
        String school = scan.nextLine();
        System.out.println("Oh yeah, " + school + " is fun.");

        scan.close();
    }
}
