import java.time.Instant;

import java.util.Random;


public class BubblevsSelection {


    public static void main(String[] args) {

        calculateBubbleSort();
        calculateSelectionSort();

    }

    private static void calculateSelectionSort() {
        Random random = new Random();
        float total_time = 0;

        System.out.println("The time starting the bubble sort program is "+Instant.now());

        //creates one thousand, five thousand length arrays with random values
        for(int j=0;j<1000;j++){
            long running_time = System.currentTimeMillis();

            //create array
            int arrayThousand[] = new int[5000];
            for (int i = 0; i < arrayThousand.length; i++) {
                arrayThousand[i] = random.nextInt(1000) + 1;
            }
            //sorts the array
            selection_sort(arrayThousand);
            long end_time =  System.currentTimeMillis();

            total_time += end_time-running_time;
        }
        System.out.println("Selection sort took on average " + total_time/1000 + " seconds");
    }

    private static void calculateBubbleSort() {
        Random random = new Random();
        float total_time = 0;

        System.out.println("The time starting the selection sort program is "+Instant.now());

        //creates one thousand, five thousand length arrays with random values
        for(int j=0;j<1000;j++){
            long running_time = System.currentTimeMillis();

            //create array
            int arrayThousand[] = new int[5000];
            for (int i = 0; i < arrayThousand.length; i++) {
                arrayThousand[i] = random.nextInt(1000) + 1;
            }
            //sorts the array
            bubble_sort(arrayThousand);
            long end_time =  System.currentTimeMillis();

            total_time += end_time-running_time;
        }
        System.out.println("Bubble sort took on average " + total_time/1000 + " seconds");
    }

    public static String bubble_sort(int array[]) {
        int length = array.length;
        int temp;


        for (int j = length; j > 0; j--) {
            for (int i = 1; i < j; i++) {

                if (array[i - 1] > array[i]){
                    temp = array[i - 1];
                    array[i - 1] = array[i];
                    array[i] = temp;
                }

            }
        }
        return "bubble sort complete";
    }



    public static String selection_sort(int array[]){
        int length = array.length;

        int i,j, iMin, temp;
        for(j = 0; j < length; j++){

            iMin = j;
            for ( i = j+1; i < length; i++) {
                if (array[i] < array[iMin]) {
                    iMin = i;
                }
            }

            if ( iMin != j ) {
                temp = array[j];
                array[j] = array[iMin];
                array[iMin] = temp;
            }
        }
        return "selection sort complete";
    }

}