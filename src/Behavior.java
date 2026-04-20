import java.util.*;

public interface Behavior {

    // ✅ ZÁKLAD 1:
    // metoda act()
    // NPC provede akci vůči ostatním
    void act(NPC self, ArrayList<NPC> all);

    // ✅ ZÁKLAD 2:
    // vrátí název chování
    String getName();
}