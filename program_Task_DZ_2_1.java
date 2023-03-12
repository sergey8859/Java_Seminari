package Seminar_2;
import java.util.Arrays;

// Дана строка sql-запроса "select * from students where ". Сформируйте часть WHERE этого запроса,
// используя StringBuilder. Данные для фильтрации приведены ниже в виде json строки.
// Если значение null, то параметр не должен попадать в запрос.
// Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
public class program_Task_DZ_2_1 {
    public static void main(String[] args) {
        String enterString = "select * from students where ";
        String inputStr = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}";

        StringBuilder outStr = new StringBuilder();
        String newInputStr = inputStr
                .replace("\"", "")
                .replace("{", "")
                .replace("}", "")
                .replace(" ", "");
        String[] newInputStrArr = newInputStr.split(",");
        System.out.println(Arrays.toString(newInputStrArr));
        for (String x : newInputStrArr) {
            if (!x.contains("null")) {
                outStr.append(enterString + x + "\n");
            }
        }
        System.out.println(outStr);
    }
}

