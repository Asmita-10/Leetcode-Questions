/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        HashSet<ListNode> set=new HashSet<>();
        ListNode cura=headA;
        ListNode curb=headB;
        while(cura!=null){
            set.add(cura);
            cura=cura.next;
        }
        while(curb!=null){
            if(set.contains(curb)){
                return curb;
            }
             curb=curb.next;
        }
        return null;
    }
}