import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloWorldTest {

    @Test
    public void testingHelloWorld(){
        String word = "world";
        HelloWorld helloWorld = new HelloWorld(word);
        assertEquals(helloWorld.sayHello(), "Hello, World");
    }

    @Test
    public void testingHelloWorldWithName(){
        String word = "felicia";
        HelloWorld helloWorld = new HelloWorld(word);
        assertEquals(helloWorld.sayHello(), "Hello, Felicia");
    }
}