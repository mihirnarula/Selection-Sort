// selection sort of a 1D array
package selectionsort2;
import java.util.*;
public class Selectionsort2 {

    
    public void sorting(int array[]) {
        for (int j = 0; j < 10; j++) {
            for (int x = j; x <= 9; x++) {
                int min = array[j];
                if (min >= array[x]) {
                    int temp = array[j];
                    array[j] = array[x];
                    array[x] = temp;

                }

            }

        }
    }
    
    
    public static void main(String[] args) {

        int array [] = new int[10];
        Scanner ob = new Scanner (System.in);
        Selectionsort2 obj = new Selectionsort2();
        System.out.println("Please enter the array elements");
        for(int i =0;i<10;i++){
            array[i]=ob.nextInt();
        }

 obj.sorting(array);
        System.out.println("");
        for(int k =0;k<10;k++){
            System.out.println(array[k]);
    }
    
    }
}

