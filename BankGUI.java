//importing  java swing library for JComponents from javax
import javax.swing.*;
// importing awt library
import java.awt.*;
// importing ActionListener interface from 
import java.awt.event.*;
// importing ArrayList class form java util package
import java.util.ArrayList;
// Creating BankGUI class which implements ActionListener interface.
public class BankGUI implements ActionListener
{
    //Declaration of arraylist object and initialization  
    ArrayList<BankCard>arrayList=new ArrayList<BankCard>();
    //Declaring jframes
  private  JFrame frame,frameCredit,frameCreditLimit,frameWithdraw,frameCancelCreditCard,frameDisplayDebitCard,frameDisplayCreditCard;
    //combo box components
  private  JComboBox<String> cExpirationDateYear,cExpirationDateMonth,cExpirationDateDay,cWithdrawlDateYear,cWithdrawlDateMonth,cWithdrawlDateDay;
    // Declaring  Label components
  private  JLabel l,labelEnterPinOnly,labelDetails,creditLabel,lCardId,lClientName,lIssuerBank,lBankAccount,lBalanceAmount,lPinNumber,lWithdrawlAmount,lCvcNumber,lCreditNumber,lCreditLimit,lInterestRate,lGracePeriod,lSetPinNumber,lExpirationDate,lCardId1,lWithdrawlDate,lCardId2,labelWithdraw,lWithdrawlPin,lCancelCardId,lDisplayCreditCardId,lDisplayDebitCardId;
    // Declaring  Text Field Components 
  private  JTextField tCardId,tClientName,tBankAccount,tBalanceAmount,tPinNumber,tIssuerBank,tCvcNumber,tInterestRate,tCreditLimit,tGracePeriod1,tCardId1,tCardId2,tWithdrawlAmount,tWithdrawlPin,tCancelCardId,tDisplayCreditCardId,tDisplayDebitCardId;
    // Declaring   Buttons components
  private  JButton btnClear,btnAddDebitCard,addCreditCard,btnWithdraw,btnsetCreditLimit,btnCancelCredit,btnDisplayDebitCard,btnDisplayCreditCard,btnAddCreditCard,btnsetCreditLimit1,btnWithdrawAmount,btnCancelCreditCard,btnCancelCreditCard1,btnDisplayCreditCard1,btnDisplayDebitCard1;
    //Declaring panels
  private  JPanel pExpirationDate,pWithdrawlDate;
    // Creating  Bank Gui constructor
    public BankGUI()
    {
        //Initialization of JLabels
        l=new JLabel("RAGHAB INVESTMENT BANK");
        labelEnterPinOnly = new JLabel("Enter Pin Number(Only for Debit Card)");
        lCardId=new JLabel("Card ID");
        lIssuerBank=new JLabel("Issuer Bank");
        lBankAccount=new JLabel("Bank Account");
        lBalanceAmount=new JLabel("Balance Amount");
        lPinNumber=new JLabel("PIN number");       
        lCreditNumber=new JLabel("Credit Number");
        lClientName=new JLabel("Client Name");
        labelDetails =new JLabel("Enter folllowing details for debit and credit card");
        labelDetails.setBounds(350,90,350,30);
    
        //Initialization  of Text Fields
        tCardId=new JTextField();
        tClientName=new JTextField();
        tBankAccount=new JTextField();
        tBalanceAmount=new JTextField();
        tPinNumber = new JTextField();
        tIssuerBank=new JTextField();
        
        //adding imageicon on label
        ImageIcon image1 = new ImageIcon("bank_logo.png");
        l.setIcon(image1);
        l.setHorizontalTextPosition(JLabel.RIGHT);
        l.setIconTextGap(20);
        l.setForeground(Color.gray);
        l.setBounds(30,10,500,70);
        l.setFont(new Font("Oregon", Font.BOLD, 20));
        
        //using methods for card label and text field
        lCardId.setBounds(300,155,100,25);
        lCardId.setFont(new Font(" ",Font.BOLD,17));
        tCardId.setBounds(390,150,150,35);
        tCardId.setFont(new Font(" ",Font.PLAIN,17));
        tCardId.setForeground(Color.GRAY);
        
        
       
        // client Name label and text field
        lClientName.setBounds(276,240,120,25);
        lClientName.setFont(new Font("",Font.BOLD,17));
        tClientName.setBounds(390,240,150,35);
        tClientName.setFont(new Font(" ",Font.PLAIN,17));
        tClientName.setForeground(Color.GRAY);
        
        //Bank Account label and text field
        lBankAccount.setBounds(260,330,120,25);
        lBankAccount.setFont(new Font("",Font.BOLD,17));
        tBankAccount.setBounds(390,330,150,35);
        tBankAccount.setFont(new Font(" ",Font.PLAIN,17));
        tBankAccount.setForeground(Color.GRAY);
        
        //Balance Amount label and text field
        lBalanceAmount.setBounds(610,240,140,25);
        lBalanceAmount.setFont(new Font("",Font.BOLD,17));
        tBalanceAmount.setBounds(770,240,150,35);
        tBalanceAmount.setFont(new Font(" ",Font.PLAIN,17));
        tBalanceAmount.setForeground(Color.GRAY);
        

        //Issuer Bank label and text field
        lIssuerBank.setBounds(620,150,120,30);
        lIssuerBank.setFont(new Font("",Font.BOLD,17));
        tIssuerBank.setBounds(770,150,150,35);
        tIssuerBank.setFont(new Font(" ",Font.PLAIN,17));
        tIssuerBank.setForeground(Color.GRAY);
        
        //pin number
        lPinNumber = new JLabel("Pin Number");
        lPinNumber.setFont(new Font("",Font.BOLD,17));
        lPinNumber.setBounds(260,430,120,30);
        tPinNumber.setBounds(390,430,150,35);
        

        
        labelEnterPinOnly.setBounds(360,390,250,30);
        labelEnterPinOnly.setFont(new Font("",Font.BOLD,12));
        
           
        
        
        //add debit card button
        btnAddDebitCard = new JButton("Add  Debit Card");
        btnAddDebitCard.setBounds(390,490,150,40);
        btnAddDebitCard.setFocusable(false);
        btnAddDebitCard.setBackground(Color.WHITE);
        btnAddDebitCard.setForeground(Color.BLACK);
        btnAddDebitCard.addActionListener(this);
        
        //add credit card button
        btnAddCreditCard = new JButton("Add Credit Card");
        btnAddCreditCard.setBounds(770,330,150,40);
        btnAddCreditCard.setFocusable(false);
        btnAddCreditCard.setBackground(Color.WHITE);
        btnAddCreditCard.setForeground(Color.BLACK);
        btnAddCreditCard.addActionListener(this);
        
        //clear btn
        btnClear = new JButton("Clear");
        btnClear.setBounds(20,130,150,40);
        btnClear.setFocusable(false);
        btnClear.setBackground(Color.WHITE);
        btnClear.setForeground(Color.BLACK);
        btnClear.addActionListener(this);
        
        //withdraw button
        btnWithdraw = new JButton("Withdraw");
        btnWithdraw.setBounds(20,230,150,40);
        btnWithdraw.setFocusable(false);
        btnWithdraw.setBackground(Color.WHITE);
        btnWithdraw.setForeground(Color.BLACK);
        btnWithdraw.addActionListener(this);
        
    
        //set credit limit button
        btnsetCreditLimit = new JButton("Set credit limit");
        btnsetCreditLimit.setBounds(20,330,150,40);
        btnsetCreditLimit.setFocusable(false);
        btnsetCreditLimit.setBackground(Color.WHITE);
        btnsetCreditLimit.setForeground(Color.BLACK);
        btnsetCreditLimit.addActionListener(this);
        
        // JButton to dispplay Debit Card
        btnDisplayDebitCard = new JButton("Display DebitCard");
        btnDisplayDebitCard.setBounds(20,430,150,40);
        btnDisplayDebitCard.setFocusable(false);
        btnDisplayDebitCard.setBackground(Color.WHITE);
        btnDisplayDebitCard.setForeground(Color.BLACK);
        btnDisplayDebitCard.addActionListener(this);
        
        //jButton  to display Credit Card
        btnDisplayCreditCard = new JButton("Display CreditCard");
        btnDisplayCreditCard.setBounds(20,530,150,40);
        btnDisplayCreditCard.setFocusable(false);
        btnDisplayCreditCard.setBackground(Color.WHITE);
        btnDisplayCreditCard.setForeground(Color.BLACK);
        btnDisplayCreditCard.addActionListener(this);
        
        //jButton to cancel Credit Card
        btnCancelCreditCard = new JButton("Cancel Credit Card");
        btnCancelCreditCard.setBounds(770,430,150,40);
        btnCancelCreditCard.setFocusable(false);
        btnCancelCreditCard.setBackground(Color.WHITE);
        btnCancelCreditCard.setForeground(Color.BLACK);
        btnCancelCreditCard.addActionListener(this);
        
        //Setting JFrame
        frame = new JFrame("SWIFT BANK");
        frame.setLayout(null);
        // Set position and size of frame
        frame.setBounds(200,10,1000,700);
        // Adding components to the frame
        frame.add(l);
        frame.add(labelEnterPinOnly);
        frame.add(lCardId);
        frame.add(tCardId);
        frame.add(lClientName);
        frame.add(tClientName);
        frame.add(lBankAccount);
        frame.add(tBankAccount);
        frame.add(lBalanceAmount);
        frame.add(tBalanceAmount);
        frame.add(lPinNumber);
        frame.add(tPinNumber);
        frame.add(lIssuerBank);
        frame.add(tIssuerBank);
        frame.add(btnAddDebitCard);
        frame.add(btnAddCreditCard);
        frame.add(btnClear);
        frame.add(btnWithdraw);
        frame.add(btnsetCreditLimit);
        frame.add(btnDisplayDebitCard);
        frame.add(btnDisplayCreditCard);
        frame.add(btnCancelCreditCard);
        frame.add(labelDetails);
        //Setting background of frame 
        frame.getContentPane().setBackground(new Color(159, 226, 191));
        frame.setResizable(false);
        //this setDefaultCloseOperation method will fully terminate the jFrame running on clicking exit button.
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Making frame visible
        frame.setVisible(true);
        
    
    
}
     //Overiding the method of ActionListener interface to produce action events  
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==btnAddDebitCard){
            //this try block will run if there is not any  type of exception
            try{
                String bankAccount = tBankAccount.getText();
                String issuerBank = tIssuerBank.getText();
                String clientName = tClientName.getText();
                
                //Checking wheter 
                if(bankAccount.isEmpty()){
                    
                    JOptionPane.showMessageDialog(frame,"bankAccount is empty"," ",JOptionPane.WARNING_MESSAGE);
                    
                }
                else if(issuerBank.isEmpty()){
                
                    JOptionPane.showMessageDialog(frame,"Issuer Bank is empty"," ",JOptionPane.WARNING_MESSAGE);
                
                }
                else if(clientName.isEmpty()){
                
                    JOptionPane.showMessageDialog(frame,"client name id empty"," ",JOptionPane.WARNING_MESSAGE);
                
                }
                else if(tPinNumber.getText().isEmpty()){
                
                    JOptionPane.showMessageDialog(frame,"Pin Number is Empty"," ",JOptionPane.WARNING_MESSAGE);
                
                }
                else if(tBalanceAmount.getText().isEmpty()){
                
                    JOptionPane.showMessageDialog(frame,"Balance Amount is empty"," ",JOptionPane.WARNING_MESSAGE);
                
                }
               else{
                   
                    int pinNumber =Integer.parseInt(tPinNumber.getText());
                    int balanceAmount = Integer.parseInt(tBalanceAmount.getText());
                    int cardId = Integer.parseInt(tCardId.getText());
                    if(balanceAmount>0 && pinNumber>0 && cardId>0){
                    if(arrayList.isEmpty())
                    {
                        // adding debit card object to the arrayList
                        arrayList.add(new DebitCard( balanceAmount, cardId,bankAccount, issuerBank, clientName, pinNumber));
                        JOptionPane.showMessageDialog(frame,"Card added","Sucessfully added",JOptionPane.INFORMATION_MESSAGE);
                        tCardId.setText("");
                        tClientName.setText("");
                        tBankAccount.setText("");
                        tBalanceAmount.setText("");
                        tPinNumber.setText("");
                        tIssuerBank.setText("");
                    }
                    else{
                        boolean cardAlreadyExist = false;
                        // Iterating over arrayList  using for each loop for accessing all the objects of an arrayList
                        for(BankCard raghab:arrayList)
                        {
                            //Upcasting object to BakCard class
                            BankCard obj1 = raghab;
                            
                            if(obj1 instanceof DebitCard)
                            {
                               // Downcasting BankCard Object to DebitCard 
                                DebitCard obj2 = (DebitCard)obj1;
                            
                               if( obj2.getCardId()==cardId)
                               {
                                    
                                    JOptionPane.showMessageDialog(frame,"Card Already Exits","",JOptionPane.WARNING_MESSAGE); 
                                    cardAlreadyExist = true;
                                
                                }
                               
                            }
                        
                        }
                        if(cardAlreadyExist==false)
                        {
                        
                                arrayList.add(new DebitCard(balanceAmount,cardId,bankAccount,issuerBank,clientName,pinNumber));
                                JOptionPane.showMessageDialog(frame,"Card Added"," ",JOptionPane.INFORMATION_MESSAGE);
                                tCardId.setText("");
                                tClientName.setText("");
                                tBankAccount.setText("");
                                tBalanceAmount.setText("");
                                tPinNumber.setText("");
                                tIssuerBank.setText("");
                        
                        }
                }

            }else{
            
            
                JOptionPane.showMessageDialog(frame,"Please enter positive data","Error",JOptionPane.WARNING_MESSAGE);
            
            
            }
        }
            
        }     
            //this catch block will catch the exception in try block
             catch(NumberFormatException a)
             {
            
               JOptionPane.showMessageDialog(frame,"Invalid field detected ","Please fill all the text fields",JOptionPane.WARNING_MESSAGE);
              
            }
        }
         if(e.getSource()==btnAddCreditCard)
        {
             
                new  innerCredit();
            
        }
    
        // adding functionality to the clearbutton that clears all the text field   
         if (e.getSource()==btnClear)
         {
             
            tCardId.setText("");
            tClientName.setText("");
            tBankAccount.setText("");
            tBalanceAmount.setText("");
            tPinNumber.setText("");
            tIssuerBank.setText("");
            
        }
         // if btnWithdraw is clicked the block of code will be executed
        if(e.getSource()==btnWithdraw)
        {
            // calling the constructor of Withdraw class to open a new frame
            new Withdraw();
        
        } 
        if(e.getSource()==btnsetCreditLimit)
        {
            
            // Calling setCreditLimit constructor to create an object
            new setCreditLimit();
        
        }
        if(e.getSource()==btnCancelCreditCard)
        {
        
            new cancelCreditCard();
        
        }
        if(e.getSource()==btnDisplayCreditCard)
        {
            // calling the constructor of displayCreditCard class to open a new frame
             new displayCreditCard();
        
        }
        if(e.getSource()==btnDisplayDebitCard)
        {
            // calling the constructor of displayDebitCard class to open a new frame
            new displayDebitCard();
        
        }
            
} 
// Creating inner class innerCredit which implements ActionListener interface
class innerCredit implements ActionListener
{
        innerCredit()
        {
            // Initialization of components
            tCvcNumber = new JTextField();
            tInterestRate = new JTextField();
            lExpirationDate = new JLabel("Expiration Date");
            
            addCreditCard = new JButton("Add Credit Card");
            addCreditCard.setBounds(200,500,150,35);
            addCreditCard.setForeground(Color.BLACK);
            addCreditCard.setBackground(Color.WHITE);
            addCreditCard.addActionListener(this);
            
            //setting position and size of label
            lCvcNumber = new JLabel("CVC Number");
            lCvcNumber.setBounds(120,150,120,30);
            lCvcNumber.setFont(new Font("",Font.BOLD,17));
            tCvcNumber.setBounds(245,150,150,35);
            
            
            
        
            // setting position, size and font of interest rate
            lInterestRate = new JLabel("Interest Rate");
            lInterestRate.setBounds(120,250,120,30);
            lInterestRate.setFont(new Font("",Font.BOLD,17));
            tInterestRate.setBounds(245,250,150,35);
            
            String year[] = {"2020","2021","2022","2023"};
            String month[] = {"January","February","March","April","May","June","July","August","September"};
            String day [] = {"1","2","3","4","5","6","7"};
            
            cExpirationDateYear = new JComboBox<String>(year);
            //cExpirationDateYear.setEditable(true);
            cExpirationDateYear.setBounds(0,0,99,35);
            cExpirationDateMonth = new JComboBox<String>(month);
            //cExpirationDateMonth.setEditable(true);
            cExpirationDateMonth.setBounds(100,0,95,35);
            cExpirationDateDay = new JComboBox<String>(day);
            //cExpirationDateDay.setEditable(true);
            cExpirationDateDay.setBounds(195,0,95,35);
            
            lExpirationDate.setBounds(110,350,140,30);
            lExpirationDate.setFont(new Font("Sensai",Font.BOLD,17));
            pExpirationDate = new JPanel();
            pExpirationDate.setBounds(245,350,290,35);
            pExpirationDate.setBackground(Color.GRAY);
            pExpirationDate.add(cExpirationDateYear);
            pExpirationDate.add(cExpirationDateMonth);
            pExpirationDate.add(cExpirationDateDay);
            pExpirationDate.setLayout(null);
            
            frameCredit = new JFrame("Credit Card");
            frameCredit.add(lExpirationDate);
            frameCredit.add(pExpirationDate);
            frameCredit.add(addCreditCard);
            frameCredit.add(lCvcNumber);
            frameCredit.add(tCvcNumber);
            frameCredit.add(lInterestRate);
            frameCredit.add(tInterestRate);
            frameCredit.getContentPane().setBackground(new Color(200,150,40));
            frameCredit.add(addCreditCard);
            frameCredit.setBounds(500,10,600,700);
            frameCredit.setLayout(null);
            frameCredit.setVisible(true);
            frameCredit.setResizable(false);
            
                
        }
        
