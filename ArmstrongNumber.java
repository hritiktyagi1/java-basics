package Recursion;

import static java.lang.Math.pow;

public class ArmstrongNumber {
    static int count1;
    static boolean flag;
    static void countDigit(int num,int count,int temp){
        if(num==0){
            count1=count;
            return;
        }
        countDigit(num/10,count+1,temp);
        checkArmstrong(temp,0,temp);



    }
    static void checkArmstrong(int temp,int sum,int temp1){
        if(temp==0){
            if(temp1==sum){
                flag=true;
            }

            return;
        }
        sum+=pow(temp%10,count1);
        checkArmstrong(temp/10,sum,temp1);



    }
    public static void main(String[] args) {
        int num=8208;
        countDigit(num,0,num);
        if(flag==true){
            System.out.println("Armstrong Number...");
        }
        else{
            System.out.println("not a armstrong number...");
        }

    }
}