import java.util.Scanner;

public class Array {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter n :");
        int n=sc.nextInt();
        int [] arr=new int[n];
        String[] answer=new String[n];
        System.out.println("Enter numbers :");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter strings :");
        for(int j=0;j<n;j++)
        {
            answer[j]=sc.nextLine();
        }
        sc.close();
        System.out.println("Displaying Numbers");
        for (int i : arr) {
            System.out.println(i);
        }
        System.out.println("Displaying strings");
        for (String s : answer) {
            System.out.println(s);
        }
    }


}
