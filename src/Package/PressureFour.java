package Package;

public class PressureFour {
    public static boolean isDivisible(int wallLength, int pixelSize) {
        if(wallLength % pixelSize == 0){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println("Result: " + isDivisible(4050,27));
    }

}
