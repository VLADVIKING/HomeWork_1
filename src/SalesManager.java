public class SalesManager {
    protected long[] sales;

    public SalesManager(long[] sales) {
        this.sales = sales;
    }

    public long max(long[] sales) {
        long max = -1;
        for (long sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }

    public int min(int[] sales) {
        int min = 0;
        for (int sale : sales) {
            if (sale < min) {
                min = sale;
            }
        }
        return min;
    }

    public int medium(int[] sales) {
        int medium = 0;
        int sum = 0;
        int j = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > min(sales) && sales[i] < max(sales)) {
                sum += sales[i];
                j++;
            }
        }
        medium = sum / j;
        return medium;
    }

}
