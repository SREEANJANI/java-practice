public class methodPalindrome{
    public static void main(String[]args){
        System.out.println(checkPalindrome(121));

    }
    static String checkPalindrome(int n){
        int original=n;
        int reverse=0;
        while(n>0){
            int digit=n%10;
            reverse=reverse*10+digit;
            n=n/10;
        
        }
        
        if(original==reverse){
            return "palindrome";
        }
        else{
            return "not a palindrome";
        }
    }
}
