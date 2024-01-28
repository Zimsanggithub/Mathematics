package arraydemo;

public class Example2 {
    //finding repeated number
    public static void main(String[] args) {
        int arr[] = {10, 12, 1, 10, 16, 10, 25, 10};
        int target = 10;
        int result = findOccurances(arr, target);
        System.out.println("The occurances of the target :" + target + " is " + result);
    }

    static int findOccurances(int arr[], int target) {
       // arr: [10, 12, 1, 10, 25, 10]
        int count = 0;


        for (int i = 0; i < arr.length; i++) { //arr: [10, 12,1,10,16,25,10]

            if (arr[i] == target) {
                count++;
            }
        }
        return count;
    }
}















