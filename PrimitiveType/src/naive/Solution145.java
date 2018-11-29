package naive;

/**
 * Convert a lowercase character to uppercase.
 * Copyright (c) 2018
 *
 * @Version: Since 1.0.0
 * @Author: Atlantis
 * @Date: 2018/11/29 11:33
 */
public class Solution145 {

    public char lowercaseToUppercase(char character) {
        int u = (int) character - 32;
        return (char) u;
    }

    public static void main(String[] args) {
        System.out.println(new Solution145().lowercaseToUppercase('a'));
    }
}
