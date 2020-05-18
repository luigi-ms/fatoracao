package com.fatorac;
import com.fatorac.DivisibleNumber;
import com.fatorac.PrimeNumbersList;
import com.fatorac.FactorizationMethod;

public class DivisibleNumber implements FactorizationMethod{
    private PrimeNumbersList primeNumbers = new PrimeNumbersList();
    private Integer divisibleNumber = primeNumbers.getIndex(0);
    
    public DivisibleNumber(){}
    
    public boolean thereIsDivisible(Integer number){
      for(int i=0; i<primeNumbers.getPrimeNumbers().size(); i++){
        if(number % this.primeNumbers.getIndex(i) == 0){
          return true;
        } else {
          continue;
        }
      }
      
      return false;
    }
    
    public Integer get(){
      return this.divisibleNumber;
    }
    
    public void set(Integer number){
      if(this.thereIsDivisible(number)){
        this.divisibleNumber = number;
      } else {
        System.out.println("There is no divisible in the list");
      }
    }
}
