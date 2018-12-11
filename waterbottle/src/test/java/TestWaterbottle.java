import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TestWaterbottle {

    Waterbottle waterbottle;



    @Before
    public void before(){
        waterbottle = new Waterbottle();
    }

    @Test
    public void hasVolume(){
        assertEquals(100, waterbottle.getVolume());
    }

    @Test
    public void canSetVolume(){
        waterbottle.setVolume(90);
        assertEquals(90, waterbottle.getVolume());
    }

    @Test
    public void canTakeSip(){
        assertEquals(90, waterbottle.takeSip());
    }

    @Test
    public void canEmpty(){
        waterbottle.empty();
        assertEquals(0, waterbottle.getVolume());
    }

    @Test
    public void canFill(){
        waterbottle.fill();
        assertEquals(100, waterbottle.getVolume());
    }




}
