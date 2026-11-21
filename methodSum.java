public class methodsSum{
    public static void main(String[]args){
        System.out.println(sumOfDigits(123));

    }
    static int sumOfDigits(int n){
        int sum=0;
        while(n>0){
            int digit=n%10;
            sum=sum+digit;
            n=n/10;
        }
        return sum;
    }
}
