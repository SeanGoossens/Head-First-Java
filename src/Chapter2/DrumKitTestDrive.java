package Chapter2;

/**
 * Created by sgoossens on 4/27/2017.
 */

class DrumKit {
    boolean topHat = true;
    boolean snare = true;
    void playSnare() {
        System.out.println("bang bang ba-bang");
    }
    void playTopHat () {
        System.out.println("ding ding da-ding");
    }


}
public class DrumKitTestDrive {
    public static void main(String[] args) {
        DrumKit d = new DrumKit();
        d.playSnare();
        d.snare = false;
        if (d.snare == true) {
            d.playSnare();
        }
        d.playTopHat();
    }
}
