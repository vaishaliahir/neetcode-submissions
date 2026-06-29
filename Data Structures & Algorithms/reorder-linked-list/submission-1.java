/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public void reorderList(ListNode head) 
    {
        if(head==null || head.next==null)
        {
            return;
        }    
        // find mid point
        ListNode p1=head;
        ListNode p2=head;

        while(p2.next!=null && p2.next.next!=null)
        {
            p1=p1.next;
            p2=p2.next.next;
        }
        //reverse list
        ListNode premiddle=p1;
        ListNode precurrent=p1.next;

        while(precurrent.next!=null)
        {
            ListNode current=precurrent.next;
            precurrent.next=current.next;
            current.next=premiddle.next;
            premiddle.next=current;
        }
        p1=head;
        p2=premiddle.next;

        while(p1!=premiddle)
        {
            premiddle.next=p2.next;
            p2.next=p1.next;
            p1.next=p2;
            p1=p2.next;
            p2=premiddle.next;
        }
    }
}
