class Bank{
    public static void main(String [] args){
        // initializing static variables
        BankAccount.bankName    = "Bank of India";
        BankAccount.branchName  = "Hazaribagh";
        BankAccount.ifscCode    ="HZB5880008";

        // creating an instances of BankAccount , 
        BankAccount acc1 = new BankAccount();
        BankAccount acc2 = new BankAccount();

        // initializing acc1 with AP object values
        acc1.accNumber=588787873333L;
        acc1.accHName = "AP";
        acc1.balance  =70000;
        System.out.println("Account 1 has been initialized with AP object values");


        //initializing acc2 with BP object values
        acc2.accNumber =878756554444L;
        acc2.accHName  ="BP";
        acc2.balance   =500000;

        System.out.println("Account 2 has been initialized with BP object values");
        System.out.println();

        // Accessing their object values 
        System.out.println("Account 1 information");
        System.out.println("Bank Name\t\t:\t\t"              + acc1.bankName);
        System.out.println("Branch Name\t\t:\t\t"            + acc1.branchName);
        System.out.println("IFSC code\t\t:\t\t"              + acc1.ifscCode);
        System.out.println("Account Number\t\t:\t\t"         + acc1.accNumber);
        System.out.println("Account holder name\t:\t\t"    + acc1.accHName);
        System.out.println("Balnace available\t:\t\t"      + acc1.balance);
        
        System.out.println();
        System.out.println("Account 2 information");
        System.out.println("Bank Name\t\t:\t\t"               + acc2.bankName);
        System.out.println("Branch Name\t\t:\t\t"             + acc2.branchName);
        System.out.println("IFSC code\t\t:\t\t"               + acc2.ifscCode);
        System.out.println("Account Number\t\t:\t\t"          + acc1.accNumber);
        System.out.println("Account holder name\t:\t\t"     + acc1.accHName);
        System.out.println("Balnace available\t:\t\t"       + acc1.balance);


    }
}