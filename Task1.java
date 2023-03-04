package HW1;

public class Task1 {
    //Вычислить n-е треугольное число и факториал n

    public class task1 {
        public static void main(String[] args) {
            int n = 5;
            System.out.println(triangleDigit(n));
            System.out.println(factorialDigit(n));

        }
        public static int triangleDigit(int n){
            if(n == 1) return 1;
            return n+triangleDigit(n-1);
        }

        public static int factorialDigit(int n){
            if(n == 0) return 1;
            return n*(factorialDigit(n-1));
        }
    }
}
