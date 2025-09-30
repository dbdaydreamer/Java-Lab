import java.util.Scanner;
public class Lab4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the total number of minutes spent on the computer:");
        int Minutes = scanner.nextInt();

        double hours = Minutes / 60;
        double days = Minutes / 1440;

        System.out.println("You have spent on the computer:");
        System.out.println("Hours: " + String.format("%.2f", hours));
        System.out.println("Days: " + String.format("%.2f", days));

        if (Minutes < 120) {
            System.out.println("Not bad! You can work a bit more.");
        } else if (Minutes >= 120 && Minutes <= 300) {
            System.out.println("Good workday!");
        } else {
            System.out.println("Take a brake, that's enough coding!");
        }

        scanner.close();
    }
}
