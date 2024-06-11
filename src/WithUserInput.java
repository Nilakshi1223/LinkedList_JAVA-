import java.util.LinkedList;
import java.util.Scanner;

public class WithUserInput {
    public static void main(String[] args) {
        LinkedList<String> userinputs = new LinkedList<String>();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements for your int array : ");
        int numberOfElements = sc.nextInt();

        System.out.print("Enter your array elements : ");

        for (int i = 0 ; i <= numberOfElements ; i++){
            String j = sc.nextLine(); // get user input
            userinputs.add(j);
        }

        System.out.println("Array : " + userinputs); // print array

        System.out.println("Enter index for remove : ");
        String removeElement = sc.nextLine();

        userinputs.remove(removeElement); // remove array element
        System.out.println("Array : " + userinputs);

        System.out.println("Enter element for add last of the array : ");
        String addElement = sc.nextLine();

        userinputs.addLast(addElement); // add element in the last of array
        System.out.println("Array : " + userinputs);
        
    }
}
