public class Main {
    public static void main(String[] args) {
        SalesManager salesManager = new SalesManager(new long[]{0, 2, 3});
        System.out.println(salesManager.max(salesManager.sales));
    }
}