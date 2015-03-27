package nyc.c4q.jvvlives2005;

/**
 * Created by c4q-joshelynvivas on 3/26/15.
 */
import java.util.ArrayList;
import java.util.Iterator;

public class IterateOverArray {
    public static void main(String[] args) {
        ArrayList<String> positions = new ArrayList<String>();

        positions.add("First");
        positions.add("Second");
        positions.add("Third");
        Iterator<String> iterate = positions.iterator();
        while (iterate.hasNext()) {
        System.out.println(iterate.next());
    }
}

}