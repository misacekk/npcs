import java.util.*;

public class Game {

    Scanner sc = new Scanner(System.in);
    ArrayList<NPC> npcs = new ArrayList<>();

    public void start() {
        RandomBehavior r = new RandomBehavior();
        AggressiveBehavior ag = new AggressiveBehavior();
        PassiveBehavior p = new PassiveBehavior();

        npcs.add(new NPC("Steven", 50, 50, r));
        npcs.add(new NPC("Musil", 50, 50, ag));
        npcs.add(new NPC("Eis", 50, 50, p));

        int choice;

        do {
            System.out.println("\n1 - další kolo");
            System.out.println("2 - vypiš NPC");
            System.out.println("3 - změň chování NPC");
            System.out.println("4 - konec");
            System.out.print("volba: ");
            choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                if (npcs.size() <= 1) {
                    System.out.println("Není s kým bojovat.");
                    continue;
                }

                for (int i = 0; i < npcs.size(); i++) {
                    npcs.get(i).performAction(npcs);
                }

                for (int i = npcs.size() - 1; i >= 0; i--) {
                    if (!npcs.get(i).isAlive()) {
                        System.out.println("NPC " + npcs.get(i).getName() + " zemřel.");
                        npcs.remove(i);
                    }
                }

                if (npcs.size() == 1) {
                    System.out.println("--- " + npcs.get(0).getName() + " je vítěz! ---");
                }
            }

            if (choice == 2) {
                for (NPC n : npcs) {
                    n.printInfo();
                }
            }

            if (choice == 3) {
                System.out.println("Seznam NPC");
                for (int i = 0; i < npcs.size(); i++) {
                    System.out.println(i + ". " + npcs.get(i).getName());
                }
                System.out.print("Vyber si NPC: ");
                int npcVyber = sc.nextInt();
                System.out.println("1 - Agresivní");
                System.out.println("2 - Pasivní");
                System.out.println("3 - Náhodné");
                int vyberChovani = sc.nextInt();

                if (vyberChovani == 1) {
                    NPC npc = npcs.get(npcVyber);
                    AggressiveBehavior aggressive = new AggressiveBehavior();
                    npc.setChovani(aggressive);
                } else if (vyberChovani == 2) {
                    NPC npc = npcs.get(npcVyber);
                    PassiveBehavior passive = new PassiveBehavior();
                    npc.setChovani(passive);
                } else if (vyberChovani == 3) {
                    NPC npc = npcs.get(npcVyber);
                    RandomBehavior random = new RandomBehavior();
                    npc.setChovani(random);
                }
            }

        } while (choice != 4 && npcs.size() > 1);
        System.out.println("Hra skončila.");
    }
}