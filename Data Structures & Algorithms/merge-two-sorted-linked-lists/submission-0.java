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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2)
    {
        ListNode ls=new ListNode(Integer.MIN_VALUE);
        ListNode headNode=ls;

        while(list1!=null && list2!=null)
        {
            if(list1.val<=list2.val)
            {
                ls.next=list1;
                list1=list1.next;
                
            }   
            else
            {
                ls.next=list2;
                list2=list2.next;
            } 
            ls=ls.next;
        }
            if(list1==null)
            {
                ls.next=list2;
            }
            else if(list2 == null)
            {
                ls.next=list1;
            }
            return headNode.next;
    }
}