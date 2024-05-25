class Solution {
    ListNode reverse(ListNode head){
        ListNode c=head;
        ListNode n=null;
        ListNode p=null;
        while(c!=null){
            n=c.next;
            c.next=p;
            p=c;
            c=n;
        }
        return p;
    }
    
}
