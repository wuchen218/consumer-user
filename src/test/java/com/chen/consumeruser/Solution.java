package com.chen.consumeruser;

/**
 * Create by wuchenchen  on 2021/1/11
 */

public class Solution {
    public ListNode ReverseList(ListNode head) {
        if (head == null || head.next==null) return head;

        ListNode pre = null;
        ListNode post = head;
        while(head!=null)
        {
            //注意此处的顺序，刚好对角线上变量对应
            post = head.next;
            head.next = pre;
            pre = head;
            head = post;
        }

        return pre;
    }
}