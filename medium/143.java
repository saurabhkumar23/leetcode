class Solution {
    
    public ListNode reverse(ListNode head) {
        // pep...
        ListNode curr = head;
        ListNode prev = null;
        while(curr != null){
            ListNode forw = curr.next;
            curr.next = prev;
            prev = curr;
            curr = forw;
        }
        return prev;
    }
    
     public ListNode midNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next!=null && fast.next.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
    
    public void reorderList(ListNode head) {
        if(head==null || head.next==null){
            return;
        }
        ListNode midnode = midNode(head);
        ListNode sh = midnode.next;
        midnode.next = null;
        sh = reverse(sh);
        ListNode c1 = head;
        ListNode c2 = sh;
        while(c2 != null){
            ListNode f1 = c1.next;
            ListNode f2 = c2.next;
            c1.next = c2;
            c2.next = f1;
            c1 = f1;
            c2 = f2;
        }
    }
}