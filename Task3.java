package HW1;

import java.util.Scanner;

//Реализовать простой калькулятор (+ - / *)
public class Task3 {
    public static void main(String[] args) {
        calculator();
    }

    public static void calculator() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите первое число ");
        int a = sc.nextInt();
        System.out.print("Введите второе число ");
        int b = sc.nextInt();
        System.out.print("Выберите операцию ");
        String operand = sc.next();
        print(calc(a, b, operand));


    }

    public static double calc(int a, int b, String operand) {
        return operand.equals("+") ? a + b : operand.equals("-") ? a - b : operand.equals("*") ? a * b : a / b;
    }

    public static void print(double answer) {
        if (answer % 1 == 0) {
            System.out.println((int) answer);
        } else {
            System.out.println(answer);
        }
//        System.out.println(answer % 1 == 0 ? (int)answer : (answer));

    }

}
