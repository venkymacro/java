public class compare {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        if (a < b) {
            System.out.println(b + "is larger");
        } else {
            System.out.println(a + "is larger");
        }
    }
}