
package bank;


public class Branch {

// Variables
private String BranchName;
private int BranchCode;
private Employee Manager;


public String getBranchName(){
  return this.BranchName ;
}

public int getBranchCode(){
  return this.BranchCode ;
}

public Employee getManager(){
  return this.Manager ;
}

public void setBranchName( String BranchName){
   this.BranchName = BranchName ;
} 

public void setBranchCode(int BranchCode){
   this.BranchCode = BranchCode ;
}

public void setManager(Employee Manager){
  this.Manager = Manager ;
}

public Branch(String BranchName, int BranchCode){
  
    this.BranchName = BranchName ;
    this.BranchCode = BranchCode ;

}

public Branch(String BranchName, int BranchCode,Employee Manager){

    this.BranchName = BranchName ;
    this.BranchCode = BranchCode ;
    this.Manager = Manager;

}

public Branch(){}

}
