package Chapter1;

/**
 * Created by sgoossens on 4/27/2017.
 */
public class MixedMessages {
    public static void main(String[] args) {
        int x = 0;
        int y = 0;
        while (x < 5) {
            //Test code goes here

            System.out.print(x + "" + y + " ");
            x = x + 1;
        }
    }
}


/* CANDIDATES
y = x - y;
Guess: 00 11 21 32 42

y = y + x;
Guess: 00 11 23 36 410


y = y + 2;
if  (y > 4) {
    y = y - 1;
}
Guess: 02 14 25 36 41

x = x + 1;
y = y + x;
Guess: 11 34 59

if (y < 5) {
    x = x + 1;
    if (y < 3) {
        x = x - 1;
    }
}
Guess: 02 14 36 48
 */


