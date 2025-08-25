public class Patterncompany {
    public static void main(String[] args){
        int n =5;
        for(int j = 0; j<n/2;++j){
            System.out.print(" * ");
            for(int k=0;k<n+2;++k){
                System.out.print("   ");

            }
            for(int m = 1; m<=j+1; ++m){
                System.out.print(" * ");
            }
            System.out.println();
        }
        for(int i = 0; i<n+3; ++i){
            System.out.print(" * ");
        }
        for(int i =0; i<n/2 +1; ++i){
            System.out.print(" * ");
        }
        System.out.println();
        for(int j = n/2; j>0; --j){
            System.out.print(" * ");
            for(int k = 0; k< n+2; ++k){
                System.out.print("   ");
            }
            for(int m =1; m< j+1; ++m){
                System.out.print(" * ");

            }
            System.out.println();
        }
        
    }
    
}