        public void actionPerformed(ActionEvent a)
        {
           if(a.getSource()==addCreditCard)
           {
            try{
                String clientName = tClientName.getText();
                String issuerBank = tIssuerBank.getText();
                String bankAccount = tBankAccount.getText();
                String expirationDate = cExpirationDateYear.getSelectedItem()+"_"+cExpirationDateMonth.getSelectedItem()+"_"+cExpirationDateDay.getSelectedItem();
                
                // Checking  if text fields are empty or not
                if(tCardId.getText().isEmpty())
                {
                
                    JOptionPane.showMessageDialog(frameCredit,"card_Id is empty","empty field detected",JOptionPane.WARNING_MESSAGE);
                
                }else if(clientName.isEmpty())
                {
                    
                    JOptionPane.showMessageDialog(frameCredit,"Client_Name is empty","empty field detected",JOptionPane.WARNING_MESSAGE);
                
                }else if(issuerBank.isEmpty())
                {
                    
                    JOptionPane.showMessageDialog(frameCredit,"Issuer_Bank is empty","empty field detected",JOptionPane.INFORMATION_MESSAGE);
                    
                }else if(bankAccount.isEmpty())
                {
                    
                    JOptionPane.showMessageDialog(frameCredit,"Bank_Account is empty","empty field detected",JOptionPane.WARNING_MESSAGE);
                    
                }else if(tBalanceAmount.getText().isEmpty())
                {
                
                    JOptionPane.showMessageDialog(frameCredit,"BalanceAmount is empty" , "empty field detected",JOptionPane.WARNING_MESSAGE);
                
                }else if(tCvcNumber.getText().isEmpty())
                {
                
                    JOptionPane.showMessageDialog(frameCredit,"CvcNumber is empty","empty",JOptionPane.INFORMATION_MESSAGE);
                
                }else if(tInterestRate.getText().isEmpty())
                {
                
                    JOptionPane.showMessageDialog(frameCredit,"Interest rate is empty","empty field detected",JOptionPane.WARNING_MESSAGE);
                
    
                }else if(expirationDate.isEmpty())
                {
                    
                    JOptionPane.showMessageDialog(frameCredit,"Expiration Date","empty field detected",JOptionPane.WARNING_MESSAGE);
                
                }
                // This else part will run if all the text fields are filled
                else
                {
                    
                    int cardId =Integer.parseInt(tCardId.getText());
                    
                    int balanceAmount = Integer.parseInt(tBalanceAmount.getText());
                    int cvcNumber = Integer.parseInt(tCvcNumber.getText());
                    double interestRate = Integer.parseInt(tInterestRate.getText());
                    //This if block will run if this variables are positive
                    if(balanceAmount >0 && cvcNumber> 0 && cardId >0 && interestRate>0)
                    {
                    // Credit Card Object will be added if the array list is empty
                    if(arrayList.isEmpty())
                    {
                        // Adding CreditCard object to the arrayList
                        arrayList.add(new CreditCard( cardId,  clientName,  issuerBank, bankAccount,  balanceAmount,cvcNumber,  interestRate,  expirationDate));
                        frameCredit.dispose();
                        JOptionPane.showMessageDialog(frameCredit,"Card Added ","Sucessfully Added",JOptionPane.INFORMATION_MESSAGE);
                        tCardId.setText("");
                        tClientName.setText("");
                        tBankAccount.setText("");
                        tBalanceAmount.setText("");
                        tPinNumber.setText("");
                        tIssuerBank.setText("");
                    }
                    
                    else{
                            boolean cardAlreadyExists = false;
                            for(BankCard raghab:arrayList)
                            {
                                BankCard obj1 = raghab;
                                if(obj1 instanceof CreditCard )
                                {
                                
                                    CreditCard obj2 = (CreditCard)obj1;
                                    if(obj2.getCardId()==cardId)
                                    {
                                    
                                        JOptionPane.showMessageDialog(frameCredit,"Card already exists","Card cannot be added",JOptionPane.ERROR_MESSAGE);
                                        cardAlreadyExists = true;
                                        
                                    }
                                }                 
                            }
                            if(cardAlreadyExists==false)
                            {
                                // adding Credit Card Object to the arrayList
                                arrayList.add(new CreditCard(cardId,clientName,issuerBank,bankAccount,balanceAmount,cvcNumber,interestRate,expirationDate));
                                JOptionPane.showMessageDialog(frameCredit,"Card Added"," ",JOptionPane.INFORMATION_MESSAGE);
                                tCardId.setText("");
                                tClientName.setText("");
                                tBankAccount.setText("");
                                tBalanceAmount.setText("");
                                tPinNumber.setText("");
                                tIssuerBank.setText("");
                            
                            }
                        }  
                    }
                     else
                     {
                        
                        
                            JOptionPane.showMessageDialog(frameCredit,"Please enter balance amount more than zero","Invalid amount",JOptionPane.WARNING_MESSAGE);
                        
                        
                        
                    }
                }
            }
            // This catch block will run if there is any exception in the try block
            catch(NumberFormatException c)
            {
            
                    JOptionPane.showMessageDialog(frameCredit," Please fill valid data  ","Empty Field",JOptionPane.WARNING_MESSAGE);
            
            
            }
        }
    
        }
        }
