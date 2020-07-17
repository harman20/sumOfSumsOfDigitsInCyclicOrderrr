import java.util.*;
public class sumOfSumsOfDigitsInCyclicOrderrr{
    public static void main(String args[])
    {
        int num1=582109;
         System.out.println("Given number = " + num1);
        int sum=0;
        int sum1=0;
        while(num1!=0){
            sum=sum+(num1 % 10);
            sum1=sum1+sum;
            num1=num1/10;
        }
       
        System.out.println("Cyclic sum = " + sum1);
    }
}