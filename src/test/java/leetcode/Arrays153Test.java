package leetcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Arrays153Test {

    private static Stream<Arguments> getData() {
        return Stream.of(
                Arguments.of(new int[] {4,5,6,7,0,1,2}, 0),
                Arguments.of(new int[] {3,4,5,1,2}, 1),
                Arguments.of(new int[] {11,13,15,17}, 11)
        );
    }

    @ParameterizedTest
    @MethodSource("getData")
    void getMinTest(int[] input, int expected) {
        assertEquals(Arrays153.findMin(input), expected);
    }
}
