package Seminar_1;

import java.util.Scanner;
//    Вычислить [n-ое треугольного число](сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
public class program_Task_01 {

    public static void main(String[] args) {
        Scanner input =  new Scanner (System.in);
        System.out.print("Введите целое число: ");
        int number = input.nextInt();
        input.close();

        int summa = 0;
        int multiplication = 1;
        for (int i = 1; i <= number; i++) {
            summa += i;
            multiplication *= i;
        }
        System.out.printf("Заданное число = %d \n", number);
        System.out.printf("Сумма чисел от 1 до заданного числа = %d \n", summa);
        System.out.printf("Произведение чисел от 1 до заданного числа = %d", multiplication);
    }
}


