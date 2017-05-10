import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by Andreea on 11.05.2017.
 */

public class TestMain {

    @Test
    public void test()  {
        Main m=new Main("a");
        assertTrue(m.test());
    }
}
