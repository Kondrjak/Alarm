public class Math {
    public static int fac(int n){
        if(n<0){
            throw new ArithmeticException(
                    "Argument must be non negative.");
        } else if(n==0){
            return 1;
        } else{
            int out = 1;
            for(int i=1; i<=n){
                out *= i;
            }
            return out;
        }
    }
}
