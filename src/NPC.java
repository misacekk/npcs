import java.util.*;

public class NPC {
    private String name;
    private int hp;
    private int maxHP;
    private Behavior chovani;

    NPC(String name, int hp, int maxHP, Behavior chovani) {
        this.name = name;
        this.hp = hp;
        this.maxHP = maxHP;
        this.chovani = chovani;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHP() {
        return hp;
    }

    public void setHP(int hp) {
        this.hp = hp;
    }

    public Behavior getChovani() {
        return chovani;
    }

    public void setChovani(Behavior chovani) {
        this.chovani = chovani;
    }

    public void performAction(ArrayList<NPC> npcs) {
        chovani.act(this, npcs);
    }

    public boolean isAlive() {
        return hp > 0;
    }

    public void printInfo() {
        System.out.println("NPC name: " + this.name + " (" + chovani.getName() + ")");
        System.out.println("HP: " + this.hp);
    }
}