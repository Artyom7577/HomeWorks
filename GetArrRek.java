class GetArrRek {
    private static int ArrRec(int n){
        if(n < 0){
            return -3;
        }
        int[] Arr = {1, 66, 3, 22, 88, 33, 44, 66, 7, 11};

            System.out.print(Arr[n] + " ");
            return ArrRec(n-1);

    }

    public static void main(String[] args) {
        ArrRec(9);
    }
}
