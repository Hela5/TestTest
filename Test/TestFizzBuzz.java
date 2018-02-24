import FuquensFizzBuzz.FizzBuzz;
import org.junit.jupiter.api.Test;

import static junit.framework.Assert.assertEquals;


public class TestFizzBuzz {
    @Test
    void whenFizzBuzzIsPassedANumberItReturnsThatNumber() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("1", fizzBuzz.fizz(1));
    }

    @Test
    void whenFizzBuzzIsPassedAMultipleOfThree
}
