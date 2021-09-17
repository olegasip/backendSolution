package Package;

public class PressureNine {
    public static int makeNegative(final int x) {
        int res = 0;
        if (x > 0){
            res = (x - x) -x;
        }else {
            res = x;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println("Result: " + makeNegative(7));
    }
}
