import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SalesManagerTest {

    SalesManager salesManager = new SalesManager();
    @Test
    void max() {
        long expect = 300;
        long result = salesManager.max(new long[]{100, 200, 30, 220, 150, 300, -20, 0, 32});
        Assertions.assertEquals(expect, result);
    }

    @Test
    void min() {
        long expect = -40;
        long result = salesManager.min(new long[]{100, 200, 30, 220, 150, 221, -20, 0, 32, -40});
        Assertions.assertEquals(expect, result);
    }

    @Test
    void medium() {
        long min = -100;
        long max = 300;
        long expect = 150;
        long result = salesManager.medium(new long[]{-100, 200, 100, 300});
        Assertions.assertEquals(expect, result);
    }
}