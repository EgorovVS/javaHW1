package HW1;

//Вывести все простые числа от 1 до 1000

public class Task2 {
    public static void main(String[] args) {
        checkPrimeNumbers(1, isPrimeNumbers(1));

    }

    public static boolean isPrimeNumbers(int number) {
        if(number == 1) return false;
        if(number == 2) return true;
        if (number % 2 == 0) return false;
        for (int i = 2; i < number / 2; i++) {
            if (number > 2) {
                if (number % i == 0) return false;
            }
        }
        return true;
    }

    public static void printPrimeNumbers(int number) {
        System.out.print(number + " ");
    }

    public static int checkPrimeNumbers(int number, boolean isPrime) {
        if (number == 1001) return 0;
        if (isPrime) printPrimeNumbers(number);
        return checkPrimeNumbers(++number, isPrimeNumbers(number));
    }
}

