
package bank;

public class Date {

    private int Day;
    private int Month;
    private int Year;
    
    public int getDay(){
        
        return this.Day ;
    }
    
    public int getMonth(){
      
        return this.Month ;
    }
    
    public int getYear(){
    
        return this.Year ;
    }
    
    public String getDate(){
    
       return this.getYear() + "/" + this.getMonth() + "/" + this.getDay();
    }
    
    public void setDay(int Day){
      
        this.Day = Day ;
    }
    
    public void setMonth(int Month){
    
        this.Month = Month ;
    }
    
    public void setYear(int Year){
    
        this.Year = Year ;
    }
    
    
    public Date(int Day, int Month, int Year){
      
       this.Day = Day ;
       this.Month = Month ;
       this.Year = Year ;
    }
    
    public Date(){}
    
}
