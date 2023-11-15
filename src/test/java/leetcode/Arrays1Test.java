package leetcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Arrays1Test {
    private static Stream<Arguments> getData() {
        return Stream.of(
                Arguments.of(new int[] {2,7,11,15}, 9, new int[] {0,1}),
                Arguments.of(new int[] {3,2,4}, 6, new int[] {1,2}),
                Arguments.of(new int[] {3,3}, 6, new int[] {0,1})
        );
    }

    @ParameterizedTest
    @MethodSource("getData")
    void getMinTest(int[] input, int target, int[] expected) {
        var result = Arrays1.twoSum(input, target);
        assertEquals(result.length, expected.length);
        for (var i = 0; i < expected.length; i++) {
            assertEquals(result[i], expected[i]);
        }
    }
}
