
public class Lazy extends Child {

    Lazy(String name, int satisfactionLvl) {
        this.name = name;
        this.satisfactionLvl = satisfactionLvl;
    }

    @Override
    protected void deltaSatisfaction(Activities activities) {
        if (isSatisfied()) switch (activities) {
            case BALL:
                this.satisfactionLvl -= 2;
                break;
            case DRAW:
                this.satisfactionLvl = 4;
                break;
            case SING:
                break;
            case DANCE:
                this.satisfactionLvl -= 1;
                break;
        }
    }
}

/*
Kényelmes: Rajz esetén az elégedettsége négy lesz, ének esetén nem változik,
tánc esetén eggyel, labdázás esetén kettővel csökken.
 */