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
    void largestOfLastThree_lessThanThreeValues() {
        ListNode list = new ListNode(4, new ListNode(8));
        int actual = FinalPractice.largestOfLastThree(list);
        assertEquals(8, actual);
    }

    @Test
    void largestOfLastThree_onlyOneValue() {
        ListNode list = new ListNode(4);
        int actual = FinalPractice.largestOfLastThree(list);
        assertEquals(4, actual);
    }

    @Test
    void leafEvenSum_bigTree() {
        TreeNode tree = new TreeNode(12, new TreeNode(6, new TreeNode(4, new TreeNode(3), null), new TreeNode(8)), new TreeNode(18, new TreeNode(16), new TreeNode(20, null, new TreeNode(22))));
        int actual = FinalPractice.leafEvenSum(tree);
        assertEquals(46, actual);
    }

    @Test
    void leafEvenSum_onlyRoot() {
        TreeNode tree = new TreeNode(12);
        int actual = FinalPractice.leafEvenSum(tree);
        assertEquals(12, actual);
    }

    @Test
    void leafEvenSum_nullTree() {
        TreeNode tree = null;
        int actual = FinalPractice.leafEvenSum(tree);
        assertEquals(0, actual);
    }

    @Test
    void leafEvenSum_noEvenValues() {
        TreeNode tree = new TreeNode(12, new TreeNode(6, new TreeNode(4, new TreeNode(3), null), new TreeNode(7)), new TreeNode(18, new TreeNode(15), new TreeNode(20, null, new TreeNode(21))));
        int actual = FinalPractice.leafEvenSum(tree);
        assertEquals(0, actual);
    }
}
