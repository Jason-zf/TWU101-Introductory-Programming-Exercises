package main.com.tw;

public class TriangleExercises_4 {
    public static void main(String[] args) {
        int n = 3;
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < i + 1; ++j) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
