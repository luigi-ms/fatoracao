package com.fatorac;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class FactorsList {
    private ArrayList<Integer> factorsList = new ArrayList<Integer>();
    private String stringForm = new String();
    private Set<Integer> factorsSet = new HashSet<Integer>();
    
    public FactorsList(){}
    
    public void add(Integer number){
      this.factorsList.add(number);
      this.factorsSet.add(number);
    }
    
    public String buildResult(){
      if(this.factorsSet.size() == 1){
        for(Integer factor : this.factorsSet){
          this.stringForm += countAndMount(factor); 
        }
      }else{
        for(Integer factor : this.factorsSet){
          this.stringForm += countAndMount(factor)+" + "; 
        }
      }
      
      return this.stringForm;
    }
    
    public String countAndMount(Integer number){
      int count = 0;
    
      for(Integer listItem : this.factorsList){
         if(number.equals(listItem)){
           count++;
         }
      }
      
      return (count == 1) ? number.toString() : "("+number+"^"+count+")";
    }
}
