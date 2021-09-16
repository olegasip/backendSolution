package Package;

public class PressureThree {
    public static double getVolumeOfCuboid(final double length, final double width, final double height) {
        return length * width * height;
    }

    public static void main(String[] args) {
        System.out.println("Volume of a Cuboid: " + getVolumeOfCuboid(14.1, 8, 21.6));
    }
}
