import java.io.InputStream;
import java.util.Scanner;

public class BoundedEcho<T extends InputStream> {

    Scanner keyboard;

    public BoundedEcho(T inStream) {
        this.keyboard = new Scanner(inStream);
    }

    public void allLines() {
        while(this.keyboard.hasNextLine()) {
            System.out.println(this.keyboard.nextLine());
        }
    }
}
