import java.util.Scanner;

public class InputGreeting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello, what is your name?");
        String name = scanner.nextLine();

        System.out.println("WHat is your age?");
        int age = scanner.nextInt();

        System.out.println("Hi " + name + ", nice to meet you! Your age is " + age);

        scanner.close();
    }
}
