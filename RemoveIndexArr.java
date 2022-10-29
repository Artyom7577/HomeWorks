import java.util.Arrays;
import java.util.Scanner;

class RemoveIndexArr {

    private static int[] RemoveEllement(int[] arr, int index){

        if(arr == null || index < 0 || index >= arr.length){
            return arr;
        }

        int[] AnotherArr = new int[arr.length -1];
        for(int i = 0, k = 0; i < arr.length; i++){

            if(i == index){
                continue;
            }
            AnotherArr[k++] = arr[i];
        }
        return AnotherArr;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80};
        System.out.println(Arrays.toString(arr));

        System.out.print("Enter Index ArrEllement that you need Delete:----> ");

        int index = scanner.nextInt();

        arr = RemoveEllement(arr, index);
        System.out.println(Arrays.toString(arr));
    }
}
