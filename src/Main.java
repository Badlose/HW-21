import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        List<String> strings = new ArrayList<>(List.of("один", "два", "два", "три", "три", "три", "три", "три"));

        printOddNumbers(nums);

        printEvenNumbers(nums);

        printUniqueWords(strings);

        printNumberOfReps(strings);
    }

    //Task 1
    public static void printOddNumbers(List<Integer> nums) {
        for (int num : nums) {
            if (num % 2 != 0) {
                System.out.println(num);
            }
        }
    }

    //Task 2
    public static void printEvenNumbers(List<Integer> nums) {
        Set<Integer> evenNumsNoReps = new HashSet<>();

        for (int num : nums) {
            if (num % 2 == 0) {
                evenNumsNoReps.add(num);
            }
        }
        System.out.println(evenNumsNoReps);
    }

    //Task 3
    public static void printUniqueWords(List<String> words) {
        Set<String> uniqueWords = new HashSet<>(words);

        System.out.println(uniqueWords);
    }

    //Task4
    public static void printNumberOfReps(List<String> words) {
        Map<String, Integer> mapWords = new HashMap<>();

        for (String word : words) {
            mapWords.put(word, mapWords.getOrDefault(word, 0) + 1);
        }
        for (int count : mapWords.values()) {
            System.out.println(count);
        }
    }
}