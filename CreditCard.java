//This is a childclass CreditCard of parent class BankCard
public class CreditCard extends BankCard {
    //Declaring  all the instance variables
    private int cvc_number;
    private double credit_limit;
    private double interest_rate;
    private String expiration_date;
    private int grace_period;
    private boolean is_granted = false;
    //This is a constructor of CreditClass
    public CreditCard(int card_id, String client_name, String issuer_bank, String bank_account, int balance_amount,int cvc_number, double interest_rate, String expiration_date) {
        super(balance_amount, card_id, bank_account, issuer_bank);
        super.setClientName(client_name);
        this.cvc_number = cvc_number;
        this.interest_rate = interest_rate;
        this.expiration_date = expiration_date;
        this.is_granted = false;
    }
    
    //This is a getter method which returns cvc_number
    public int getCvcNumber(){

        return this.cvc_number;

    }
    
    //This is a getter method which returns credit_limit
    public double getCreditLimit(){

        return this.credit_limit;

    }
    
    //This is a getter method which returns interest_rate
    public double getInterestRate(){
        
        return this.interest_rate;
        
    }
    
    //This is a getter method which returns expiration_date
    public String getExpirationDate(){
        
        return this.expiration_date;
        
    }
    
    //This is a getter method which grace_period
    public int getGracePeriod(){
        
        return this.grace_period;
        
    }
    
    //This is a getter method which returns is_granted
    public boolean getIsGranted(){
        
        return this.is_granted;
        
    }
    //This is a setter method used to set the credit_limit and grace_period if balance_amount is sufficient
    public void setCreditLimit(double credit_limit, int grace_period){
        if (credit_limit <= super.getBalanceAmount() * 2.5) {
            
            this.credit_limit = credit_limit;
            this.grace_period = grace_period;
            this.is_granted = true;

        } else {
            
            System.out.print("The credit cannot be issued ");
            
        }

    }
    
    //This is a method used to cancel the credit card by reseting the values to zero
    public void cancelCreditCard(){
        this.cvc_number = 0;
        this.credit_limit = 0;
        this.grace_period = 0;
        this.is_granted = false;
    }
    //This is a method used to Display the details of CreditCard according to the given condition
    public void Display(){
        if (is_granted == true){
            super.Display();
            System.out.println("Your credit Limit is : " + credit_limit);
            System.out.print("Your Grace period is :" + grace_period);
        }

        else {
            super.Display();
        }

    }

}
