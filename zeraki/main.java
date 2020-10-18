package zeraki;

import java.util.Arrays;
import java.util.Scanner;

class Zeraki{
    public static void main(String[] args){  
              
        // Example 1
        FindMissing missing = new FindMissing();

        //To test with different values
        int[] arr = {8, 6, 7, 5}; // <- Change here.

        System.out.println("Example to show missing number.");
        System.out.println("Passed sequence of numbers is "+ Arrays.toString(arr));

        int missing_no = missing.findMissing(arr);
        if (missing_no == -10000){
            System.out.println("The is no missing number.");
        }else{
            System.out.println("The missing number is " + missing_no);
            
        }
        
        // Example 2
        Reverse reverseByFour = new Reverse();
        System.out.println("Let us go to the second example.");
        System.out.println("Enter a word to reverse");
        Scanner myObj = new Scanner(System.in);
        String to_reverse = myObj.nextLine();

        System.out.println("Reverse word by how many letters?");
        String by_howmany = myObj.nextLine();

        System.out.println(to_reverse+ " reversed by " +by_howmany +" letters is "+  reverseByFour.reverse(to_reverse, Integer.parseInt(by_howmany)));
    }
}