import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.StatsService;

public class StatsTest {
    @Test

    public void shouldFindMaxSales() {
        StatsService service = new StatsService();

        long[] salesPerMonth = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMonth = 8;
        int actualMonth = service.maxSales(salesPerMonth);
        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test

    public void shouldFindMinSales() {
        StatsService service = new StatsService();

        long[] salesPerMonth = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMonth = 9;
        int actualMonth = service.minSales(salesPerMonth);
        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test
    public void allSales() {
        StatsService service = new StatsService();
        long[] salesPerMonth = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 180;
        long actual = service.allSales(salesPerMonth);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void averageSales() {
        StatsService service = new StatsService();
        long[] salesPerMonth = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 15;
        long actual = service.averageSales(salesPerMonth);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void lowAverageSales() {
        StatsService service = new StatsService();
        long[] salesPerMonth = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;
        long actual = service.lowAverageSales(salesPerMonth);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void highAverageSales() {
        StatsService service = new StatsService();
        long[] salesPerMonth = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;
        long actual = service.highAverageSales(salesPerMonth);
        Assertions.assertEquals(expected, actual);
    }
}
