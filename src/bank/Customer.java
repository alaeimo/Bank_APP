
package bank;

public class Customer {
  
    // Variables
    
    private String FirstName;
    private String LastName;
    private long CustNumber;
    private Date BirthDate ;
    private long NationalID;
    private int BranchCode;
    
    public Customer(String firstName, String lastName, long custNumber){
     
        this.FirstName = firstName;
        this.LastName =  lastName;
        this.CustNumber = custNumber;
    }
    
    public Customer(String FirstName, String LastName, long CustNumber,Date BirthDate,long NationalID){
    
        this.FirstName = FirstName;
        this.LastName =  LastName;
        this.CustNumber = CustNumber;
        this.BirthDate = BirthDate;
        this.NationalID = NationalID;
    
    }
    
    public String getFirstName(){
    
         return this.FirstName;
    }
    
    public String getLastName(){
  
        return this.LastName;
    }
    
    public long getCustNumber(){
    
        return this.CustNumber;
    }
    
    public String getBirthDate(){
       
        return this.BirthDate.getDate();
    }
    
    public long getNationalID(){
    
        return this.NationalID;
    }
    
    public int getBranchCode(){
    
        return this.BranchCode;
    }
    
    public void setFirstName(String FirstName){
    
          this.FirstName = FirstName;
    }
    
    public void setLastName(String LastName){
  
         this.LastName = LastName;
    }
    
    public void setCustNumber(long CustNumber){
    
         this.CustNumber = CustNumber;
    }
    
    public void setBirthDate(Date BirthDate){
         
         this.BirthDate = BirthDate;
       
    }
    
    public void setNationalID(long NationalID){
    
         this.NationalID = NationalID;
    }
    
    public void setBranchCode(int BranchCode){
    
         this.BranchCode = BranchCode;
    }
    
    
    public String toString(){
        
        String Str = "CustNumber : " + Long.toString(getCustNumber()) + "\nFirst Name : " + getFirstName() + " \tLast Name : " + getLastName();
        return Str;
     }
    
    public Customer(){}
}
