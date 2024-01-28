package arraydemo;

public class Example3 {
    //finding maximum number

    public static void main(String[] args) {
        int arr[] = {43, 100, 105, 67, 88, 95, 60};
        int maximumNum = findMax(arr);
        System.out.println("The maximum number is" + maximumNum);
    }

    private static int findMax(int[] arr) {//arr: 43, 100, 105, 67, 88, 95, 60}
        int max = arr[0]; //arr: 3, 100, 105, 67, 88, 95, 60

        for (int i =0 ; i < arr.length; i++) {
            if(arr[i] > max) {
            max = arr[i];

            }
        }
        return max;
    }


}
