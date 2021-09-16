package Package;

public class PressureFour {
    public static boolean isDivisible(int wallLength, int pixelSize) {
        return wallLength % pixelSize == 0;
    }

    public static void main(String[] args) {
        System.out.println("Result: " + isDivisible(4066,27));
    }

}
