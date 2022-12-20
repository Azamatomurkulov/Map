import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        translator();
    }

    public static void translator() {
        Map<String, String> days = new HashMap<>();
        days.put("Monday", "Понедельник");
        days.put("Tuesday", "Вторник");
        days.put("Wednesday", "Среда");
        days.put("Thursday", "Четверг");
        days.put("Friday", "Пятница");
        days.put("Saturday", "Суббота");
        days.put("Sunday", "Воскресенье");
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите день недели на английском языке: ");
        String day = sc.nextLine();
        String translation = days.get(day);
        if (translation == null) {
            System.out.println("Не правильное значение.");
        } else {
            System.out.println("Перевод на русский язык: " + translation);
        }
    }
}
