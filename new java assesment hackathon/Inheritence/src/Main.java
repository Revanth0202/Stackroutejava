import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name :");
        String name1=sc.nextLine();
        System.out.println("Enter Date of Birth :");
        String dob=sc.nextLine();
        System.out.println("Enter Gender :");
        String gen= sc.nextLine();
        System.out.println("Enter Mobile Number :");
        String num=sc.nextLine();
        System.out.println("Enter Blood Group :");
        String bgroup=sc.nextLine();
        System.out.println("Enter Blood Bank Name :");
        String bbank=sc.nextLine();
        System.out.println("Enter Donor Type :");
        String dtype=sc.nextLine();
        System.out.println("Enter Donation Date :");
        String ddate=sc.nextLine();
        Donor p=new Donor();
        p.setDateofbirth(dob);
        p.setBloodgroup(bgroup);
        p.setGender(gen);
        p.setName(name1);
        p.setMobilenumber(num);
        p.setBloodbankname(bbank);
        p.setDonationtype(ddate);
        p.setDonartype(dtype);
        p.displayDonationDetails();


    }
}