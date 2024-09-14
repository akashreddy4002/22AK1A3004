import java.util.Scanner;

public class LuckyNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your DOB in format DD/MM/YYYY: ");
        String dob = scanner.nextLine().replaceAll("/", "");

        int luckyNumber = 0;
        for (char c : dob.toCharArray()) {
            luckyNumber += Character.getNumericValue(c);
            luckyNumber = luckyNumber > 9 ? luckyNumber % 10 + luckyNumber / 10 : luckyNumber;
        }

        System.out.println("Your lucky number is: " + luckyNumber);
    }
}