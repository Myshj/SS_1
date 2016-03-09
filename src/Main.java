import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner keyboardInput = new Scanner(System.in);

        System.out.println("Enter integer with 3 digits: ");

        int inInt;
        try {
            inInt = keyboardInput.nextInt();
        } catch (Exception e) {
            System.out.println("Not integer.");

            return;
        }

        if (IntegerProcessor.countOfDigits(inInt) != 3) {
            System.out.println("Too long or too short value.");
            return;
        }

        System.out.print("Reverted value: ");
        System.out.println(IntegerProcessor.revert(inInt));

        if(inInt > 0) {
            System.out.print("Natural logarithm: ");

            System.out.println(Math.log(inInt));

            return;
        }

        System.out.println("Natural logarithm for negative value does not exist.");
    }
}
