import java.util.ArrayList;
import java.util.List;

public class Exercitiu_9 {

    public List<Integer> findVampireNum() {
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 1000; i < 10000; i++) {
            if (i % 100 != 0 && isVampire(i)) {
                list.add(i);
            }
        }
        return list;
    }

    private boolean isVampire(int fourDigitNum) {
        int[] each = getEachNum(fourDigitNum);
        return isEqual(each, fourDigitNum);
    }

    private int[] getEachNum(int num) {
        int[] each = new int[4];
        each[0] = num % 10;
        each[1] = num / 10 % 10;
        each[2] = num / 100 % 10;
        each[3] = num / 1000;
        return each;
    }

    private boolean isEqual(int[] each, int fourDigitNum) {
        int[] eachPair = new int[2];
        int[][] compositions = new int[][] { { 0, 1, 2, 3 }, { 0, 1, 3, 2 },
                { 0, 2, 1, 3 }, { 0, 2, 3, 1 }, { 0, 3, 1, 2 }, { 0, 3, 2, 1 },
                { 1, 2, 0, 3 }, { 1, 2, 3, 0 }, { 1, 3, 0, 2 }, { 1, 3, 2, 0 },
                { 2, 3, 0, 1 }, { 2, 3, 1, 0 } };
        for (int i = 0; i < compositions.length; i++) {
            eachPair[0] = each[compositions[i][0]] * 10
                    + each[compositions[i][2]];
            eachPair[1] = each[compositions[i][1]] * 10
                    + each[compositions[i][3]];
            if (equalResult(eachPair, fourDigitNum)) {
                return true;
            }
        }
        return false;
    }

    private boolean equalResult(int[] eachPair, int fourDigitNum) {
        return eachPair[0] * eachPair[1] == fourDigitNum;
    }


}
