package HW1;

import java.util.ArrayList;

//Задано уравнение вида q + w = e, q, w, e >= 0.
//Некоторые цифры могут быть заменены знаком вопроса, например 2? + ?5 = 69 (пользователь).
//Требуется восстановить выражение до верного равенства.
//Предложить хотя бы одно решение или сообщить, что его нет.
//Ввод: 2? + ?5 = 69
//Вывод: 24 + 45 = 69

public class Task4 {
    public static void main(String[] args) {
        String equation = "2? - ?5 = 69";
        calculate(equation);
    }

    public static void calculate(String equation) {
        int count = 0;
        String answer = "";
        for (int i = 9; i >= 0; i--) {
            if (calc(equation, digits(replaceQuest(equation, i))) == Integer.parseInt(digits(equation)[2])) {
                answer += replaceQuest(equation,i)+"\n";
                count++;
            }
        }
        System.out.println(count !=0? answer: "Решения нет");
    }

    public static String[] digits(String str) {
        String[] digits = (str.replace(" ", "").split("[+=*/-]"));
        return digits;
    }

    public static int calc(String str, String[] digits) {
        return str.contains("+") ? Integer.parseInt(digits[0]) + Integer.parseInt(digits[1]) :
                str.contains("-") ? Integer.parseInt(digits[0]) - Integer.parseInt(digits[1]) :
                        str.contains("*") ? Integer.parseInt(digits[0]) * Integer.parseInt(digits[1]) :
                                Integer.parseInt(digits[0]) / Integer.parseInt(digits[1]);
    }

    public static String replaceQuest(String str, int i) {
        String replaceQuest = str.replace("?", Integer.toString(i));
        return replaceQuest;
    }
}

