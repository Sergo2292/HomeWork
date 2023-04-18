package HomeWork3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Box<T extends Fruit> {
    private List<T> list;

    public Box(T... fruits) {
        this.list = new ArrayList<>(Arrays.asList(fruits));
    }

    public List<T> getFruitList() {
        return list;
    }

       public void addFruit(T fruit) {
        list.add(fruit);
    }

    public float getWeight() {
        return list.size() * list.get(0).getWeight();
    }

    @Override
    public String toString() {
        return "Box{" +
                "fruitList=" + list +
                '}';
    }

    public void printInfo() {
        if (list.size() == 0)
            System.out.println("нет фруктов");
        else {
            for (int i = 0; i < list.size(); i++) {
                System.out.println(list.get(i).getWeight() + " ");
            }
        }
    }

    public void compare(Box<?> b) {
        if (Math.abs(this.getWeight() - b.getWeight()) < 0.1)
            System.out.print(" равны по весу");
        else
            System.out.print(" не равны по весу");
    }

    public void addT(T fruit) {
        list.add(fruit);
    }

    public void putT(Box<T> b) {
        b.getFruitList().addAll(list);
        list.clear();
    }

}

