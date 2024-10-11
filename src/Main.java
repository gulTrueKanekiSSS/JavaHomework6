//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //task1
        for (int i = 1; i <= 10; i++){
            System.out.println(i);
        }

        //task2
        for (int i = 10; i >= 1; i--){
            System.out.println(i);
        }

        //task3
        //0 является четным числом
        for (int i = 0; i <= 17; i++){
            if (i % 2 == 0){
                System.out.println(i);
            }
        }

        //task4
        for (int i = 10; i >= -10; i--){
            System.out.println(i);
        }

        //task5

        for (int i = 1904; i <= 2096; i += 4){
            System.out.println(i + " год является високосным");
        }

        //task6

        for (int i = 7; i <= 98; i += 7){
            System.out.println(i);
        }
        //task7

        for (int i = 1; i <= 512; i *= 2){
            System.out.println(i);
        }


        //task 9
        int myYearSavings = 0;

        for (int i = 1; i <= 12; i++){
            myYearSavings = myYearSavings + (myYearSavings / 100) + 29000;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + myYearSavings + " рублей");
        }

        //task 8
        for (int i = 1; i <= 12; i++){
            myYearSavings = myYearSavings + 29000;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + myYearSavings + " рублей");
        }


        //task10

        for (int i = 1; i <= 10; i++){
            System.out.println("2 * " + i + " = " + (2 * i));
        }
    }
}