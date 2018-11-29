package naive;

/**
 * Reverse a 3-digit integer.
 * @Author: Atlantis
 * @Date: 2018/11/27 13:02
 * @Version: Since 1.0.0
 * @Copyright: Copyright (c) 2018
 */
public class Solution37 {
    public int reverseInteger(int number) {
        String s = Integer.toString(number);
        StringBuilder sb = new StringBuilder(s);
        StringBuilder r = sb.reverse();
        return Integer.parseInt(r.toString());
    }

    public static void main(String[] args) {
        System.out.println(new Solution37().reverseInteger(900));
    }
}