//Creating inner class to create new GUI for setting credit limit
class setCreditLimit implements ActionListener
 {
        setCreditLimit()
        {
            // Initialization of Jlabels, text fields, and buttons
            lCardId1 = new JLabel("Card ID");
            lCreditLimit = new JLabel("Credit Limit");
            lGracePeriod = new JLabel("Grace Period");
            tCardId1  = new JTextField();
            tCreditLimit = new JTextField();
            tGracePeriod1 = new JTextField();
            btnsetCreditLimit1 = new JButton("Set Credit Limit");
            
            // Settting position and size of all components
            lCardId1.setBounds(50,150,120,30);
            lCardId1.setFont(new Font("",Font.BOLD,17));
            tCardId1.setBounds(170,150,150,35);
            lGracePeriod.setBounds(50,250,120,30);
            lGracePeriod.setFont(new Font("",Font.BOLD,17));
            tGracePeriod1.setBounds(170,250,150,35);
            lCreditLimit.setBounds(50,350,120,30);
            lCreditLimit.setFont(new Font("",Font.BOLD,17));
            tCreditLimit.setBounds(170,350,150,35);
            
            btnsetCreditLimit1.setBounds(150,450,150,40);
            btnsetCreditLimit1.setBackground(Color.WHITE);
            btnsetCreditLimit1.setForeground(Color.BLACK);
            btnsetCreditLimit1.setFocusable(false);
            btnsetCreditLimit1.addActionListener(this);
        
            
            frameCreditLimit = new JFrame("Set Credit Limit");
            frameCreditLimit.add(lCardId1);
            frameCreditLimit.add(tCardId1);
            frameCreditLimit.add(lCreditLimit);
            frameCreditLimit.add(tCreditLimit);
            frameCreditLimit.add(lGracePeriod);
            frameCreditLimit.add(tGracePeriod1);
            frameCreditLimit.add(btnsetCreditLimit1);
            frameCreditLimit.setLayout(null);
            frameCreditLimit.setBounds(100,40,500,600);
            frameCreditLimit.setVisible(true);
            frameCreditLimit.setResizable(false);
            frameCreditLimit.getContentPane().setBackground(Color.ORANGE);
        
        }
    
        public void actionPerformed(ActionEvent a)
        {
            // This if block of code will run if this jButton is pressed
            if(a.getSource()==btnsetCreditLimit1)
            {
            //this try block will run if there is no exception in it.
               try
               {
                    int CardId = Integer.parseInt(tCardId1.getText()); // Converting string into integer and intializing variables
                    double CreditLimit = Double.parseDouble(tCreditLimit.getText());
                    int GracePeriod = Integer.parseInt(tGracePeriod1.getText());
                
                if(tCardId1.getText().isEmpty())
                   {
                
                
                        JOptionPane.showMessageDialog(frameCreditLimit,"Empty  field",""  ,JOptionPane.WARNING_MESSAGE);
                
                    }
                    if(tCreditLimit.getText().isEmpty())
                    {
                
                
                        JOptionPane.showMessageDialog(frameCreditLimit,"Empty  field",""  ,JOptionPane.WARNING_MESSAGE);
                
                    }
                
                    else
                    {
                    if(CardId>0 && GracePeriod>0)
                    {
                  
                        boolean invalidCard = true;
                        // Iterating over the arraylist using for each loop for accessing  objects
                        for(BankCard raghab:arrayList)
                        {
                            // Upcasting object to BankCard class 
                            BankCard obj1 = raghab;
                        
                            if(obj1 instanceof CreditCard)
                            {
                                // Downcasting  BankCard object to CreditCard class 
                                
                                CreditCard obj2  = (CreditCard)obj1;
                                 // This if block code will run of the cardId of obj2 is equal to CardId entered in the gui.
                                if(obj2.getCardId()==CardId)
                                {
                                    if(obj2.getBalanceAmount()*2.5>=CreditLimit)
                                    {
                                        // calling the setCreditLImit method of credit card class  to set the credit liimit
                                        obj2.setCreditLimit(CreditLimit,GracePeriod);
                                        // show message dialog box of information message
                                        JOptionPane.showMessageDialog(frameCreditLimit,"sucessfully set credit limit  ","Thank you",JOptionPane.INFORMATION_MESSAGE);
                                        invalidCard= false;
                                    
                                    }
                                    else
                                    {
                                    
                                        invalidCard = false;
                                        JOptionPane.showMessageDialog(frameCreditLimit,"Insufficient Balance\nTry again"," Warning",JOptionPane.WARNING_MESSAGE);
                                    
                                    }
                                }
                    
                            }
                        }
                        if(invalidCard == true)
                        {
                        
                            JOptionPane.showMessageDialog(frameCreditLimit,"Invalid CardID  ","ERROR",JOptionPane.WARNING_MESSAGE);
                            
                        }
                    }
                    else
                    {
                    
                        JOptionPane.showMessageDialog(frameCreditLimit,"Please enter positive values","ERROR",JOptionPane.WARNING_MESSAGE);
                    
                    }
                }
                }
            //catch the exception of try block 
                catch(NumberFormatException e)
                {
        
                    JOptionPane.showMessageDialog(frameCreditLimit,"Invalid field  ","ERROR",JOptionPane.WARNING_MESSAGE);
                    
        
                }    
            }      
        }                        
}       
class Withdraw implements ActionListener
{
    Withdraw()
    {       
            // Initialization of arrays
            String Year[] = {"2020","2021","2022","2023"};
            String Month[] = {"January","February","March","April","May","June","July","August","September","Octuber","November","December"};
            String Day[]={"1","2","3","4","5","6","7"};
        
            lWithdrawlPin = new JLabel("Pin Number");
            tWithdrawlPin  =new JTextField();
            
            
            
            lCardId2 = new JLabel("Card ID");
            tCardId2 = new JTextField();
            
            labelWithdraw = new JLabel("Enter following details to withdraw");
            labelWithdraw.setBounds(160,70,300,30);
            labelWithdraw.setFont(new Font("",Font.PLAIN,18));
            
            lCardId2.setBounds(120,150,120,30);
            lCardId2.setFont(new Font("",Font.BOLD,16));
            tCardId2.setBounds(220,150,150,35);
            
            // Withdrawl amount label and text field
            lWithdrawlAmount=new JLabel("Withdrawl Amount");
            lWithdrawlAmount.setBounds(60,350,150,30);
            lWithdrawlAmount.setFont( new Font("",Font.BOLD,17));
            tWithdrawlAmount = new JTextField();
            tWithdrawlAmount.setBounds(220,350,150,35);
            
            // JLabel and JTextField for Withdrawl pin
            lWithdrawlPin.setBounds(80,450,140,30);
            lWithdrawlPin.setFont(new Font("",Font.BOLD,17));
            tWithdrawlPin.setBounds(220,450,150,35);
            
            
            //JButton for Withdraw amount
            btnWithdrawAmount = new JButton("Withdraw Amount");
            btnWithdrawAmount.setBounds(200,550,150,40);
            btnWithdrawAmount.setBackground(Color.WHITE);
            btnWithdrawAmount.setForeground(Color.BLACK);
            btnWithdrawAmount.setFocusable(false);
            btnWithdrawAmount.addActionListener(this);
            
            //ComboBoxes for Withdrawl Date
            cWithdrawlDateYear = new JComboBox<String>(Year);
            cWithdrawlDateYear.setBounds(0,0,75,40);
            cWithdrawlDateMonth = new JComboBox<String>(Month);
            cWithdrawlDateMonth.setBounds(75,0,75,40);
            cWithdrawlDateDay = new JComboBox<String>(Day);
            cWithdrawlDateDay.setBounds(150,0,75,40);
            
            //JPanel for withdrawl Date
            pWithdrawlDate = new JPanel();
            pWithdrawlDate.setLayout(null);
            pWithdrawlDate.add(cWithdrawlDateYear);
            pWithdrawlDate.add(cWithdrawlDateMonth);
            pWithdrawlDate.add(cWithdrawlDateDay);
            lWithdrawlDate = new JLabel("Withdrawl Date");
            lWithdrawlDate.setFont(new Font("",Font.BOLD,16));
            lWithdrawlDate.setBounds(80,250,120,30);
            pWithdrawlDate.setBounds(220,250,225,40);
            
            
            //Setting JFrame
            frameWithdraw = new JFrame("Withdraw");
            frameWithdraw.add(lWithdrawlDate);
            frameWithdraw.add(pWithdrawlDate);
            frameWithdraw.add(lCardId2);
            frameWithdraw.add(tCardId2);
            frameWithdraw.add(labelWithdraw);
            frameWithdraw.add(lWithdrawlAmount);
            frameWithdraw.add(tWithdrawlAmount);
            frameWithdraw.add(lWithdrawlPin);
            frameWithdraw.add(tWithdrawlPin);
            frameWithdraw.add(btnWithdrawAmount);
            frameWithdraw.setLayout(null);
            frameWithdraw.setBounds(300,10,600,700);
            frameWithdraw.setVisible(true);
            frameWithdraw.setResizable(false);
            frameWithdraw.getContentPane().setBackground(new Color(200, 150, 158));
        
        
    }
         
