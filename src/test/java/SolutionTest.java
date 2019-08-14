import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class SolutionTest {
    private String input1;
    private String[] input2;
    private List<Integer> expected;
    private Solution soln = new Solution1();

    public SolutionTest(String in1, String[] in2, List<Integer> out) {
        input1 = in1;
        input2 = in2;
        expected = out;
    }

    @Parameterized.Parameters
    public static Collection parameters() {
        return Arrays.asList(new Object[][]{
                {"barfoothefoobarman", new String[]{"foo", "bar"}, Arrays.asList(0, 9)},
                {"wordgoodstudentgoodword", new String[]{"word", "student"}, Collections.emptyList()}
        });
    }

    @Test
    public void testSubstring() {
        assertEquals(expected, soln.findSubstring(input1, input2));
    }
}