
package towerdefense.domain;


public class Tower {
    private String name;
    private int cost;
    private int power;
    private int cooldown;
    private int range;

    public Tower(String name, int cost, int power, int cooldown, int range) {
        this.name = name;
        this.cost = cost;
        this.power = power;
        this.cooldown = cooldown;
        this.range = range;
    }

    public String getName() {
        return name;
    }

    public int getCost() {
        return cost;
    }

    public int getPower() {
        return power;
    }

    public int getCooldown() {
        return cooldown;
    }

    public int getRange() {
        return range;
    }
    
    
    
}
