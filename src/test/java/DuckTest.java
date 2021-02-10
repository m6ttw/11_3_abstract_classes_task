import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DuckTest {
    Duck duck;

    @Before
    public void before(){
        duck = new Duck("duck", "quack");
    }

    @Test
    public void hasSpecies(){
        assertEquals("duck", duck.getSpecies());
    }

    @Test
    public void canIntroduceYourself(){
        assertEquals("Hi, I am a duck, quack quack", duck.introduceYourself("duck", "quack"));
    }
}