        public void actionPerformed(ActionEvent e)
        {
        try{
            if(e.getSource()==btnWithdrawAmount)
            {
            
                String DateOfWithdrawl = cWithdrawlDateYear.getSelectedItem()+"/"+cWithdrawlDateMonth.getSelectedItem()+"/"+cWithdrawlDateDay.getSelectedItem();
            
           
                if(tWithdrawlPin.getText().isEmpty() ||DateOfWithdrawl.isEmpty()||tCardId2.getText().isEmpty()||tWithdrawlAmount.getText().isEmpty())
                {
            
              
                    JOptionPane.showMessageDialog(frameWithdraw,"Please fill all the fields","Empty field detected",JOptionPane.WARNING_MESSAGE);
            
            
            
            
                }  
               else
               {
                    int Pin = Integer.parseInt(tWithdrawlPin.getText());    
                    int CardId = Integer.parseInt(tCardId2.getText()); 
                    int WithdrawlAmount = Integer.parseInt(tWithdrawlAmount.getText()); 
                    boolean validCardId = false;
                    if(WithdrawlAmount>0 )
                    {
                    // Iterating  over the arrayList using for each loop for accessing all the objects of an arrayList    
                     for(BankCard object:arrayList)
                     {
                        
                       BankCard obj1 = object;
                        
                        //Checking whether obj1 is an instance of DebitCard
                        if(obj1 instanceof DebitCard )
                        {
                         
                            DebitCard obj2  = (DebitCard)obj1;
                        
                        
                        
                            if (obj2.getCardId()==CardId )
                            {
                                if(obj2.getPinNumber() ==Pin)
                                {
                                    obj2.Withdraw(WithdrawlAmount,DateOfWithdrawl,Pin);
                                    JOptionPane.showMessageDialog(frameWithdraw,"Amount Withdrawn:"+WithdrawlAmount+"\n"+"Available Balance"+obj2.getBalanceAmount(),"Thank You",JOptionPane.INFORMATION_MESSAGE);       
                                    validCardId = true;
                                }
                                else
                                {
                                
                                    validCardId = true;
                                    JOptionPane.showMessageDialog(frameWithdraw,"INVALID PIN","ERROR",JOptionPane.WARNING_MESSAGE);
                                
                                }
                            }
                        }
                    }   
                    if(validCardId == false)
                    {
                        
                
                        JOptionPane.showMessageDialog(frameWithdraw,"Invalid Card-Id","",JOptionPane.WARNING_MESSAGE);
                
                
                    }
                }
                else if(WithdrawlAmount==0)
                {
                    
                    JOptionPane.showMessageDialog(frameWithdraw,"Amount should be more than zero","Transaction cannot be completed",JOptionPane.WARNING_MESSAGE);
                
                }
                else
                {
                
                    JOptionPane.showMessageDialog(frameWithdraw,"Please enter valid amount","Transaction cannot be completed",JOptionPane.WARNING_MESSAGE);
                
                    
                }
                }
            }
        
        
        }
        //
        catch(NumberFormatException d)
        {
        
             JOptionPane.showMessageDialog(frameWithdraw," Please fill all the fields or valid data  ","Empty Field",JOptionPane.WARNING_MESSAGE);
             
        }
        
    }
 }
 // Creating an inner class which implements ActionListener interface
