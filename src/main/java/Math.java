public class Math {
    public static int fac(int n){
        if(n<0){
            throw new ArithmeticException(
                    "Argument must be non negative.");
        } else{
            int out = 1;
            /*//
            for(int i=1; i<=n; i++){
                out *= i;
            }
            //*/
            int i=1;
            while(i<=n){
                out *= i;
                i++;
            }
            return out;
        }
    }
}
