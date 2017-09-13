import java.util.ArrayList;

public class ArrayListExample {

    public static void main(String[] args) {

        // This arraylist has no generic type. It holds anything
        // of type Object.
        ArrayList untyped = new ArrayList();
        untyped.add("foobar");
        untyped.add(100);

        // Because it stores everything as Objects,
        // it forgets the concrete type
        
        // String foobar  = untyped.get(0); // Type error: Object != string
        // int oneHundred = untyped.get(1); // Type error: Object != int
        Object foobar = untyped.get(0);
        Object oneHundred = untyped.get(1);

        // let's add a generic type
        ArrayList<String> stringList = new ArrayList<String>();
        stringList.add("foo");
        stringList.add("bar");

        // Now, the list can only accept strings
        // stringList.add(100); // Type error: string != int
        
        // Similarly, all methods that returned an Object
        // now return a String instead
        String foo = stringList.get(0);
        String bar = stringList.get(1);
        System.out.println(foo);
        System.out.println(bar);

        // The angle brackets denote a "type parameter"
        // Just like functions can specify parameters that are concrete values,
        // they can also specify parameters that are types.

        // Just like with Arrays, you can specify multiple dimentions
        // of ArrayLists, nesting their generic types
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<ArrayList<Integer>>();

        // Finally, Java 7 lets you infer the type of the right-hand value
        ArrayList<ArrayList<Integer>> matrixInferred = new ArrayList<>();
    }
}
