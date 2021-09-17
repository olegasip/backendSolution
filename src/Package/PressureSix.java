package Package;

public class PressureSix {
    public static int toBinary(int n) {
        String i = Integer.toBinaryString(n);
        int io = Integer.valueOf(i);
        return io;
    }

    public static void main(String[] args) {
        System.out.print("Result: " + toBinary(7));
    }
}
