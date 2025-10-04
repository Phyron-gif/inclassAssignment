import java.util.Arrays;

public class assignmenOOP {

    

    public static void main(String[] args) {
        /*int[] numbers = {2,5,8,3,4,6,10,15,20,1,11};
        for (int i =0 ; i<= numbers.length-1; i++){
           
            int value = 0;
            value = numbers[i];
            System.out.println(value + " is at index : "+ i);}*/

        
         //task 2
        int[] number = {2,5,8,3,4,6,10,15,20,1,11};
        int temp = 0;
        temp = number[0];
        number[0]= number[1];
        number[1]= temp;
        System.out.println(Arrays.toString(number));

        
        // task 3a sorting in ascending order
         
        int[] numbers = {2,5,8,3,4,6,10,15,20,1,11};
        for (int i=0; i <numbers.length-1; i++){
            int minIndex = i;
            for (int j =i+1; j< numbers.length; j++){
                if( numbers[j]< numbers[minIndex] ){
                    minIndex = j;
                }
                 }
            int temporal = numbers[i];
            numbers[i]= numbers[minIndex];
            numbers[minIndex]= temporal;
        }
       System.out.println(Arrays.toString(numbers));

       //task 3b
        //Descending order
       int[] numberArray = {2,5,8,3,4,6,10,15,20,1,11};
        for (int i=0; i <numberArray.length-1; i++){
            int minIndex = i;
            for (int j =i+1; j< numberArray.length; j++){
                if( numberArray[j]> numberArray[minIndex] ){
                    minIndex = j;
             }
              }
            int temporal3 = numberArray[i];
            numberArray[i]= numberArray[minIndex];
            numberArray[minIndex]= temporal3;
         }
       System.out.println(Arrays.toString(numberArray));

       //task 4 linear search
        int[] linearSearchArray = {2,5,8,3,4,6,10,15,20,1,11};
        int target = 10;
        int index = -1;

        for (int i = 0; i < linearSearchArray.length; i++) {
            if (linearSearchArray[i] == target) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            System.out.println("Found " + target + " at index " + index);
        } else {
            System.out.println(target + " not found");
        }


        //tasks 5 binary search

        int[] binarySearchArray = {2,5,8,3,4,6,10,15,20,1,11};
        int targetNumber = 10;

        for (int i = 0; i < binarySearchArray.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < binarySearchArray.length; j++) {
                if (binarySearchArray[j] < binarySearchArray[minIndex]) {
                    minIndex = j;
                }
            }
            int temporalValue = binarySearchArray[i];
            binarySearchArray[i] = binarySearchArray[minIndex];
            binarySearchArray[minIndex] = temporalValue;
        }

        int left = 0;
        int right = binarySearchArray.length - 1;
        int result = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (binarySearchArray[mid] == targetNumber) {
                result = mid;
                break;
            } else if (binarySearchArray[mid] < targetNumber) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        if (result != -1) {
            System.out.println("Found " + targetNumber + " at index " + result);
        } else {
            System.out.println(targetNumber + " not found");
        }



        
    }
}