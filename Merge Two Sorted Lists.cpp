//leetcode

// https://leetcode.com/problems/merge-two-sorted-lists/submissions/



ListNode* mergeTwoLists(ListNode* l1, ListNode* l2) {
        ListNode* l3=new ListNode(0);
        ListNode* head=l3;
        while(l1 && l2){
            
		if(l1->val < l2->val)
		{
			l3->next=new ListNode(l1->val);
			l1=l1->next;
		}
		else
		{
            l3->next=new ListNode(l2->val);
			l2=l2->next;	
		}
            l3=l3->next;
	}
//l2 hs elements..
        while(l1){
            l3->next=new ListNode(l1->val);
			l1=l1->next;
            l3=l3->next;
        }
//l2 hs elements..
         while(l2){
            l3->next=new ListNode(l2->val);
			l2=l2->next;
             l3=l3->next;
        }
        return head->next;
    }
