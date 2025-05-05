import java.util.stream.IntStream;

public class App {
    public static void main(String[] args) throws Exception {
        printMultiplyTable(5);
        System.out.println("Recursive: ");
        printMultiplyTableRecursive(5, 1);
        System.out.println("Lambda: ");
        printMultiplyTableLambda(5);
    }

    public static void printMultiplyTable(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }

    public static void printMultiplyTableLambda(final int n) {
        IntStream.rangeClosed(1, 10)
        .forEach(i -> System.out.println(n + " x " + i + " = " + (n * i)));
    }

    public static void printMultiplyTableRecursive(final int n, final int i) {
        if (i > 10) return;
        System.out.println(n + " x " + i + " = " + (n * i));
        printMultiplyTableRecursive(n, i + 1);
    }
}
