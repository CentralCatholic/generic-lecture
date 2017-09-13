import java.util.Map;
import java.util.HashMap;
// Much of this code was inspired by
// https://www.tutorialspoint.com/java/java_generics.htm
class GenericArrayOperations {
    public static void main(String[] args) {
        Integer[] data = { 9, 8, 2, 3, 5, 1, 1, 8 };
        Integer maxValue = max(data);
        Integer minValue = min(data);
        System.out.println(maxValue);
        System.out.println(minValue);

        // makeHashMap();
    }

    public static <T extends Comparable<T>> T max(T[] array) {
        T maxValue = array[0];

        for(T element : array) {
            if (element.compareTo(maxValue) > 0) {
                maxValue = element;
            }
        }
        return maxValue;
    }

    public static <T extends Comparable<T>> T min(T[] array) {
        T minValue = array[0];

        for(T element : array) {
            if (element.compareTo(minValue) < 0) {
                minValue = element;
            }
        }
        return minValue;
    }

    public static void makeHashMap() {
        Map<String, String> roster = new HashMap<>();
        roster.put("Sean", "Hazlett");
        roster.put("Jackson", "Kaib");
        roster.put("Colin", "Pietropoalo");
        roster.put("Will", "Seeger");
        roster.put("Pearce", "Walsh");

        // Print last names only
        for (String key : roster.keySet()) {
            System.out.println(roster.get(key));
        }
    }
}