class cancelCreditCard implements ActionListener{
    cancelCreditCard()
    {
        // Initialization of labels, text fields, and buttons
        lCancelCardId = new JLabel("Card Id");
        lCancelCardId.setBounds(130,60,150,30);
        lCancelCardId.setFont(new Font("",Font.BOLD,17));
        tCancelCardId = new JTextField();
        tCancelCardId.setBounds(100,140,150,40);
        tCancelCardId.setBackground(Color.WHITE);
        tCancelCardId.setForeground(Color.BLACK);
        
        btnCancelCreditCard1 = new JButton("Cancel Credit Card");
        btnCancelCreditCard1.setBounds(100,250,150,40);
        btnCancelCreditCard1.setBackground(Color.RED);
        btnCancelCreditCard1.setForeground(Color.BLACK);
        btnCancelCreditCard1.addActionListener(this);
        
        //Intitialization of frame
        frameCancelCreditCard = new JFrame("Cancel Credit Card");
        // set layout of frame
        frameCancelCreditCard.setLayout(null);
        //set position and size
        frameCancelCreditCard.setBounds(300,10,400,400);
        frameCancelCreditCard.add(lCancelCardId);
        frameCancelCreditCard.add(tCancelCardId);
        frameCancelCreditCard.add(btnCancelCreditCard1);
        // Set the background of frame
        frameCancelCreditCard.getContentPane().setBackground(new Color(100-100-100));
        // making frame visible
        frameCancelCreditCard.setVisible(true);
        //making frame non resizable
        frameCancelCreditCard.setResizable(false);
    
    }
    
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==btnCancelCreditCard1)
        {
            try{
                if(tCancelCardId.getText().isEmpty())
                {
                
                    JOptionPane.showMessageDialog( frameCancelCreditCard,"Empty Field"," ",JOptionPane.INFORMATION_MESSAGE);
                        
                }
                else
                {
                    int CardId = Integer.parseInt(tCancelCardId.getText());
                    boolean cardCancelled = false;
                    for(BankCard object:arrayList)
                    {
                        
                        BankCard obj1 = object;
                        
                        if(obj1 instanceof CreditCard)
                        {
                            
                            CreditCard obj2 = (CreditCard)obj1;
                            
                            if(arrayList.isEmpty())
                            {
                            
                                JOptionPane.showMessageDialog(frameCancelCreditCard,"Card doesnot exist"," ",JOptionPane.WARNING_MESSAGE);
                            
                            }
                            
                            else if(obj2.getCardId()==CardId)
                            {
                                // caling cancelCreditCard method of CreditCard class object to cancel the credit card
                                obj2.cancelCreditCard(); 
                                JOptionPane.showMessageDialog(frameCancelCreditCard,"GracePeriod"+obj2.getGracePeriod()+"\n"+"CreditLimit"+obj2.getCreditLimit()+"\n"+"CVC Number: "+obj2.getCvcNumber(), "cancelled",JOptionPane.INFORMATION_MESSAGE);
                                cardCancelled = true;
                                
                            }
                        }
                    }
                    if(cardCancelled==false)
                    {
                        // showing dialog box of warning message
                        JOptionPane.showMessageDialog(frameCancelCreditCard,"Please enter valid card id"," ",JOptionPane.WARNING_MESSAGE);
                
                    }
                }
            }
            // This catch block will catch the exception of try block 
            catch(NumberFormatException a)
            {
                
                JOptionPane.showMessageDialog(frameCancelCreditCard,"Invalid field","Error",JOptionPane.WARNING_MESSAGE);
        
            }
        }

    }
    
    }
    
