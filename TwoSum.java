

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class TwoSum{

    // public int[] twoSum(int[] nums, int target){
        
    // }
        int [] number = {2,7,11,15};
        int target = 9;
        List<Integer> result = new ArrayList<Integer>();


    void findNumber(){
        for(int i = 0; i < number.length; i ++){
            int first = (int)Array.get(number, i);
            
            int second = (int)Array.get(number, i+1);
            if(first + second == target){
                result.add(i);
                result.add((i+1));
                System.out.println(result);
                // System.out.println(i+ " " +(i+1));
                break;
            }
        }
       
    }
    public static void main(String args[]){
        TwoSum soln = new TwoSum();
        soln.findNumber();

    }
}