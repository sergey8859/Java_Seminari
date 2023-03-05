package Seminar_1;
import java.util.Scanner;
public class program_Task_04 {
    //    Задано уравнение вида q + w = e, q, w, e >= 0. Некоторые цифры могут быть заменены знаком вопроса,
//    например 2? + ?5 = 69. Требуется восстановить выражение до верного равенства. Предложить хотя бы
//    одно решение или сообщить, что его нет.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите уравнение следующего типа 2? + ?5 = 69: ");
        String[] input = in.nextLine().split(" ");
        in.close();


        String firstNumber = input[0];
        String secondNumber = input[2];
        String test;
        String temp1, temp2;

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                temp1 = firstNumber.replace("?", String.valueOf(i));
                temp2 = secondNumber.replace("?", String.valueOf(j));
                test = temp1 + " " + input[1] + " " + temp2;

                if (Integer.parseInt(temp1) + Integer.parseInt(temp2) == Integer.parseInt(input[4])) {
                    System.out.println(test + " = " + input[4]);
                    return;
                }
            }
        }
        System.out.println("Решения уравниения нет");
    }
}


