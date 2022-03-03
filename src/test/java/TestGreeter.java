import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestGreeter {
    Greeter g = new Greeter("Raluca") ;

    @Test
    public void testGreeter() {
        g.setName("Raluca");
        assertEquals(g.getName(), "Raluca");
        assertEquals(g.sayHello(), "Hello Raluca!");
    }

    @Test
    public void newtestWMGreeterPass() {
        g.setName("Boris");
        assertEquals(g.getName(), "Boris");
        assertEquals(g.sayHello(), "Hello Boris!");
    }
}