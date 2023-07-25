


 public class Palindrome {
    int remainder;
    int sum = 0;
    int temp;
    // int n = 121;
     

    public boolean isPalindrome(int x){
        temp = x;
        while(x>0){
            remainder = x% 10;
            sum = (sum*10) + remainder;
            x = x/10;
        }
        if(temp == sum){    
             System.out.println("True");
             return true;
        }else{
            System.out.println("False");
            return false;
        }
    }
    public static void main(String args[]){
        Palindrome soln = new Palindrome();
        soln.isPalindrome(121);
    }

//    public static void main(String[] args){
//        Palindrome soln = new Palindrome();
//        soln.isPalindrome(121);
//    }
}