class displayCreditCard implements ActionListener{
       displayCreditCard(){
           //Initialization of labels
           lDisplayCreditCardId = new JLabel("Card Id");
           lDisplayCreditCardId.setBounds(80,50,150,30);
           lDisplayCreditCardId.setFont(new Font("",Font.BOLD,17));
           
           // Initialization of text field
           tDisplayCreditCardId = new JTextField();
           tDisplayCreditCardId.setBounds(50,100,150,40);
           
           // Initialization of buttons
           btnDisplayCreditCard1 = new JButton("Display CreditCard");
           btnDisplayCreditCard1.setBounds(50,200,150,40);
           btnDisplayCreditCard1.setFocusable(false);
           btnDisplayCreditCard1.setBackground(Color.WHITE);
           btnDisplayCreditCard1.setForeground(Color.BLACK);
           btnDisplayCreditCard1.addActionListener(this);
           
           // Intitialization of JFrame
           frameDisplayCreditCard = new JFrame("Display CreditCard");
           
           // adding all the components the frame
           frameDisplayCreditCard.add(lDisplayCreditCardId);
           frameDisplayCreditCard.add(tDisplayCreditCardId);
           frameDisplayCreditCard.add(btnDisplayCreditCard1);
           frameDisplayCreditCard.setLayout(null);
           frameDisplayCreditCard.setBounds(400,20,300,300);
           frameDisplayCreditCard.setVisible(true);
           
           //
           frameDisplayCreditCard.getContentPane().setBackground(new Color(130-129-100));
        
        
    } 
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==btnDisplayCreditCard1)
        {
           try{ 
               if(tDisplayCreditCardId.getText().isEmpty()){
            
                JOptionPane.showMessageDialog(frameDisplayCreditCard,"Empty Text Field"," ",JOptionPane.WARNING_MESSAGE);
            
            }
            else{
                    int CardId = Integer.parseInt(tDisplayCreditCardId.getText());
                    boolean cardIdExists = false;
                    for(BankCard raghab:arrayList)
                    {
                        
                        BankCard obj1  =raghab;
                        
                        if(obj1 instanceof CreditCard)
                        {
                            
                            CreditCard obj2 = (CreditCard)obj1;
                            
                            if(obj2.getCardId() == CardId)
                            {
                                //calling display method of CreditCard object
                                obj2.Display();
                                cardIdExists= true;
                            
                            
                            }
                        }
                    }
                    if(cardIdExists==false)
                    {
                    
                        JOptionPane.showMessageDialog(frameDisplayCreditCard,"Card Doesnot exists","Sorry",JOptionPane.INFORMATION_MESSAGE);
                    
                    
                    }
            }
            }
            catch(NumberFormatException c)
            {
        
                JOptionPane.showMessageDialog(frameDisplayCreditCard,"Invalid value detected"," ",JOptionPane.WARNING_MESSAGE);
        
            }
        }
    }
}
class displayDebitCard implements ActionListener
{
    displayDebitCard()
    {
        lDisplayDebitCardId = new JLabel("Card Id");
        lDisplayDebitCardId.setBounds(105,80,150,30);
        lDisplayDebitCardId.setFont(new Font(" ",Font.BOLD,17));
        
        tDisplayDebitCardId = new JTextField();
        tDisplayDebitCardId.setBounds(70,120,150,40);
        tDisplayDebitCardId.setBackground(new Color(120-88-77));
        tDisplayDebitCardId.setForeground(Color.BLACK);
        
        
        btnDisplayDebitCard1 = new JButton("Display");
        btnDisplayDebitCard1.setBounds(70,200,150,40);
        btnDisplayDebitCard1.setFocusable(false);
        btnDisplayDebitCard1.setBackground(Color.GRAY);
        btnDisplayDebitCard1.setForeground(Color.BLACK);
        btnDisplayDebitCard1.addActionListener(this);
        
    
        frameDisplayDebitCard = new JFrame("Debit Card Information");
        frameDisplayDebitCard.add(lDisplayDebitCardId);
        frameDisplayDebitCard.add(tDisplayDebitCardId);
        frameDisplayDebitCard.add(btnDisplayDebitCard1);
        frameDisplayDebitCard.setLayout(null);
        frameDisplayDebitCard.setBounds(400,20,300,400);
        frameDisplayDebitCard.getContentPane().setBackground(new Color(133-120-110));
        frameDisplayDebitCard.setVisible(true);
        
    
    }
    //overiding method of ActionListener Interface to generate actionn events
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==btnDisplayDebitCard1)
        {
            try{
                if(tDisplayDebitCardId.getText().isEmpty()){
            
                    JOptionPane.showMessageDialog(frameDisplayDebitCard,"Empty field"," ",JOptionPane.WARNING_MESSAGE);
                    
                }
                else
                {
                    int CardId = Integer.parseInt(tDisplayDebitCardId.getText());
                    boolean cardExists = false;
                    for(BankCard raghab:arrayList)
                    {
                        // Downcasting object (raghab) to BankCard type
                        BankCard obj1 = raghab;
                        
                        if(obj1 instanceof DebitCard)
                        {
                            // 
                            DebitCard obj2 = (DebitCard)obj1;
                            
                            if(obj2.getCardId()==CardId)
                            {
                            
                                obj2.Display();
                                cardExists = true;
                            
                            }
                        }
                    }
                    if(cardExists == false)
                    {
                        // showing dialog box of warning message
                        JOptionPane.showMessageDialog(frameDisplayDebitCard,"Pls enter valid Card_ID","",JOptionPane.WARNING_MESSAGE);
                    
                    
                    }
                }
            }
            // this catch block will catch the exception 
            catch(NumberFormatException b)
            {
                // Showing dialog box
                JOptionPane.showMessageDialog(frameDisplayDebitCard,"Invalid","",JOptionPane.WARNING_MESSAGE);
            
        
            }
        
        }  
    }
}
//main method 
public static void main(String args[])
    {
    //calling BankGUI constructor
     new BankGUI();   
    
    }
}


