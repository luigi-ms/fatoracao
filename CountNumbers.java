package com.fatorac;
import com.fatorac.CountNumbers;
import com.fatorac.FactorizationMethodsList;
import java.util.ArrayList;
import java.util.List;

public class CountNumbers {
    private Integer count = new Integer(0);
    private String result = new String("");
    private ArrayList<Integer> factorList = new ArrayList<Integer>();
    
    public CountNumbers(ArrayList factorList){
      this.factorList = factorList;
    }
    
    public Integer getCount(){
      return this.count;
    }
    
    public String getResult(){
      return this.result;
    }
    
    public ArrayList getFactorList(){
      return this.factorList;
    }
    
    public void setCount(Integer count){
      this.count = count;
    }
    
    public void setResult(String result){
      this.result = result;
    }
    
    public void setFactorList(ArrayList factorList){
      this.factorList = factorList;
    }
    
    private void sweepList(){
      for(int i=0; i<getFactorList().size(); i++){
        this.countIndexes(getFactorList().get(i));
      }
    }
    
    public String showResult(){
      this.sweepList();
      return getResult();
    }
    
    private Integer countIndexes(Object number){
     this.count = 0;
     for(int i=0; i<getFactorList().size(); i++){
        if(getFactorList().equals(number)){
          setCount(this.count++);
        }
     }
     this.buildResult(number, getCount());
    }
    
    private void buildResult(Integer index, Integer reps){
      setResult(index.toString()+"^"+reps.toString()+" . ");
    }
}
