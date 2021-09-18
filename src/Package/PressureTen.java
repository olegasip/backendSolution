package Package;

public class PressureTen {
    public static String datingRange(int age) {
        var minAge = age <= 14 ? (int)(age - 0.1 * age) : age / 2 + 7;
        var maxAge = age <= 14 ? (int)(age + 0.1 * age) : (age - 7) * 2;
        return minAge + "-" + maxAge;
    }

    public static void main(String[] args) {
        System.out.println("Result: " + datingRange(27));
    }
}
