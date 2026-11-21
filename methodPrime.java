public class methodPrime{
    public static void main(String[]args){
        String result=primeNumber(6);
        System.out.println(result);

    }
    static String primeNumber(int n){
        int i=1;
        int count=0;
        while(i<=n){
            if(n%i==0){
                count++;
            }
            i++;
        }
        if(count==2){
            return "prime";
        }
        else{
            return "not a prime";
        }
            
        
    }
}
