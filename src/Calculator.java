public class Calculator {
    public int div(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("wrong argument");
        }
        return a/b;
    }
}
