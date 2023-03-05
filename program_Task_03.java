package Seminar_1;
import java.util.Scanner;
public class program_Task_03 {
    //    Реализовать простой калькулятор
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите: число 1, пробел, опеацию(+-*/), побел, число 2 и enter: ");
        String[] input = in.nextLine().split(" ");
        in.close();

        float firstNumber = Integer.parseInt(input[0]);
        float secondNumber = Integer.parseInt(input[2]);
        switch (input[1]) {
            case "+":
                System.out.println("Результат операции: " + (firstNumber + secondNumber));
                break;
            case "-":
                System.out.println("Результат операции: " + (firstNumber - secondNumber));
                break;
            case "*":
                System.out.println("Результат операции: " + (firstNumber * secondNumber));
                break;
            case "/":
                if (secondNumber != 0) {
                    System.out.println("Результат операции: " + (firstNumber / secondNumber));
                    break;
                } else {
                    System.out.println("деление на ноль");
                }
            default:
                System.out.println("Операция не распознана. Повторите ввод.");
        }
    }
}


