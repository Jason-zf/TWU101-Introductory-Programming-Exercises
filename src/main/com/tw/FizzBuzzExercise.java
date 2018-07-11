package main.com.tw;

public class FizzBuzzExercise {
    public static void main(String[] args) {
        FizzBuzz();
    }

    private static void FizzBuzz() {
        int n = 100;
        for (int i = 1; i <= n; ++i) {
            String res = "";
            if (i % 3 == 0) {
                res = "Fizz";
            }
            if (i % 5 == 0) {
                res += "Buzz";
            }
            if (res == "") {
                System.out.println(i);
                continue;
            }
            System.out.println(res);
        }
    }
}
