package Recursion;

import static java.lang.Math.pow;

public class NArmstrongNumber {
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
            else{
                flag=false;
            }

            return;
        }
        sum+=pow(temp%10,count1);
        checkArmstrong(temp/10,sum,temp1);



    }
    static void print(int num){
        if(num==10000){
            return;
        }
        countDigit(num,0,num);
        if(flag==true) {
            System.out.println(num);
        }
        print(num+1);

    }


    public static void main(String[] args) {
        int num=1;
        print(num);


        }


    }
/*
---------------------------------------------
1
2 3
4 5 6
7 8 9 10
--------------------------------------------------
a
a b
a b c
a b c d
a b c d e
------------------------------------------------------
   1
  2 3
 4 5 6
7 8 9 10
-----------------------------------------
n armstrong number
-----------------------------
sum of digit
-------------------------
count digit
-------------------------
prime number
--------------------------



 */


