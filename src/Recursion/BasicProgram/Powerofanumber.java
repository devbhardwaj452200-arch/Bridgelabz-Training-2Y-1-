package Recursion.BasicProgram;
    import java.util.Scanner;
    public class Powerofanumber {
        public static int fact(int p,int q){
            if(q==0){
                return 1;
            }
            int small=fact(p,q-1);
            return p*small;
        }

        public static void main(String[] args){
            Scanner sc= new Scanner(System.in);
            int p=sc.nextInt();
            int q=sc.nextInt();
            System.out.print(fact(p,q));
        }
    }
