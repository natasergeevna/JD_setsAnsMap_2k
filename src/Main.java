import java.util.*;

public class Main {

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }
    public static void task1() {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        List<Integer> numsCopy = new ArrayList<>(nums.size());
        for (int num : nums) {
            if (num % 2 == 1) numsCopy.add(num);
        }
        System.out.println("task 1: " + numsCopy);
    }

    public static void task2() {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        List<Integer> numsCopy = new ArrayList<>(nums.size());
        for (int num : nums) {
            if (!numsCopy.contains(num)) {
                numsCopy.add(num);
            }
        }
        for (int i = 0; i < numsCopy.size(); i++) {
            if (numsCopy.get(i) % 2 == 1) numsCopy.remove(i);
        }
        System.out.println("task 2: " + numsCopy);
    }

    public static void task3() {
        Set<String> mapSet = new HashSet<>(List.of("мама", "папа", "бабушка", "дерево", "крыша", "бабушка", "мама", "семья", "крыша", "крыша"));
        System.out.println("task 3: " + mapSet);
    }

    public static void task4() {
        System.out.println("task 4:");
        List<String> mapSet = new ArrayList<>(List.of("мама", "папа", "бабушка", "дерево", "крыша", "бабушка", "мама", "семья", "крыша", "крыша"));
        for (String s : mapSet) {
            int count = Collections.frequency(mapSet, s);
            System.out.println(s + " встречается " + count);
            count = 0;
        }
    }
}