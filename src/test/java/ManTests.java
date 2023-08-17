import org.example.Man;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ManTests {

    Man man = new Man("Mykola", "", 38);
    Man man1 = new Man("Vasya", "", 65);

    @Test
    void manIsRetired() {
        Assert.assertTrue(man1.isRetired());
    }

    @Test
    void manIsNotRetired() {
        Assert.assertFalse(man.isRetired());
    }
}
