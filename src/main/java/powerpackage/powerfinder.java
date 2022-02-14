package powerpackage;

public class powerfinder {
    public static int OF(int x, int y) {
        int power = 1;
        for (int i = 0; i < y; i++) {
            power *= x;
        }
        return power;
    }
}
