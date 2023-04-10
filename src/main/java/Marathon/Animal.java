package Marathon;

public class Animal {
    String type;
    String name;

    int maxRunDistance;
    int maxJumpHeight;
    int maxSwimDistance;

    boolean onDistance;

    public Animal(String type, String name, int maxRunDistance, int maxJumpHeight, int maxSwimDistance) {
        this.type = type;
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
        this.maxSwimDistance = maxSwimDistance;
        this.onDistance = true;
    }



}
