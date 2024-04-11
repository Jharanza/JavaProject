import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello, what is your name?");
        String name = scanner.nextLine();

        int age = 0;
        boolean validInput = false;

        while(!validInput) {
            try {
                System.out.println("What is your age?");
                age = scanner.nextInt();
                validInput = true;
            } catch (Exception e) {
                System.out.println("You must enter a full number");
                scanner.nextLine();
            }
        }

        System.out.println("Nice to meet you " + name + ". Your age is " + age);
        scanner.close();
    }
}
