import java.util.Scanner;

public class ConvertAmount {
    public static void main(String[] args) {
        final double ROUBLES_PER_DOLLAR = 72.12;
        int dollars;
        int digit;
        double roubles;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сумму в долларах");
        dollars = scanner.nextInt();

        System.out.print(dollars);


        if (dollars >= 5 && dollars <= 20)
            System.out.print(" Сумма американских долларов равны: ");
        else {
            digit = dollars % 10;

            if (digit == 1)
                System.out.print(" американский доллар равен: ");
            else if (digit >= 2 && digit <= 4)
                System.out.print(" американских доллара равны: ");
            else
                System.out.print(" американских долларов равны: ");
        }
        roubles = ROUBLES_PER_DOLLAR * dollars;
        System.out.println((int) (roubles * 100) / 100.0 + " российского рубля");

    }
}


