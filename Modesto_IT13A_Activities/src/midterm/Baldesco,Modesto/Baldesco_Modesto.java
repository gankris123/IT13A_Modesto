
public class Baldesco_Modesto {

    public static int addNum(int a, int b) {
        return a + b;
    }

    public static int subNum(int a, int b) {
        return a - b;
    }

    public static int multNum(int a, int b) {
        return a * b;
    }

    public static double divNum(double a, double b) {
        return a / b;
    }

    public static float percentNum(float a, float b) {
        return (float) (a * b / 100);
    }

    public static void main(String[] args) {
        int x = 15, y = 17;
        System.out.println("The addition: " + addNum(x, y));
        System.out.println("The Subtraction: " + subNum(x, y));
        System.out.println("The multiplication: " + multNum(x, y));
        System.out.println("The division: " + divNum(x, y));
        System.out.println("The percentage: " + percentNum(x, y));
    }
}
