import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

public class FinalPracticeTest {
    @Test
    void testOddIndexSum_oddLengthList() {
        ListNode list = new ListNode(4, new ListNode(8, new ListNode(15, new ListNode(16, new ListNode(23, new ListNode(42, new ListNode(11, new ListNode(29, new ListNode(34)))))))));
        int actual = FinalPractice.oddIndexSum(list);
        assertEquals(95, actual);
    }

    @Test
    void testOddIndexSum_evenLengthList() {
        ListNode list = new ListNode(4, new ListNode(8, new ListNode(15, new ListNode(16, new ListNode(23, new ListNode(42, new ListNode(11, new ListNode(29))))))));
        int actual = FinalPractice.oddIndexSum(list);
        assertEquals(95, actual);
    }

    @Test
    void testOddIndexSum_nullSecondValue() {
        ListNode list = new ListNode(4, null);
        int actual = FinalPractice.oddIndexSum(list);
        assertEquals(0, actual);
    }

    @Test
    void testOddIndexSum_nullHead() {
        ListNode list = null;
        int actual = FinalPractice.oddIndexSum(list);
        assertEquals(0, actual);
    }

    @Test
    void largestOfLastThree_nullHead() {
        ListNode list = null;
        int actual = FinalPractice.largestOfLastThree(list);
        assertEquals(Integer.MIN_VALUE, actual);
    }

    @Test
    void largestOfLastThree_lastValue() {
        ListNode list = new ListNode(4, new ListNode(8, new ListNode(15, new ListNode(16, new ListNode(23, new ListNode(42, new ListNode(11, new ListNode(29, new ListNode(34)))))))));
        int actual = FinalPractice.largestOfLastThree(list);
        assertEquals(34, actual);
    }

    @Test
    void leafEvenSum_lastValue() {
        ListNode list = new ListNode(4, new ListNode(8, new ListNode(15, new ListNode(16, new ListNode(23, new ListNode(42, new ListNode(11, new ListNode(29, new ListNode(34)))))))));
        int actual = FinalPractice.leafEvenSum(list);
        assertEquals(34, actual);
    }
}
