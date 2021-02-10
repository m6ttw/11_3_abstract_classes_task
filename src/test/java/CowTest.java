import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CowTest {
    Cow cow;

    @Before
    public void before(){
        cow = new Cow("cow", "moo", "dairy");
    }

    @Test
    public void hasBreed(){
        assertEquals("dairy", cow.getBreed());
    }

    @Test
    public void canIntroduceYourself(){
        assertEquals("Hi, I am a cow of the dairy family, moo moo", cow.introduceYourself("cow", "moo", "dairy"));
    }
}
