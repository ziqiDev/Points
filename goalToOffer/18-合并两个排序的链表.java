/*
输入两个单调递增的链表，输出两个链表合成后的链表，当然我们需要合成后的链表满足单调不减规则。
*/
public class Solution {
    public ListNode Merge(ListNode list1,ListNode list2) {
        if(list1 == null){
            return list2;
        }
        if(list2 ==null){
            return list1;
        }
        ListNode pre = new ListNode(-1);
        ListNode current = pre;
        while(list1 != null && list2!=null){
            if(list1.val<= list2.val){
                current.next = list1;
                list1 = list1.next;
            }else{
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }
        if(list1!=null){
            current.next = list1;
        }
        if(list2 != null){
            current.next = list2;
        }
        return pre.next;
    }
}
