import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.Before;

public class PlanetTest {

  Planet planet;

  @Before
  public void before(){
    planet = new Planet("Pluto", 5);
  }

  @Test
  public void hasName(){
    assertEquals("Pluto", planet.getName());
  }

  @Test
  public void hasSize(){
    assertEquals(5, planet.getSize());
  }

  @Test
  public void canExplode(){
    assertEquals("Boom! Planet is deed", planet.canExplode());
  }
  
}