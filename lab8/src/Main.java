public class Main {
    public static void main(String[] args) {
        System.out.println("Cześć");
        LazySingleton s1 = LazySingleton.getInstance();
        LazySingleton s2 = LazySingleton.getInstance();

        System.out.println(s1 + " " + s2);
    }
}