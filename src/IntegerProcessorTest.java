import static org.junit.Assert.*;

/**
 * Created by alexey on 23.02.16.
 */
public class IntegerProcessorTest {

    int longPositiveInt = 123456789;
    int longPositiveReverted = 987654321;
    int countOfDigitsInLongPositive = 9;

    int shortPositiveInt = 1;
    int shortPositiveReverted = 1;
    int countOfDigitsInShortPositive = 1;

    int zero = 0;

    int longNegativeInt = -123456789;
    int longNegativeReverted = -987654321;
    int countOfDigitsInLongNegative = 9;

    int shortNegativeInt = -1;
    int shortNegativeReverted = -1;
    int countOfDigitsInShortNegative = 1;

    @org.junit.Test
    public void testRevert() throws Exception {
        assertEquals(longPositiveReverted, IntegerProcessor.revert(longPositiveInt));
        assertEquals(shortPositiveReverted, IntegerProcessor.revert(shortPositiveInt));
        assertEquals(zero, IntegerProcessor.revert(zero));
        assertEquals(longNegativeReverted, IntegerProcessor.revert(longNegativeInt));
        assertEquals(shortNegativeReverted, IntegerProcessor.revert(shortNegativeInt));
    }

    @org.junit.Test
    public void testCountOfDigits() throws Exception {
        assertEquals(countOfDigitsInLongPositive, IntegerProcessor.countOfDigits(longPositiveInt));
        assertEquals(countOfDigitsInShortPositive, IntegerProcessor.countOfDigits(shortPositiveInt));
        assertEquals(1, IntegerProcessor.countOfDigits(zero));
        assertEquals(countOfDigitsInLongNegative, IntegerProcessor.countOfDigits(longNegativeInt));
        assertEquals(countOfDigitsInShortNegative, IntegerProcessor.countOfDigits(shortNegativeInt));
    }
}