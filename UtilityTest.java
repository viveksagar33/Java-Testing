

import java.util.Arrays;

public class UtilityTest {

    public static void main(String[] args) {

        // MathUtils Tests
        System.out.println("Power(2, 5): " + MathUtils.power(2, 5));
        System.out.println("Factorial(5): " + MathUtils.factorial(5));
        System.out.println("IsPrime(17): " + MathUtils.isPrime(17));
        System.out.println("GCD(48, 18): " + MathUtils.gcd(48, 18));

        // StringUtils Tests
        String str = "programming";
        System.out.println("\nReverse: " + StringUtils.reverse(str));
        System.out.println("Is Palindrome (madam): " + StringUtils.isPalindrome("madam"));
        System.out.println("Vowel Count: " + StringUtils.countVowels(str));
        System.out.println("Remove Duplicates: " + StringUtils.removeDuplicates(str));

        // ArrayUtils Tests
        int[] arr = {5, 2, 9, 1, 3};
        System.out.println("\nSorted Array: " + Arrays.toString(ArrayUtils.sort(arr)));
        System.out.println("Search 9 Index: " + ArrayUtils.search(arr, 9));
        System.out.println("Max Value: " + ArrayUtils.findMax(arr));
        System.out.println("Min Value: " + ArrayUtils.findMin(arr));
        System.out.println("Reversed Array: " + Arrays.toString(ArrayUtils.reverseArray(arr)));
    }
}
