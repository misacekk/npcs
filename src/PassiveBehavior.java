import java.util.*;

public class PassiveBehavior implements Behavior {
    @Override
    public void act(NPC self, ArrayList<NPC> all) {
        self.setHP(self.getHP() + 3);
        if (self.getHP() >= 100) {
            self.setHP(100);
        }
        System.out.println(self.getName() + " se vylecil o 3 hp");
    }


    public String getName() {
        return "Pasivni chovani";
    }

}