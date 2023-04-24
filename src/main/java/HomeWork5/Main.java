package HomeWork5;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String header[] = new String[]{"Фамилия", "Имя", "Отчество"};
        String fio[][] = new String[][]{{"Иванов", "Иван", "Иванович"},{"Петров", "Петр", "Петрович"}};
        AppData appData = new AppData();
        appData.setHeader(header);
        appData.setData(fio);

        appData.save("hw5_load.csv");
        appData.load("hw5_load.csv");

        System.out.println(Arrays.toString(appData.getHeader()));
        System.out.println(Arrays.deepToString(appData.getData()));

        appData.save("hw5_save.csv");
    }
}
