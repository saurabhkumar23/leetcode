class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        // pep..
        ListNode dh = new ListNode(-1);
        ListNode tail = dh;
        ListNode c1 = l1;
        ListNode c2 = l2;
        while(c1!=null && c2!=null){
            if(c1.val < c2.val){
                tail.next = c1;
                c1 = c1.next;
                tail = tail.next;
            }
            else{
                tail.next = c2;
                c2 = c2.next;
                tail = tail.next;
            }
        }
        if(c1!=null){
            tail.next = c1;
        }
        if(c2!=null){
            tail.next = c2;
        }
        return dh.next;
    }
}public class 21 {
    
}
