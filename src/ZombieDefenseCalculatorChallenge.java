
public class ZombieDefenseCalculatorChallenge {

    public static void main(String[] args) {
        int hodorStrength = 50;
        int[] doorsStrength = {10, 25, 5};
        int[] zombieInflux = {2, 3, 1};
        System.out.println(holdTheDoor(hodorStrength, doorsStrength, zombieInflux));
    }

    static int holdTheDoor(int hodorStrength, int[] doorsStrength, int[] zombiesInflux) {
        double maxTime = 0;
        int maxIndex = -1;

        for (int i = 0; i < doorsStrength.length; i++) {
            double time = (double) (doorsStrength[i] + hodorStrength) / zombiesInflux[i];
            if (time > maxTime) {
                maxTime = time;
                maxIndex = i;
            }
        }
        return maxIndex;
    }
}
