public class DiamondPattern {

    public static void diamondPattern(int n, int m){
        //first half
        for(int i=0; i<=n-1; i++){
           for(int j=1; j<=n-i; j++){
            System.out.print(" ");
           }
           for(int k=1; k<=2*i+1; k++){
             System.out.print("*");
           }
           System.out.println();
        }

         //second half
        for(int i=n; i>=0; i--){
            for(int j=1; j<=n-i; j++){
            System.out.print(" ");
           }
           for(int k=1; k<=2*i+1; k++){
             System.out.print("*");
           }
           System.out.println();
        }
    }
    public static void main(String[] args) {
        diamondPattern(4,7);
    }
}
