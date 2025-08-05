// class arrays {
//     public static void main(String args[]){
//         int marks[] = {67, 98, 85};
//         for(int i=0; i<=3; i++){
//         System.out.println(marks[i]);
//         }
//     }
// }

// import java.util.*;
// class arrays{
// public static void main(String args[]) {
//     Scanner sc = new Scanner(System.in);
//     int size = sc.nextInt();

//     int number[] =new int[size];

//     //input
//     for(int i=0; i<size; i++){
//         number[i]=sc.nextInt();
//     }

//     //output
//     for(int i=0; i<size; i++){
//         System.out.println(number[i]);
//     }
    
//     }
// }


// enter num and find index
// import java.util.*;
// class arrays{
// public static void main(String args[]) {
//     Scanner sc = new Scanner(System.in);
//     int size = sc.nextInt();

//     int number[] =new int[size];

//     //input
//     for(int i=0; i<size; i++){
//         number[i]=sc.nextInt();
//     }

//     int x = sc.nextInt();

//     //output
//     for(int i=0; i<number.length; i++){
//         if(number[i] == x){
//             System.out.println(i);
//         }
//     }
    
//     }
// }

// class sum{
//     public static void main(String[] args) {
//         int num[]= {34,56,23,76,56};
//         int sum=0;
//         for(int nums:num){
//             sum += nums;
//         }
//         System.out.println(sum);
//     }
// }

// class twodarray{
//     public static void main(String[] args) {
//     int marks[][]={
//         {18,45,23},
//         {34,67,98},
//         {56,78,55},
//         {67,98,34},
//     };
//     System.out.print(marks[2][2]);
// }
// }


import java.util.Scanner;

// class twoDarray{
//     public static void main(String[] args) {
        
//         Scanner sc = new Scanner(System.in);
//         System.out.print("enter rows:");
//         int rows=sc.nextInt();
//         System.out.print("enter cols:");
//         int cols=sc.nextInt();

//         int matrix[][]= new int[rows][cols];

//         //input loop
//         for(int i=0; i<rows; i++){
//             for(int j=0; j<cols; j++){
//                 matrix[i][j]=sc.nextInt();
//             }
//         }

//         // for(int i=0; i<rows; i++){
//         //     for(int j=0; j<cols; j++){
//         //         System.out.print(matrix[i][j]+" ");
//         //     }System.out.println();
//         // }

//         int x=sc.nextInt();

//         for(int i=0; i<rows; i++){
//             for(int j=0; j<cols; j++){
//                 if(matrix[i][j] == x){
//                     System.out.println("Found at row " + i + ", column " + j);

//                 }
//             }
//         }

//     }
// }

// class fa{
//     public static void main(String[] args) {
//         float arr[] = {2.3f, 4.6f, 5.6f, 9.8f, 1.7f};
//         float sum=0;
//         for(float i=0; i<10; i++ ){
//             sum += i;
//         }System.out.println(sum);
//     }
// }

// class find{
//     public static void main(String[] args) {
//         int num[]={23,56,34,89,76};
//         int x=23;
//         for(int i=0; i<5; i++){
//             System.out.println(num[i]);
//         }
//     }
// }

// class useinp{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int size = sc.nextInt();
//         int numbers[] = new int[size];

//         //input
//         for(int i=0; i<size; i++){
//             numbers[i]=sc.nextInt();
//         }

//         //output
//         for(int i=0; i<size; i++){
//             System.out.println(numbers[i]);
//         }
//     }
// }

class findX{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int number[] = new int[size];
        
        //input
        for(int i=0; i<size; i++){
            number[i]=sc.nextInt();
        }
        System.out.println("enter x: ");
        int x = sc.nextInt();

        for(int i=0; i<number.length; i++){
            if(number[i] == x){
                System.out.println("index"+i);
            }
        }
    }
}