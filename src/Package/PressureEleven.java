package Package;

public class PressureEleven {
    public static String weatherInfo(int temp) {
        double c=convertToCelsius(temp);
        double roundedValue=roundoff(c,15);
        String result = "";
        if (roundedValue < 0){
            result=roundedValue + " is freezing temperature";
        }else{
            result=roundedValue + " is above freezing temperature";
        }
        System.out.println(result);
        return result;
    }

    public static double convertToCelsius(int temperature) {
        double celsius = (temperature-32)*(5/9.0);
        return celsius;
    }

    public static double roundoff(double temperature, int precisionLevel) {
        double prec = Math.pow(10, precisionLevel);
        return Math.round(temperature * prec) / prec;
    }

    public static void main(String[] args) {
        System.out.print("Result: ");
        weatherInfo(23);
    }
}
