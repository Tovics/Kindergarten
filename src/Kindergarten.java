import java.util.ArrayList;

public class Kindergarten {

    private static ArrayList<Child> kindergarten = new ArrayList<>();
    private static Integer[] games = {1, 2, 4, 3, 1, 3};
    private static Activities activity;
    public static Integer chaosLvl = 0;

    public static void main(String[] args) {

        kindergarten.add(new Lazy("Ede",4));
        kindergarten.add(new Musician("Zsuzsa", 2));
        kindergarten.add(new Active("Emese", 2));
        kindergarten.add(new Active("Emil", 3));
        kindergarten.add(new Lazy("Karcsi", 1));
        kindergarten.add(new Musician("Zoli", 3));

        for (int game : games) {
            System.out.println("\n--------------------------" + "game: " + game);
            switch (game) {
                case 1:
                    activity = Activities.SING;
                    break;
                case 2:
                    activity = Activities.BALL;
                    break;
                case 3:
                    activity = Activities.DRAW;
                    break;
                case 4:
                    activity = Activities.DANCE;
                    break;
            }

            System.out.println(activity);

            for (Child myChild : kindergarten) {
                myChild.deltaSatisfaction(activity);
                System.out.println(myChild.name);
                System.out.println(myChild.getClass());
                System.out.println(myChild.satisfactionLvl + "\n");
                System.out.println("chaosLvl: " + chaosLvl);
                if (myChild.satisfactionLvl == 0) {
                    chaosLvl += 1;
                }

                if (chaosLvl >= 3) {
                    System.out.println("CHAOS EVERYBODY CRY!!!");
                }
            }
        }
    }
}

/*
ének labda rajz tánc
1 2 4 3 1 3
Eleven Ede 1
Kenyelmes Kati 4
Zenekedvelo Zsuzsa 2
Eleven Emese 2
Eleven Emil 3
Kenyelmes Karcsi 1
Zenekedvelo Zoli 3
*/