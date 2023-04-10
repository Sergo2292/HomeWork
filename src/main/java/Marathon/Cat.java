package Marathon;

public class Cat extends Animal implements Competitor {
    public Cat(String name) {

        super("Cat", name, 200, 20, 2);
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
