
package bank;

public class Employee extends Customer{

   private long EmployeeNumber;
   private Branch  BranchInfo;
   
   
   public long getEmployeeNumber(){
   
       return this.EmployeeNumber;
   }
  
   public String getBranchName(){
   
       return this.BranchInfo.getBranchName();
   }
   
   @Override
   public int getBranchCode(){
   
       return this.BranchInfo.getBranchCode();
   }
   
   public void setEmployeeNumber(long EmployeeNumber){
   
       this.EmployeeNumber = EmployeeNumber;
   }
   
   
   public void setBranchInfo(Branch BranchInfo){
   
       this.BranchInfo = BranchInfo;
   }
   
   public Employee(long EmployeeNumber,Branch BranchCode){
       
       this.EmployeeNumber = EmployeeNumber;
       this.BranchInfo = BranchInfo;  
   }
   
   public Employee(String FirstName,String LastName,long NationalID,Date BirthDate,long EmployeeNumber,Branch BranchInfo){
   
       this.setFirstName(FirstName);
       this.setLastName(LastName);
       this.setNationalID(NationalID);
       this.setBirthDate(BirthDate);
       this.EmployeeNumber = EmployeeNumber;
       this.BranchInfo = BranchInfo;
   
   }
   
   public Employee(){}
    
}
