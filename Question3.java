package Task_12;

import java.util.TreeMap;

public class Question3 {
    public static void main(String[] args) {
        // Step 2: Create a TreeMap to store employee ID and names
        TreeMap<Integer, String> employees = new TreeMap<>();

        // Step 3: Add some employee entries to the TreeMap
        employees.put(102, "Suriya");
        employees.put(105, "Praba");
        employees.put(101, "Ram");
        employees.put(104, "Ravi");
        employees.put(103, "Mithran");

        // Step 4: Retrieve and print the names of the employees in alphabetical order
        System.out.println("Employees in alphabetical order:");

        // Since TreeMap sorts the keys, we need to sort the values (names) in alphabetical order
        employees.values().stream()
                .sorted()
                .forEach(System.out::println);
    }
}