package cz.spsmb.hercik.gitTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class MathUtilsTest {
    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3})
    void secondPowerTest(int number) {
        double expected = Math.pow(number, 2);
        double result = MathUtils.secondPower(number);
        Assertions.assertEquals(expected, result);
    }
}