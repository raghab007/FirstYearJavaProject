//This is a parent class
public class BankCard{
    //Declaring  all the instance variables
    private String client_name;
    private String issuer_bank;
    private String bank_account;
    private int card_id;
    private int balance_amount;
        //This is constructor to initialize a object
        public BankCard(int balance_amount,int card_id,String bank_account,String issuer_bank){
        
            this.balance_amount=balance_amount;
            this.card_id=card_id;
            this.bank_account=bank_account;
            this.issuer_bank=issuer_bank;
            this.client_name="";
            
        
        }
        
        //This is a accessor method to return client_name
        public String getClientName(){
             return this.client_name;
        }
        
        //This is a accessor method to return issuer_bank
        public String getIssuerBank(){
             return this.issuer_bank;
        }
        
        //This is a accessor method to return bank_account
        public String getBankAccount(){
             return this.bank_account;
        }
        
        //This is a accessor method to return card_id
        public int getCardId(){
             return this.card_id;
        }
        
        //This is a accessor method to return balance_amount
        public int getBalanceAmount(){
             return this.balance_amount;
        }
        
        //This is a setter method to set the client_name
        public void setClientName(String client_name)
        {
            
            this.client_name=client_name;
            
        }
        
        //This is a mutator to set the balance_amount
        public void setBalanceAmount(int balance_amount)
        {
        
            this.balance_amount=balance_amount;
            
        }
        
        //This method is used to Display all the details of BankCard class
        public void Display(){
            System.out.println("Your Card ID is "+card_id);
            System.out.println("Your Name is "+client_name);
            System.out.println("Issued Bank "+issuer_bank);
            System.out.println("Your Bank Account is "+bank_account);
            System.out.println("Your balance amount is "+balance_amount);
            if (client_name.isEmpty())
            {
        
                System.out.print("Client name is not entered");
            
            }
        
        
        }
        

    }

