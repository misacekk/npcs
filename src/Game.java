import java.util.*;

public class Game {

    Scanner sc = new Scanner(System.in);
    ArrayList<NPC> npcs = new ArrayList<>();

    public void start() {

        /* ✅ ZÁKLAD 7:
         vytvoř alespoň 3 NPC:
         - různé chování
         - přidej do seznamu*/


        int choice;

        // ✅ ZÁKLAD 8: menu
        do {
            System.out.println("1 - další kolo");

            // ⭐ BONUS 5: odkomentuj
            // System.out.println("2 - vypiš NPC");

            // ⭐ BONUS 6:odkomentuj
            //System.out.println("3 - změň chování NPC");

            System.out.println("4 - konec");

            // TODO načti volbu (patří do ✅ ZÁKLAD 8)


            if (choice == 1) {

                /* ✅ ZÁKLAD 9:
                 každé NPC provede akci
                 hint: zkus použít for-each*/


                // ⭐ BONUS 6:
                // odstraň mrtvé NPC (hp <= 0)


                // ⭐ BONUS 7:
                // pokud zbyde 1 NPC → vypiš vítěze
            }

            // ⭐ BONUS 5:
            if (choice == 2) {
                // TODO vypiš všechny NPC
            }

            // ⭐ BONUS 6:
            if (choice == 3) {
                // TODO vyber NPC (index)
                // TODO změň behavior
            }

        } while (/* TODO podmínka (patří do ✅ ZÁKLAD 8) */);
    }
}