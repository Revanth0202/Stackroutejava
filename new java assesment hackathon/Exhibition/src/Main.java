
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter choice");
        System.out.println("1.Exhibition");
        System.out.println("2.Stage Event");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        if(n!=1 && n!=2){
            System.out.println("Invalid input");
            return;
        }
        System.out.println("Enter details in CSV format");
        String s = sc.nextLine();
        String[] arr = s.split(",");
        if(arr.length!=6){
            System.out.println("Invalid input");
            return;
        }else {
            if (n == 1) {
                Exhibition event = new Exhibition(arr[0], arr[1], arr[2], arr[3], Integer.parseInt(arr[4]), Double.parseDouble(arr[5]));
                System.out.println("Exhibition Details");
                System.out.println("Event name : " + event.getName());
                System.out.println("Detail : " + event.detail);
                System.out.println("Type : " + event.getType());
                System.out.println("Organizer : " + event.getOrganizer());
                System.out.println("Total Cost : " + Math.round(event.calculateAmount() * 10.0) / 10.0);


            }
            if (n == 2) {
                StageEvent event = new org.ness.StageEvent(arr[0], arr[1], arr[2], arr[3], Integer.parseInt(arr[4]), Double.parseDouble(arr[5]));
                System.out.println("Stage Event Details");
                System.out.println("Event name : " + event.getName());
                System.out.println("Detail : " + event.detail);
                System.out.println("Type : " + event.getType());
                System.out.println("Organizer : " + event.getOrganizer());
                System.out.println("Total Cost : " + Math.round(event.calculateAmount() * 10.0) / 10.0);
            }
        }
    }
}
