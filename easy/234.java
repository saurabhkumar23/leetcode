class Solution {
    
    // pep...
   public static ListNode midNode(ListNode head) {
       ListNode slow = head;
       ListNode fast = head;
       while(fast.next!=null && fast.next.next!=null){
           fast = fast.next.next;
           slow = slow.next;
       }
       return slow;
   }
   
   public static ListNode reverse(ListNode head) {
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

   public boolean isPalindrome(ListNode head) {
       if(head == null || head.next == null){
           return true;
       }
       ListNode midnode = midNode(head);
       ListNode shead = midnode.next;
       shead = reverse(shead);
       ListNode p1 = head;
       ListNode p2 = shead;
       boolean isPal = true;
       while(p2 != null){
           if(p1.val != p2.val){
               isPal = false;
           }
           p1 = p1.next;
           p2 = p2.next;
       }
       shead = reverse(shead);
       return isPal;
   }
}public class 234 {
    
}
