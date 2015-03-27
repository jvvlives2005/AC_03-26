package nyc.c4q.jvvlives2005;

/** Array Part II- Iterators
 * Created by c4q-joshelynvivas on 3/26/15.
 */
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;

public class Adder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> x = new ArrayList();

        //Exercise: Write a program that asks the user for some integers and
        // adds them to your ArrayList. Use a while loop and break when the user gives you a -2.
        System.out.println("Give me some numbers:");


        while((true)) {
            int num = input.nextInt();
            if (num == -2) {
                System.out.println("Thanks");
                break;
            }
            x.add(num);
            //else {
                 //x.add(num)
               // continue;
            //}
            if (num == -1) {
                x.clear();
            }

        }

        //Exercise: Update your program so that the adder's stored values are cleared if the
        //user inputs -1. It will keep waiting for more positive integers until the user types -2.

        //Using a for each loop, calculate the sum of numbers that the user input.
        /*int sum = 0;
        for (int n : x) {
            sum += n;

        }
        System.out.println(sum); */


        int sum = 0;
        Iterator <Integer> numsIter = x.iterator();
        //Iterator <Integer> numsIter2 = x.iterator();
        while(numsIter.hasNext()){
            sum += numsIter.next();
        }
        //Exercise: Rewrite your sum functionality to use an Iterator rather than a for each loop.
        System.out.println( sum );



        /*while(numsIter2.hasNext()){
            sum += numsIter2.next();
        }*/
        //numsIter.next();




    }
}
