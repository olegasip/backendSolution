package Package;

public class PressureFive {
    public static String greet(String name) {
        if(name.equals("Johnny")){
            return "Hello, my love!";
        }else{
            return String.format("Hello, %s!", name);
        }
    }

    public static void main(String[] args) {
        System.out.println("Result: ");
        System.out.println("    " + greet("Johnny"));
        System.out.println("    " + greet("Steve"));
    }
}
