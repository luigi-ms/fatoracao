package com.fatorac;
import java.util.ArrayList;

public class FactorsList {
    private ArrayList<Integer> factorsList = new ArrayList<Integer>();
    private String stringForm = new String();
    
    public FactorsList(){}
    
    public void add(Integer number){
      this.factorsList.add(number);
    }
    
    public String getList(){    
      for(Integer factor : this.factorsList){
        this.stringForm = this.stringForm.concat(factor.toString()+" ");
      }
      
      return this.stringForm;
    }
}
