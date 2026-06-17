public class FinalPractice {
    public static void main(String[] args) {
        ListNode list = new ListNode(4, new ListNode(8, new ListNode(15, new ListNode(16, new ListNode(23, new ListNode(42, new ListNode(11, new ListNode(29, new ListNode(34)))))))));
        System.out.print(oddIndexSum(list));
        // YOU MUST ALSO MAKE THOROUGH TESTS FOR EVERY METHOD 
    }

    /**
     * Return the sum of the values at odd indexes in a linked list.
     * 
     * Assumes head is at index 0.
     * 
     * If passed a null head, returns 0.
     * 
     * @param head the head of the linked list
     * @return the sum of the values at odd indexes
     */
    public static int oddIndexSum(ListNode head) {
        if(head == null) return 0;
        ListNode current = head;
        int sum = 0; int count = 0;

        while(current != null)
        {
            if(count % 2 != 0)sum += current.data;
            current = current.next;
            count++;
        }
        return sum;
    }

    // TODO: implement the rest of the study guide AND MAKE GOOD UNIT TESTS
}
