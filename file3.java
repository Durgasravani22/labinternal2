import java.util.Scanner;

public class file3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the User Registration System!");

        // Collect user details
        System.out.print("Enter your full name: ");
        String fullName = scanner.nextLine();

        System.out.print("Enter your email address: ");
        String email = scanner.nextLine();

        System.out.print("Enter your password: ");
        String password = scanner.nextLine();

        System.out.print("Confirm your password: ");
        String confirmPassword = scanner.nextLine();

        // Validate password confirmation
        if (password.equals(confirmPassword)) {
            System.out.println("\nRegistration Successful!");
            System.out.println("User Details:");
            System.out.println("Name: " + fullName);
            System.out.println("Email: " + email);
        } else {
            System.out.println("\nPasswords do not match. Please try again.");
        }

        scanner.close();
    }
}
