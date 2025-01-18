public class Account {
    //Edit Account details
    private String customerName= "Mohamed";
    private int age= 30;
    private String email = "123@gmail.com";
    private String accountCurrency ="USD";
    private int nationalId= 123456789;
    private int accountId= 1234567899;
    private String pincode = "A12";

    public void printAccountDetails(int nationalId, String customerName){
        if (nationalId !=123456789 && customerName !="Mohamed")
            return;
        System.out.println("Customer Name: "+getCustomerName());
        System.out.print("Account ID: "+getAccountId());
        System.out.println("Age: "+getAge());
        System.out.println("Email: "+getEmail());
        System.out.println("National ID: "+ getNationalId());
        System.out.println("Account Currency: "+getAccountCurrency());
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAccountCurrency() {
        return accountCurrency;
    }

    public void setAccountCurrency(String accountCurrency) {
        this.accountCurrency = accountCurrency;
    }

    public int getNationalId() {
        return nationalId;
    }

    public void setNationalId(int nationalId) {
        this.nationalId = nationalId;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }


}
