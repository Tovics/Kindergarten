
public abstract class Child {

    protected String name;
    protected int satisfactionLvl;

    protected boolean isSatisfied() {
        return this.satisfactionLvl != 0;
    }

    protected abstract void deltaSatisfaction(Activities activities);
}
