import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ItemType itemtype=new ItemType();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the item type name");
        String name1=sc.nextLine();
        System.out.println("Enter the cost per day");
        Double costperday1=sc.nextDouble();
        System.out.println("Enter the deposit");
        Double deposit1=sc.nextDouble();
        itemtype.getName();
        itemtype.setName(name1);
        itemtype.getCostPerDay();
        itemtype.setCostPerDay(costperday1);
        itemtype.getDeposit();
        itemtype.setDeposit(deposit1);
        itemtype.display();
    }
}