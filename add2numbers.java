//Add Two Numbers Question - Leetcode
import java.util.*;
import java.io.*;
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
class addTwoNumbers{
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int total = 0;
        ListNode answer = new ListNode(0);    
        ListNode itter = answer;
        
        while((l1 != null)||(l2 != null)){
            total = (itter.val + l1.val + l2.val);
            itter.val = total % 10;
            //If there is a carry over, create a new node with the carry in it.
            if(total > 9){
                itter.next = new ListNode((total - itter.val)/10);
            }
                
            //If only l2 has a next node, create a new node for l1
            if((l1.next == null) && (l2.next != null)){
                l1.next = new ListNode(0);
                if(itter.next == null){
                    itter.next = new ListNode(0);
                }
            }
            if((l1.next != null) && (l2.next == null)){
                l2.next = new ListNode(0);
                    if(itter.next == null){
                        itter.next = new ListNode(0);
                    }
                }
                if((l1.next != null)&&(l2.next != null)){
                    if(itter.next == null){
                        itter.next = new ListNode(0);
                    }
                }
                l1 = l1.next;
                l2 = l2.next;
                itter = itter.next;
         }
    return answer;
    }
}
    