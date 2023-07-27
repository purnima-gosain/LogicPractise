import java.util.*;

public class LongestPrefix {
    public String commonPrefix(String[] arr){
        int n = arr.length;
        String result = arr[0];

        for(int i =1; i<n; i++){
            while(arr[i].indexOf(result) != 0){
                result= result.substring(0, result.length()-1);

                if(result.isEmpty()){
                 
                    return "No common prefix";
                }
            }
        }
        return result;
    }
    public static void main(String[] args){
        LongestPrefix prefix = new LongestPrefix();
        String[] input =  {"flower","flow","flight"};
        System.out.println(  prefix.commonPrefix(input) );
    }
}
