public class Main {
    public static void main(String[] args) {
        second();
        first();
        second();
        third();
    }
    
    public static void first() {
        System.out.println("Inside first method.");
    }

    public static void second() {
        System.out.println("Insid second method");
        first();
    }

    public static void third() {
        System.out.println("Inside third method");
        first();
        second();
    }
}