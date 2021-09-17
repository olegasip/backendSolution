package Package;

public class PressureSeven {
    public static int Past(int h, int m, int s){
        int res = 0;
        if((h >= 0 & h <= 24) & (m >= 0 & m <= 60) & (s >= 0 & s <= 60)){
            res = ((h * 3600000) + (m * 60000) + (s * 1000));
        }else {
            System.out.println("Invalid data");
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println("Result: " + Past(0, 1, 1));
    }
}
