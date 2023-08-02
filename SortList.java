import java.util.*;

public class SortList {
    public ListNode mergeTwoList(ListNode list1, ListNode list2){
        ListNode first ;
        ListNode second;
        if(list1 != null && list2 != null){
            if(list1.val <= list2.val){
                first = list1;
                list1 = list1.next;
            }else{
                first = list2;
                list2 = list2.next;
            }
            second = first;
            while(list1 != null && list2!=null){
                if(list1.val<=list2.val){
                    first.next = list1;
                    list1 = list1.next;
                }else{
                    first.next = list2;
                    list2 = list2.next;
                }
                first = first.next;
            }
            if( null != list1){
                first.next= list1;
            }
            if( null != list2){
                first.next= list2;
            }
            return second;
        }
        else{
            if(list2 == null){
                return list1;
            }else if(list1 == null){
                return list2;
            }else{
                return list1;
            }
        }
        
    }

   
    
   public static void main(String[] args){
    SortList abc = new SortList();
    ListNode l1 = new ListNode(10);
    l1.next = new ListNode(11);

    ListNode l2 = new ListNode(5);
    l2.next = new ListNode(6);
    
    ListNode result = abc.mergeTwoList(l1, l2);

    System.out.println("Output = "+ result.val);
   }

}
