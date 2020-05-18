package com.fatorac;
import com.fatorac.CountNumbers;
import com.fatorac.DivisibleNumber;
import com.fatorac.PrimeFactorsList;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
   Scanner read = new Scanner(System.in);
   DivisibleNumber divNumber = new DivisibleNumber();
   PrimeFactorsList primeFactors = new PrimeFactorsList();
   CountNumbers countNums = new CountNumbers(primeFactors);
   
   Integer dividend = read.nextInt();
   Integer divider = new Integer(0);
   
   read.close();
   
   do{
     if(divNumber.thereIsDivisible(dividend)){
       divNumber.set(dividend); 
       divider = divNumber.get();
       
       dividend /= divider;
       
       primeFactors.add(divider);
     } else {
       break;
     }
   }while(dividend >= 1);
   
   System.out.println(countNums.showResult());
  }
}