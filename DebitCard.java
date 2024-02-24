//This is a DebitCard class which is a child class of BankCard class
public class DebitCard extends BankCard{
    //Declaring all the instace variables of DebitCard class
    private int pin_number;
    private int withdrawl_amount;
    private  String date_of_withdrawl;
    private boolean has_withdrawn=false;
        //This is a constructor of DebitCard class
        public DebitCard(int balance_amount,int card_id,String bank_account,String issuer_bank,String client_name,int pin_number){
            super( balance_amount,card_id,bank_account,issuer_bank);
            super.setClientName(client_name);
            this.pin_number=pin_number;
            this.has_withdrawn=false;
           
           
        }
        
        //This is a accessor method to return pin_number
        public int getPinNumber(){
        
            return this.pin_number;
        
        }
        
        //This is a accessor method to return withdrawl_amount
        public int getWithdrawlAmount(){
        
            return this.withdrawl_amount;
         
        }
        
        //This is a accessor method to return date_of_withdrawl
        public String getDateOfWithdrwal()
        {
            
            return this.date_of_withdrawl; 
            
        }
        
        //This is a accessor method to return has_withdrawn
        public boolean getHasWithdrawn()
        {
        
            return this.has_withdrawn;
        
        }
        
        //This  is a setter method is used to set the value of withdrawl_amount
        public void setWithdrawlAmount(int withdrawl_amount){
        
             this.withdrawl_amount=withdrawl_amount;
             
        }
        
        //This method is used to withdraw amount from the bank_account
        public void Withdraw(int withdrawl_amount,String date_of_withdrawl,int pin_number){
            
             if(pin_number==this.pin_number&& withdrawl_amount<=super.getBalanceAmount())
            {
             this.setWithdrawlAmount(withdrawl_amount);
             this.has_withdrawn=true; 
             super.setBalanceAmount(super.getBalanceAmount()-withdrawl_amount);
             this.date_of_withdrawl=date_of_withdrawl;
        
             }else if(pin_number!=this.pin_number&& withdrawl_amount<=super.getBalanceAmount())
            {         
                
            System.out.print("try again YOU HAVE ENTERED WRONG PIN NUMBER ");
            
            }else
            {
            System.out.print("YOU HAVE INSUFFICIENT BALANCE");        
        
            }

        }
        
        //This method is used to display all the details of DebitCard class according to condition
        public void Display(){
          if(this.has_withdrawn==true){
              
                super.Display();
                System.out.println("Your pin number is"+pin_number);
                System.out.println("Your date of withdrawl is "+date_of_withdrawl);
                System.out.println("Your withdrawl amount is"+withdrawl_amount);
                
            }else
            {   
                System.out.print("Your balance amount is"+super.getBalanceAmount());
            }
            
        }

 }