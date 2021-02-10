import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FarmAnimalTest {
    FarmAnimal farmAnimal;
//
//    @Before
//    public void before(){
//        farmAnimal = new FarmAnimal("Cow");
//    }

    @Test
    public void hasSpecies(){
        assertEquals("Cow", farmAnimal.getSpecies());
    }

    @Test
    public void canIntroduceYourself(){
        assertEquals("Hi, I am a Cow", farmAnimal.introduceYourself("Cow"));
    }


}
