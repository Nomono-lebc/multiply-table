public class App {
    public static void main(String[] args) throws Exception {
        printMultiplyTable(5);
    }

    public static void printMultiplyTable(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }
}
