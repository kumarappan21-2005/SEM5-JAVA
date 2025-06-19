public class eh {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        try {
            int result = a / b;
            System.out.println("Result: " + result);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
