import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double totalSum = 0;
        int i = 0;
        do {
            System.out.println("Enter number #" + (i + 1) + ":");
            try {
                String userAnswer = scanner.nextLine();
                double number = Double.parseDouble(userAnswer);
                totalSum += number;
                i++;
            } catch (NumberFormatException nfe) {
                System.out.println("Invalid number");
            }
        } while(i < 5);

        System.out.println("The total sum of 5 valid doubles is: " + totalSum);

    }
}




