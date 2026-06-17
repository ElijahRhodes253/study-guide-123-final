import java.util.Map;
import java.util.TreeMap;

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

    /*
    Given a reference to the head of a linked list, return the 
    largest of only the last 3 values of the list.
    
    Example:
    Linked List:
    7 -> 3 -> 19 -> 21 -> 14 -> 33 -> 8 -> 26 -> 11 -> 5
    Expected Answer: 26
    
    Last 3 values are: 26  11  5, the largest of which is 26
    */
    public static int largestOfLastThree(ListNode head)
    {
        int hNum = Integer.MIN_VALUE;
        ListNode current = head;

        for(int i = 0; i < listLength(head)-3; i++)
        {
            current = current.next;
        }
        while(current != null)
        {
            if(current.data > hNum) hNum = current.data;
            current = current.next;
        }
        return hNum;
    }

    /*
    Given a reference to the root of a tree, return the sum of 
    the leaf nodes with even values in the tree. Do not include 
    any odd or branch nodes.

    Example:
    Tree:
               12
             /    \
            6      18
           / \    /  \
          4   8  16   20
         /               \
        3                22

    Expected Answer: 46

    The leaf nodes are 3   8   16   22, and the even ones are 8   16   22.
    The sum of the even leaf nodes is 8+16+22 = 46
    */
    public static int leafEvenSum(TreeNode root)
    {
        if(root == null) return 0;
        int val = 0;
        if(root.left == null && root.right == null)
        {
            if(root.data % 2 == 0) val = root.data;
        }

        return leafEvenSum(root.left) + leafEvenSum(root.right) + val;
    }

    /*
    Given a reference to the root of a tree, return the sum of the 
    branch nodes with odd values in the tree. Do not include any 
    even or leaf nodes.

    Example:
    Tree:
               15
             /    \
            9      4
           / \    /  \
          8   11 21   30
         / \       \
        2   6       23

    Expected Answer: 45
    
    The branch nodes are 15  9  4  8  21, and the odd ones are 15  9   21
    The sum of the odd branch nodes is 15+9+21=45
    */
    public static int branchOddSums(TreeNode root)
    {
        if(root == null) return 0;
        int val = 0;
        if(!(root.left == null && root.right == null))
        {
            if(root.data % 2 != 0) val = root.data;
        }
        return branchOddSums(root.left) + branchOddSums(root.right) + val;
    }

    /*
    Given a reference to a head node in a linked list of integers, 
    return a Map<Integer, Integer> containing each value along with 
    the number of times it shows up.
    
    Example:
    Linked List:
    4 -> 34 -> 4 -> 16 -> 4 -> 16 -> 29 -> 8 -> 8

    Expected Return Map (order is unimportant): 
    { 
      4: 3,
      8: 2,
      16: 2,
      29: 1,
      34: 1
    } 

    Explanation
    4 shows up three times
    8 shows up two times
    16 shows up two times
    29 shows up one time
    34 shows up one time
    */
    public static Map<Integer, Integer> listValueCounter(ListNode head)
    {
        Map<Integer, Integer> tMap = new TreeMap<>();
        ListNode current = head;

        while(current != null)
        {
            if(tMap.containsKey(current.data)) tMap.put(current.data, tMap.get(current.data) + 1);
            else tMap.put(current.data, 1);
            current = current.next;
        }
        return tMap;
    }

    //Extra method for other method i guess
    public static int listLength(ListNode head)
    {
        int count = 0;
        ListNode current = head;

        while(current != null)
        {
            current = current.next;
            count++;
        }

        return count;
    }
}
