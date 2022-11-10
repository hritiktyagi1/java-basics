package Recursion;

public class TriangleStarPattern {
    static void print(int n){
        if(n==0){
            return;
        }
        System.out.print(" ");
        print(n-1);

    }
    static void pattern(int i,int j){
        if(i==0){
            return;
        }
        print(i-1);
        printStar((2*j)-1);
        System.out.println();
        pattern(i-1,j+1);

    }
    static void printStar(int n)
    {
        if(n==0){
            return;
        }
        System.out.print("*");
        printStar(n-1);
    }
    public static void main(String[] args) {
        pattern(5,1);

    }

}
