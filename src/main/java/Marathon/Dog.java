package Marathon;

public class Dog extends Animal implements Competitor {
    public Dog (String name) {
        super("Dog", name, 700, 5, 1);
    }

    @Override
    public void run(int dist) {

    }

    @Override
    public void swim(int dist) {

    }

    @Override
    public void jump(int height) {

    }

    @Override
    public boolean isOnDistance() {
        return false;
    }

    @Override
    public void info() {

    }
}
