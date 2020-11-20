package com.fatorac;
import com.fatorac.PrimeNumbersList;
import com.fatorac.FactorsList;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
   Scanner read = new Scanner(System.in);
   PrimeNumbersList pnl = new PrimeNumbersList();
   FactorsList fl = new FactorsList();
   
   System.out.println("Type a number: ");
   int dividend = read.nextInt();
   
   Integer divisor = 0;
   
   System.out.println("\n");
   
   read.close();
   
   do{
     if(pnl.thereAnyDivisible(dividend)){
       pnl.setDivisible(dividend);
       divisor = pnl.getDivisible();
       
       System.out.println(dividend+" | "+divisor);
       
       dividend /= divisor;
       
       fl.add(divisor);
     }else{
       break;
     }
   }while(dividend != 1);
   
   System.out.println("\nResult:\n "+fl.buildResult());
  }
}