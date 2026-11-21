public class methodArmstrong{
    public static void main(String[]args){
        System.out.println(armstrongNumber(143));
        System.out.println(armstrongNumber(153));

    }
    static String armstrongNumber(int n){
        int count=0;
        int original=n;
        int temp=n;
        

        while(temp>0){
            temp=temp/10;
            count++;

        }
        temp=original;
        int sum=0;
        while(temp>0){
            int digit=temp%10;
            sum=sum+(int)Math.pow(digit,count);
            temp=temp/10;

        }
        if(original==sum){
            return "armstrong";
        }
        else{
            return "not armstrong";
        }

    }
}
