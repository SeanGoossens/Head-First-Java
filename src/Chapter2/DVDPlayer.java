package Chapter2;

//Guess: No method for d.playDVD(); exists. One needs to be created.
//Answer: Correct!
class DVDPlayer {
    boolean canRecord = false;
    void recordDVD() {
        System.out.println("DVD recording");
    }

   //ADDED
    void playDVD() {
        System.out.println("DVD Playing");
    }
}
class DVDPlayerTestDrive {
    public static void main(String [] args) {
        DVDPlayer d = new DVDPlayer();
        d.canRecord = true;
        d.playDVD();
        if (d.canRecord == true) {
            d.recordDVD();
        }
    }
}
