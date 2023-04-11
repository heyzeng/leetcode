package code;

/**
 * Author:Jude
 * Date:2023-04-10 下午4:27
 */

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class Lc_0021_MergeTwoLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        ListNode preHead = new ListNode(-1);
        ListNode prev = preHead;

        while (l1 != null && l2 != null) {
              if (l1.val <= l2.val) {
                    prev.next = l1;
                    l1 = l1.next;
              } else {
                    prev.next = l2;
                    l2 = l2.next;
              }
              prev = prev.next;
        }
        prev.next = l1 == null ? l2 : l1;
        return preHead.next;
    }
}
