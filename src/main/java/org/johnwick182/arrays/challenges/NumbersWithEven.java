package org.johnwick182.arrays.challenges;

//https://leetcode.com/explore/learn/card/fun-with-arrays/521/introduction/3237/

/*
Example 1:
    Input: nums = [12,345,2,6,7896]
    Output: 2
    Explanation:
        12 contains 2 digits (even number of digits).
        345 contains 3 digits (odd number of digits).
        2 contains 1 digit (odd number of digits).
        6 contains 1 digit (odd number of digits).
        7896 contains 4 digits (even number of digits).
        Therefore only 12 and 7896 contain an even number of digits.
 */

public class NumbersWithEven {
    public int findNumbers(int[] nums) {
        int parDigits = 0;

        for (int i = 0; i < nums.length; i++) {
            int digits = (int) (Math.log10(nums[i]) + 1);
            if (digits % 2 == 0) {
                parDigits++;
            }
        }
        return parDigits;
    }
}
