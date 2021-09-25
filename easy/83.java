class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        // pep..
        ListNode curr = head;
        while(curr != null){
            ListNode forw = curr.next;
            while(forw!=null && (curr.val==forw.val)){
                forw = forw.next;
            }
            curr.next = forw;
            curr = curr.next;
        }
        return head;
    }
}