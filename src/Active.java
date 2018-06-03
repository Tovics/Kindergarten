
public class Active extends Child {

    Active(String name, int satisfactionLvl) {
        this.name = name;
        this.satisfactionLvl = satisfactionLvl;
    }

    @Override
    protected void deltaSatisfaction(Activities activities) {
        if (isSatisfied()) switch (activities) {
            case BALL:
                this.satisfactionLvl = 3;
                break;
            case DRAW:
                this.satisfactionLvl -= 1;
                break;
            case SING:
                this.satisfactionLvl -= 1;
                break;
            case DANCE:
                break;
        }
    }
}

/*
Eleven: Labdázás esetén az elégedettsége három lesz, tánc esetén nem
változik, ének és rajz esetén eggyel csökken.
 */
