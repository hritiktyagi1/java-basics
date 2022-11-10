package Recursion;

public class ReverseStarPattern {
    static void print(int n){
        if(n==0){
            return;
        }
        System.out.print("*");
        print(n-1);

    }
    static void pattern(int i,int j){
        if(i==0){
            return;
        }
        print(j);
        System.out.println();
        pattern(i-1,j-1);

    }
    public static void main(String[] args) {
        pattern(5,5);

    }

}
