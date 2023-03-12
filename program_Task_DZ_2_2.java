// Реализуйте алгоритм сортировки пузырьком числового массива,
// результат после каждой итерации запишите в лог-файл.
package Seminar_2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.logging.*;

public class program_Task_DZ_2_2 {
    public static void main(String[] args) throws IOException {

        Logger logHW1 = Logger.getLogger(program_Task_DZ_2_2.class.getName());
        FileHandler fileHW1 = new FileHandler("program_seminar.java/src/Seminar_3/logHW1.txt", true);
        logHW1.addHandler(fileHW1);
        List<Integer> listInt = new ArrayList<>();
        SimpleFormatter sFormat = new SimpleFormatter();
        fileHW1.setFormatter(sFormat);
        logHW1.setUseParentHandlers(true); // вывод логов в терминал, true and false
        for (int i = 0; i < 10; i++) {
            listInt.add(new Random().nextInt(100));
        }
        logHW1.info("массив до сортировки: " + listInt);
        for (int i = 0; i < listInt.size(); i++) {
            for (int j = 0; j < listInt.size() - 1; j++) {
                int temp;
                if (listInt.get(j) > listInt.get(j + 1)) {
                    temp = listInt.get(j + 1);
                    listInt.set(j + 1, listInt.get(j));
                    listInt.set(j, temp);
                }
            }
            logHW1.info("Проход №" + (i + 1) + " Массив: " + listInt);
        }
        logHW1.info("Сортировка окончена");
    }
}


