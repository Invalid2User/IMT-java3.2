public class BmiService {
    public int calculate(int weight, double height) {
        int a = 2;
        int imt = (int) (weight / Math.pow(height, a));
        return imt;
    }
}
