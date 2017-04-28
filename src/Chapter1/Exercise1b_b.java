package Chapter1;

//Guess: Will output "small x"

//Answer: Won't compile without a class declaration

public class Exercise1b_b {
    public static void main(String[] args){
        int x = 5;
        while (x > 1) {
            x = x - 1;
            if (x < 3) {
                System.out.println("small x");
            }
        }
    }
}
