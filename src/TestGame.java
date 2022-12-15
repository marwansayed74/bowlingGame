import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestGame {
    Game game;
    @Before
    public void setup(){
        game =new Game();
    }
    @Test
    public void testZeroRoll(){
        game.roll(0);
        assertEquals(0,game.score());
    }
    @Test
    public void testNormalRoll() {
        game.roll(4);
        game.roll(5);
        assertEquals(9,game.score());
    }
    @Test
    public void nextRollFailFrame(){
        game.roll(3);
        game.roll(6);
        game.roll(4);
        game.roll(2);
        assertEquals(15,game.score());
    }
    @Test
    public void nextRollSucssFrame(){
        game.roll(10);
        game.roll(3);
        game.roll(2);
        assertEquals(20,game.score());
    }
    @Test
    public void perfectGameScoreIs300(){
        for(int i=0;i<12;i++) {
            game.roll(10);
        }
        assertEquals(300, game.score());
    }
}
