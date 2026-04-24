import java.util.*;

public class AggressiveBehavior implements Behavior {
    Random rand = new Random();

    @Override
    public void act(NPC self, ArrayList<NPC> all) {
        if (all.size() < 2) return;

        NPC target;
        do {
            target = all.get(rand.nextInt(all.size()));
        } while (target.equals(self));

        int damage = rand.nextInt(3, 11);
        target.setHP(target.getHP() - damage);
        System.out.println(self.getName() + " ubral hraci " + target.getName() + " " + damage + " zivotu");
    }

    public String getName() {
        return "Agresivni chovani";
    }
}