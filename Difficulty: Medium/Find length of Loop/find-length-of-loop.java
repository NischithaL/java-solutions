/*
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}
*/

class Solution {
    public int lengthOfLoop(Node head) {
        // code here
         Node slow = head, fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                int count = 1;
                fast = fast.next;
                while (slow != fast) {
                    fast = fast.next;
                    count++;
                }
                return count;
            }
        }

        return 0;
    }
}