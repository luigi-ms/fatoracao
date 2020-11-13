package com.fatorac;
import java.util.ArrayList;

public class PrimeNumbersList {
    private ArrayList<Integer> primeNumbersList = new ArrayList<Integer>();
    private Integer divisible = 0;
    
    public PrimeNumbersList(){
      this.primeNumbersList.add(2);
      this.primeNumbersList.add(3);
      this.primeNumbersList.add(5);
      this.primeNumbersList.add(7);
      this.primeNumbersList.add(11);
      this.primeNumbersList.add(13);
      this.primeNumbersList.add(17);
    }
    
    public boolean thereAnyDivisible(Integer number){
     for(Integer primeNumber : this.primeNumbersList){
       if(number % primeNumber == 0){
         return true;
       }
     }
     
     return false;
    }
    
    public void setDivisible(Integer number){
      for(Integer primeNumber : this.primeNumbersList){
        if(number % primeNumber == 0){
         this.divisible = primeNumber;
       }
      }
    }
    
    public Integer getDivisible(){
      return this.divisible;
    }
}
