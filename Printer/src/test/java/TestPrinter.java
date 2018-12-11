import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TestPrinter {

    Printer printer;

    @Before
    public void before(){
        printer = new Printer(100);
    }

    @Test
    public void canGetPages(){
        assertEquals(100, printer.getPages());
    }

    @Test
    public void canPrint(){
        printer.print(2);
        assertEquals("Can print, there are 98 pages left", printer.print(2));
    }




}
