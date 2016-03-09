/**
 * Created by alexey on 23.02.16.
 */

/**
 * Contains functions for some simple operations with integer numbers.
 */
public class IntegerProcessor {

    /**
     * Reverts decimal form of provided value.
     * revert(123) == 321.
     * revert(-123) == -321.
     * revert(121) == 121.
     *
     * If reverted value is greater than Integer.MAX_VALUE or less than Integer.MIN_VALUE, throws NumberFormatException.
     *
     * @param value value to be reverted.
     * @return reverted form of value.
     */
    public static int revert(final int value) throws NumberFormatException {
        if (value >= 0) {
            return Integer.parseInt(new StringBuffer(Integer.toString(value)).reverse().toString());
        }

        return -1 * Integer.parseInt(new StringBuffer(Integer.toString(Math.abs(value))).reverse().toString());
    }

    /**
     * Calculates count of decimal digits for provided value.
     * countOfDigits(0) == 1.
     * countOfDigits(123) == 3.
     * countOfDigits(-123) == 3.
     *
     * @param value value to calculate count of digits for.
     * @return count of decimal digits in value.
     */
    public static int countOfDigits(final int value) {
        String s = Integer.toString(value);

        return value >= 0 ? s.length() : s.length() - 1;
    }
}
