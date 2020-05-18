package com.fatorac;
import com.fatorac.FactorizationMethodsList;
import com.fatorac.PrimeNumbersList;
import java.util.ArrayList;

public class PrimeNumbersList implements FactorizationMethodsList {
    private ArrayList<Integer> primeNumbers = new ArrayList<Integer>();
    
    public PrimeNumbersList(){
      this.add(2);
      this.add(3);
      this.add(5);
      this.add(7);
      this.add(11);
      this.add(13);
    }
    
    public void add(Integer number){
      this.primeNumbers.add(number);
    }
    
    public Integer getIndex(Integer index){
      return this.primeNumbers.get(index);
    }
    
    public Integer size(){
      return this.primeNumbers.size();
    }
    
    public ArrayList<Integer> getPrimeNumbers(){
      return this.primeNumbers;
    }
}