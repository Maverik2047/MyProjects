import java.util.Scanner;

public class EmpSalaryCount {
    public static void main(String[] args) {


        double rate;
        double hours;
        double pay;
        int countEmp = 0;

        while (countEmp < 2) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите кол-во отработанных часов");
            hours = scanner.nextDouble();
            System.out.println("Введите ставку за 1 час");
            rate = scanner.nextDouble();
            pay = rate * hours;
            countEmp++;


            System.out.println("Оплата работника составляет: " + pay + " рублей за месяц");
        }
        System.out.println("Все сотрудники обработаны");
    }
}