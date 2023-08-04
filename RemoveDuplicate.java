import java.util.*;

public class RemoveDuplicate {

    public int removeSameNum(int[] nums){
        int count = 0;
        for(int i = 0; i< nums.length;i++){
            if(i<nums.length -1 && nums[i] == nums[i+1]){
              continue; 
            }
            nums[count] = nums[i];
            count++;
        }
        //  System.out.println(count);
        //  Arrays.sort(nums);
          System.out.println(Arrays.toString(nums));
        return count;
       
    }

    public static void main(String[] args){
        RemoveDuplicate obs = new RemoveDuplicate();
        int[] input = {1,1,2,3,4,4};
        obs.removeSameNum(input);
    }
    
}
