import java.util.*;

public class RandomBehavior implements Behavior {
    Random rand = new Random();

    @Override
    public void act(NPC self, ArrayList<NPC> all) {
        int mode = rand.nextInt(1, 5); // 1 až 4
        switch (mode) {
            case 1:
                if (all.size() < 2) break;
                NPC target1;
                do {
                    target1 = all.get(rand.nextInt(all.size()));
                } while (target1.equals(self));
                int damage = rand.nextInt(3, 11);
                target1.setHP(target1.getHP() - damage);
                System.out.println(self.getName() + " ubral hraci " + target1.getName() + " " + damage + " zivotu");
                break;
            case 2:
                self.setHP(self.getHP() + 3);
                System.out.println(self.getName() + " se vylecil o 3 hp");
                break;
            case 3:
                System.out.println(self.getName() + ": Nic se nestalo.");
                break;
            case 4:
                if (all.size() < 2) break;
                NPC target2;
                do {
                    target2 = all.get(rand.nextInt(all.size()));
                } while (target2.equals(self));
                int strongDamage = rand.nextInt(6, 22);
                target2.setHP(target2.getHP() - strongDamage);
                System.out.println("Silný útok, " + self.getName() + " ubral hraci " + target2.getName() + " " + strongDamage + " zivotu.");
                break;
        }
    }

    public String getName() {
        return "Nahodne chovani";
    }
}