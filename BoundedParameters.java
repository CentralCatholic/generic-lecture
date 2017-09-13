import java.io.InputStream;
import java.io.FileInputStream;
import java.io.File;

public class BoundedParameters {
    
    public static void main(String[] args) throws Exception {

        // You can write your own parameterized types:
        // Check out the Node.java class for a custom bounded generic
        // Node<String> node = new Node<String>("Hello");
        // System.out.println(node.toString());

        // Here's an example of a useful, **bounded** type.
        // Check out BoundedEcho.java to see the implementation.
        // The types that can be passed to the BoundedEcho constructor
        // must be subtypes of InputStream.
        // This makes them scannable.
        FileInputStream file = new FileInputStream(new File("BoundedParameters.java"));

        BoundedEcho<InputStream> echo = new BoundedEcho<>(file);
        //BoundedEcho<InputStream> echo = new BoundedEcho<>(System.in);
        echo.allLines();
    }
}
