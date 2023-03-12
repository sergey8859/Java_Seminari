/**
 Дана строка sql-запроса "select * from students where ".
 Сформируйте часть WHERE этого запроса, используя StringBuilder.
 Данные для фильтрации приведены ниже в виде json строки.
 Если значение null, то параметр не должен попадать в запрос.
 Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
 */

package Seminar_2;

import com.google.gson.Gson;
import org.json.JSONObject;
import java.util.Map;

public class Task_2_dz_1 {

     public void sqlWhere() {
            int count = 0;
            StringBuilder sb = new StringBuilder();
            sb.append("select * from students where ");
            String jStr = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}";
            StringBuilder jsonObj = new StringBuilder(jStr);
            Map<String, String> map = new Gson().fromJson(jsonObj.toString(), Map.class);
            
            for (Map.Entry entry: map.entrySet()){
                if(!entry.getValue().equals("null")){
                    if(count != 0){
                        sb.append(" and ");
                    }
                    sb.append(entry.getKey());
                    sb.append("='");
                    sb.append(entry.getValue());
                    sb.append("'");
                    count++;
                } else {
                    sb.append(";");
                }
            }
            System.out.println(sb);
     }
}

