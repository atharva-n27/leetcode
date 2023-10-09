/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    ListNode* mergeTwoLists(ListNode* list1, ListNode* list2) {

        if(list1 == nullptr){ // Checks to see if at least one list is null. If so, return the other list.
            return list2;
        }
        if(list2 == nullptr ){
            return list1;
        }

        ListNode* newList = new ListNode(); // Creates an initial node with value 0, points to it. Head points to the same. 
        ListNode* head = newList; 
        bool isFirstIteration = true;
        
        while (list1 != nullptr && list2 != nullptr){ // While there is something within both lists, do.
            if(list1->val <= list2->val){
                if(isFirstIteration){ // On the first iteration, things are slightly different.
                    newList->val = list1->val;
                    list1 = list1->next;
                }
                else {
                    newList->next = new ListNode();
                    newList = newList->next;
                    newList->val = list1->val;
                    list1 = list1->next;                                        
                }
            }
            else {
                if(isFirstIteration){
                    newList->val = list2->val;
                    list2 = list2->next;
                }
                else {
                    newList->next = new ListNode();
                    newList = newList->next;
                    newList->val = list2->val;
                    list2 = list2->next;                                        
                }                
            }
            isFirstIteration = false;
        }

        if(list1 == nullptr){ // Once control reaches here, at least one list is null. If both are null, then every condition is
            while(list2 != nullptr){ // skipped, and head is returned.
                newList->next = new ListNode();
                newList = newList->next;
                newList->val = list2->val;
                list2 = list2->next;   
            }
        }
        else {
            while(list1 != nullptr){
                newList->next = new ListNode();
                newList = newList->next;
                newList->val = list1->val;
                list1 = list1->next;   
            }            
        }
        return head;
    }
};