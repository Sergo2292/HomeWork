package HomeWork3;

public class Main {
    public static void main(String[] args) {
        Box<Apple> appleBox = new Box<>();
        appleBox.addFruit(new Apple(1.0f));
        appleBox.addFruit(new Apple(1.0f));
        appleBox.addFruit(new Apple(1.0f));
        appleBox.addFruit(new Apple(1.0f));

        System.out.println("Вес коробки с яблоками = " + appleBox.getWeight());
        appleBox.printInfo();

        Box<Orange> orangeBox = new Box<>();
        orangeBox.addFruit(new Orange(1.5f));
        orangeBox.addFruit(new Orange(1.5f));

        System.out.println("Вес коробки с апельсинами = " + orangeBox.getWeight());
        orangeBox.printInfo();

        System.out.print("Коробки с яблоками и апельсинами ");
        appleBox.compare(orangeBox);

        Box<Apple> appleBox2 = new Box<>();
        appleBox2.addT(new Apple(1.0F));
        System.out.print("\nВ коробке с яблоками №2: ");
        appleBox2.printInfo();


        appleBox.putT(appleBox2);
        System.out.print("\nВ коробке с яблоками №1 стало: ");
        appleBox.printInfo();
        System.out.print("В коробке с яблоками №2 было: ");
        appleBox2.printInfo();
        System.out.println("\nВес коробки с яблоками №2 = " + appleBox2.getWeight());
    }



    public static void replacement(Object[] array, int a, int b) {
        Object tmp = array[a];
        array[a] = array[b];
        array[b] = tmp;
    }
}
