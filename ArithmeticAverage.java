import java.util.Scanner;
class ArithmeticAverage {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

            int[] arr = new int[5];

            for(int i = 0; i < arr.length; ++i){
                arr[i] = scanner.nextInt();
            }
            int AddEllementCount = 0;
            int MullEllementCount = 1;

        for (int j : arr) {
            AddEllementCount = AddEllementCount + j;
            MullEllementCount = MullEllementCount * j;
        }
        System.out.println((AddEllementCount + MullEllementCount) / 2);
    }
}
