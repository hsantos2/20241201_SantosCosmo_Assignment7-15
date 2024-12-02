
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input= new Scanner(System.in);
        //Create array with a length of 10
        int[] numbers= new int[10];

        //Prompt user to enter 10 numbers
        System.out.print("Enter ten numbers: ");
        for(int i=0; i<numbers.length; i++)
            numbers[i]=input.nextInt();

        //Remove duplicates
        int[] distinctNumbers=eliminateDuplicates(numbers);
        
        //Display results
        System.out.print("The distinct numbers are: ");
        for(int e: distinctNumbers){
            if(e>0)
            System.out.print(" "+ e);
        }
        System.out.println();
    }

    //Create new array that eliminated duplicates
    public static int[] eliminateDuplicates(int[] list){
        int[] distinctList= new int[list.length];
        int i=0;
        for(int e:list){
            if (linearSearch(distinctList,e)==-1){
                distinctList[i]=e;
                i++;
            }
        }
        return distinctList;
    }

    private static int linearSearch(int[] array, int key) {
        for(int i=0; i< array.length; i++){
            if(key==array[i])
            return i;
        }
        return -1;
    }

}
