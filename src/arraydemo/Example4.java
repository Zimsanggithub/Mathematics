package arraydemo;

public class Example4 {
    public static void main(String[] args) {
       // int arr[][] = new int [4] [4];

        int arr[][] = {{3, 6, 8, 7},
                     {5, 9, 4, 1},
                     {6, 2, 1, 5}};

//        System.out.print(arr[0][0] + " ");
//        System.out.print(arr[0][1] + " ");
//        System.out.print(arr[0][2] + " ");
//        System.out.print(arr[0][3] + " ");
//
//        System.out.println();git
//
//        System.out.print(arr[1][0] + " ");
//        System.out.print(arr[1][1] + " ");
//        System.out.print(arr[1][2] + " ");
//        System.out.print(arr[1][3] + " ");
//
//        System.out.println();
//
//        System.out.print(arr[2][0] + " ");
//        System.out.print(arr[2][1] + " ");
//        System.out.print(arr[2][2] + " ");
//        System.out.print(arr[2][3] + " ");

        for(int row = 0; row < 4; row ++) {
            for (int col = 0; col < 4; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
    }
}
