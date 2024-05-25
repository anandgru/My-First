class Solution {
    ListNode reverse(ListNode head){
        ListNode c=head;
        ListNode n=head;
        ListNode p=null;
        while(c!=null){
            n=n.next;
            c.next=p;
            p=c;
            c=n;
        }
        return p;
    }
    public boolean isPalindrome(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
         while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
         }
         ListNode t=reverse(slow);
         ListNode t1=head;
         while(t!=null){
            if(t1.val!=t.val){
                 return false;
            }
            t=t.next;
            t1=t1.next;
         }
     return true;   
    }
}
