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

    // int temp = 0;
    // public void newMethod(){
    //     ArrayList<Integer> list1 = new ArrayList<Integer>();
    // list1.add(0);
    // list1.add(1);
    // list1.add(2);

    // ArrayList<Integer> list2 = new ArrayList<Integer>();
    // list2.add(0);
    // list2.add(3);
    // list2.add(4);

    // list1.addAll(list2);
    // // ArrayList<Integer> mergeList = new ArrayList<Integer>(list1);
    // // mergeList.addAll( list2);
    // System.out.println("Old list"+list1);

    // for(int i = 0;i < list1.size();i++){
    //     System.out.println("hhhhhh");
    //     for(int j =i+1;j< list1.size(); j++){
    //         System.out.println("llllll");
    //         if(list1.get(i) > list1.get(j)){
    //             temp = list1.get(i);
    //             list1.add(i,list1.get(j));
    //             list1.add(j,temp);
    //         }
    //     }
    // }
    
    // }
    
   public static void main(String[] args){
    SortList abc = new SortList();
    ListNode l1 = new ListNode(10);
    l1.next = new ListNode(11);

    ListNode l2 = new ListNode(5);
    l2.next = new ListNode(6);
    
    
   }

}
