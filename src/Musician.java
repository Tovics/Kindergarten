
public class Musician extends Child {

    Musician(String name, int satisfactionLvl) {
        this.name = name;
        this.satisfactionLvl = satisfactionLvl;
    }

    @Override
    protected void deltaSatisfaction(Activities activities) {
        if (isSatisfied()) switch (activities) {
            case BALL:
                this.satisfactionLvl -= 1;
                break;
            case DRAW:
                this.satisfactionLvl -= 1;
                break;
            case SING:
                this.satisfactionLvl = 4;
                break;
            case DANCE:
                break;
        }
    }
}

/*
Zenekedvelő: Ének esetén az elégedettsége négy lesz, tánc esetén nem változik,
labdázás és rajz esetén eggyel csökken.
 */
