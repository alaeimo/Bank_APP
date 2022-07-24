
package bank;

public class Deposit {
    
 // Variables
    private String DepositType;
    private int DepositTypeCode;
    private Deposit Support;
    private int DepositNumber;
    private int BranchCode;
    private Customer Owner ;
    private double InitialAmount;
    private Date OpenDate ;
    private double Balance;
    private double Profit_Ratio;
    private Date OperationDate ;
    private int IsOpen;
    
    
    public Deposit(String DepositType,int DepositTypeCode,Deposit Support,int DepositNumber,Customer Owner,double InitialAmount,Date OpenDate){
    
        this.DepositType = DepositType ;
        this.DepositTypeCode = DepositTypeCode ;
        this.Support = Support ;
        this.DepositNumber = DepositNumber ;
        this.Owner = Owner ;
        this.InitialAmount = InitialAmount ;
        this.OpenDate = OpenDate ;
        this.Balance = InitialAmount;
    }
    
    public String getDepositType(){
        return this.DepositType;
    }
    public int getDepositTypeCode(){
        return this.DepositTypeCode;
    }
    public Deposit getSupport(){
        return this.Support;
    }
    public int getDepositNumber(){
        return this.DepositNumber;
    }
    public int getBranchCode(){
        return this.BranchCode;
    }
    public Customer getOwner(){
        return this.Owner;
    }
    public double getInitialAmount(){
        return this.InitialAmount;
    }
    public String getOpenDate(){
        return this.OpenDate.getDate();
    }
    public double getBalance(){
        return this.Balance ;
    }
    public double getProfit_Ratio(){
        return this.Profit_Ratio;
    }
    public Date getOperationDate(){
        return this.OperationDate;
    }
    public int getIsOpen(){
        return this.IsOpen;
    }
    
    public void setDepositType(String DepositType){
        this.DepositType = DepositType;
    }
    
    public void setDepositTypeCode(int DepositTypeCode){
       this.DepositTypeCode = DepositTypeCode ; 
    }
    
    public void setSupport(int SupportNumber,String SupportDepositType){
       this.Support.setDepositNumber(DepositNumber);
       this.Support.setDepositType(SupportDepositType);
    }
    
    public void setDepositNumber(int DepositNumber){
       this.DepositNumber = DepositNumber; 
    }
    
    public void setBranchCode(int BranchCode){
      this.BranchCode = BranchCode ;
    }
    
    public void setOwner(Customer Owner){
       this.Owner = Owner ;
    }
    
    public void setInitialAmount(double InitialAmount){
       this.InitialAmount = InitialAmount ;
       setBalance(InitialAmount);
    }
    
    public void setOpenDate(Date OpenDate){
       this.OpenDate = OpenDate ;
    }
    
    public void setBalance(double Balance){
       this.Balance = Balance ;
    }
    
    public void setProfit_Ratio(double Profit_Ratio){
       this.Profit_Ratio = Profit_Ratio ;
    }
    
    public void setOperationDate(Date OperationDate){
       this.OperationDate = OperationDate ;
    }
    
    public void setIsOpen(int IsOpen){
       this.IsOpen = IsOpen ;
    }
    
    public double getBalanceInDate(Date date){
    
        return 0;
    }
    
    public boolean withdraw(int custNumber, double amount, Date date){
    
        return true;
    }
    
    public boolean setElement(double amount, Date date){
    
        return true;
        
    }
    
    public boolean closeDeposit(int custNumber, Date date){
    
        return true;
    
    }
    
    public String toString(){
    
        return null;
    }
    
    public Deposit(){
    
    }
    
    }
