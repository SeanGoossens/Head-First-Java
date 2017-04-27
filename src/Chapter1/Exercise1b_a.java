package Chapter1;

//Guess: There is no auto increment, so this will do nothing. Will loop forever.

//Answer: This will compile and run (no output), but
//without a line added to the program, it
//would run forever inan infinite 'while' loop!

public class Exercise1b_a {

    public static void main(String[] args) {
        int x = 1;
        while ( x < 10) {
            if ( x > 3) {
                System.out.println("big x");
            }
        }
    }
}


