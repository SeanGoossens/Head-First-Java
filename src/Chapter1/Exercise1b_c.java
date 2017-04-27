package Chapter1;

//Guess: Won't compile because it's missing the static main.

//Answer: The 'while' loop code must be inside a method. It can't just be hanging out inside the class.

public class Exercise1b_c {
    int x = 5;
    while (x < 1){
        x = x - 1;
        if (x < 3) {
            System.out.println("small x");
        }
    }
}
