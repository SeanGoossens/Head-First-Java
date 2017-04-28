package Chapter2;

//Guess: This won't do anything since the new object "t" is never constructed in the main.
//Answer: Correct!

class TapeDeck {
    boolean canRecord = false;
    void playTape() {
        System.out.println("tape playing");
    }
    void recordTape() {
        System.out.println("tape recording");
    }
}

class TapeDeckTestDrive {
    public static void main(String [] args) {
        //ADDED
        TapeDeck t = new TapeDeck();
        t.canRecord = true;
        t.playTape();
        if (t.canRecord == true) {
            t.recordTape();
        }
    }
}