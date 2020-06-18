
package towerdefense.domain;

import org.junit.Test;
import static org.junit.Assert.*;


public class TowerTest {
    
    @Test
    public void newTowerCorrect() {
        Tower tower = new Tower("TestTower", 200, 5, 10, 3);
        assertEquals("TestTower", tower.getName());
        assertEquals(200, tower.getCost());
        assertEquals(5, tower.getPower());
        assertEquals(10, tower.getCooldown());
        assertEquals(3, tower.getRange());
    }
}
