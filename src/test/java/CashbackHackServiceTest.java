
import org.junit.Assert;
import org.junit.Test;
import ru.netology.service.CashbackHackService;

public class CashbackHackServiceTest {
    @Test
    public void shouldAmount900() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;
        int expected = 100;
        int actual = service.remain(900);
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void shouldAmount1700() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1700;
        int expected = 300;
        int actual = service.remain(1700);
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void shouldAmount1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int expected = 0;
        int actual = service.remain(1000);
        Assert.assertEquals(actual, expected);

    }
}