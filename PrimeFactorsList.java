package com.fatorac;
import com.fatorac.FactorizationMethodsList;
import com.fatorac.PrimeFactorsList;
import java.util.ArrayList;

public class PrimeFactorsList implements FactorizationMethodsList {
    private ArrayList<Integer> primeFactors = new ArrayList<Integer>();
    
    public PrimeFactorsList(){}
    
    public void add(Integer number){
      this.primeFactors.add(number);
    }
    
    public Integer getIndex(Integer index){
      return this.primeFactors.get(index);
    }
    
    public Integer size(){
      return this.primeFactors.size();
    }
}
