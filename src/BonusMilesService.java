public class BonusMilesService {
    public int calculate(int price) {
        int result;
        if (19 < price) {
            result = 1;
            System.out.println(price / 20);
        } else {
            result = 0;
        }
        return result;
    }
}