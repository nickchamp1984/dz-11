import org.example.Woman;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WomanTests {
    Woman woman = new Woman("Mykola", "", 38);
    Woman woman1 = new Woman("Vasya", "", 65);

    @Test
    void manIsRetired() {
        Assert.assertTrue(woman1.isRetired());
    }

    @Test
    void manIsNotRetired() {
        Assert.assertFalse(woman.isRetired());
    }
}
