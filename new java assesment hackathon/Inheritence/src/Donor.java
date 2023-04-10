public class Donor extends Person{
    private String bloodbankname;
    private String donartype;
    private String donationtype;

    public void setBloodbankname(String bloodbankname) {
        this.bloodbankname = bloodbankname;
    }

    public void setDonationtype(String donationtype) {
        this.donationtype = donationtype;
    }

    public void setDonartype(String donartype) {
        this.donartype = donartype;
    }

    public String getBloodbankname() {
        return bloodbankname;
    }

    public String getDonartype() {
        return donartype;
    }

    public String getDonationtype() {
        return donationtype;
    }
    public void displayDonationDetails()
    {
        System.out.println("Donation Details :");
        System.out.println("Name :"+ this.getName());
        System.out.println("Date of birth :"+this.getDateofbirth());
        System.out.println("Gender :"+this.getGender());
        System.out.println("Mobile :"+this.getMobilenumber());
        System.out.println("Blood group :"+this.getBloodgroup());
        System.out.println("Blood bank Name :"+this.bloodbankname);
        System.out.println("Donar type :"+this.donartype);
        System.out.println("Donation Date :"+this.donationtype);
    }

}

