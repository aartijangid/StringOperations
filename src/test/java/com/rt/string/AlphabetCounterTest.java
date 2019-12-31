package com.rt.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlphabetCounterTest {

    @Test
    public void givenAStringShouldReturnCountOfEachAlphabet() {
        String input = "ourFirstTest";
        AlphabetCounter alphabetCounter = new AlphabetCounter();
        int[] actualResult;
        actualResult = alphabetCounter.count(input);
        int[] expectedResult = {1, 2};
        assert(expectedResult.equals(actualResult));
    }
}