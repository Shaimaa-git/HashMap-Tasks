import java.util.HashMap;
import java.util.Map;

public class HashMapEqualityExample {
    public static void main(String[] args) {
        // Create the first HashMap
        Map<Integer, String> hashMap1 = new HashMap<>();
        hashMap1.put(1, "Apple");
        hashMap1.put(2, "Banana");
        hashMap1.put(3, "Cherry");

        // Create the second HashMap
        Map<Integer, String> hashMap2 = new HashMap<>();
        hashMap2.put(1, "Apple");
        hashMap2.put(2, "Mango");
        hashMap2.put(3, "Cherry");

        // Check if the two HashMaps are equal
        boolean areEqual = hashMap1.equals(hashMap2);
        //print first hashMap
        System.out.println("The first HashMap: "+hashMap1);
        //print Second hashMap
        System.out.println("The second HashMap: "+hashMap2);
        // Print the result
        System.out.println("Are the two HashMaps equal? " + areEqual);
    }
}
