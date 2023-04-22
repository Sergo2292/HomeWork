package HomeWork4;

import java.util.*;

public class Main {
    public static void main(String[] args) {



    String[] words = {"Я", "никогда", "не", "устану", "повторять", "Центральный", "Спортивный", "КЛУБ", "Армии", "Я", "никогда", "не", "устану", "повторять"};
    Set<String> uniqueWords = new HashSet<>(Arrays.asList(words));
        System.out.println(uniqueWords);
        System.out.println();

        Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        System.out.println(map);
        System.out.println();




        PhoneBook pb = new PhoneBook();

        pb.add("Shesterkin", "896254365");
        pb.add("Ovechkin", "1258325463");
        pb.add("Kaprizov", "56465485614");

        System.out.println(pb.get("Ovechkin"));
    }
}
