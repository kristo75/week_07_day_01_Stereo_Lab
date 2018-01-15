import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ComponentTest {

    Radio radio;


    @Before
    public void before(){
        radio = new Radio("Sony", "xxx");
    }



    @Test
    public void canSwitchOn(){
        assertEquals("Heating up valves", radio.switchOn());
    }

    @Test
    public void canSwitchOff(){
        assertEquals("Fades out", radio.switchOff());
    }

    @Test
    public void canGetMake(){
        assertEquals("Sony", radio.getMake());
    }

    @Test
    public void canGetModel(){
        assertEquals("xxx", radio.getModel());
    }
}