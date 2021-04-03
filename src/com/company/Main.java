package com.company;
import  java.util.Scanner;
public class Main {
    /*static int count = 0;
    static String arr[][] = new String[2][2];
    static boolean narr[][] = new boolean[2][2];

    public static void inputFriend () {
        Scanner obj = new Scanner(System.in);

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j <2; j++) {
                System.out.print("Is row = " + i + " & Col = " + j
                        + " are friends(\"*\" for friend & press enter for not friend ) ? : ");
                arr[i][j] = obj.nextLine();//  * *   *
                if (!arr[i][j].equals("1")) arr[i][j]="0" ;//= " ";
             *//* else*//*   narr[i][j] = arr[i][j].equals("1");
            }
        }
        System.out.println();
        System.out.println("The friend/not friend table : ");
        System.out.println();
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                //       1,3  3,1   3,3
                if (narr[i][j] == narr[j][i] && i!=j ) narr[i][j]  = false;
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
    }

    public static void countFriend () {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                if (narr[i][j]) count++;
            }
        }
        System.out.println("Number of Friends : " + count);
    }
    public static void main(String[] args) {
            inputFriend();
            countFriend();
        }

    }
*/
  /*  static int count = 0;
    static boolean arr[][] = new boolean[5][5];

    public static void inputFriend(){
        Scanner obj = new Scanner(System.in);

        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                System.out.print("Is row = " + i + " & Col = "+ j
                        +" are friends(true/false) ? : ");
                arr[i][j] = obj.nextBoolean();
            }
        }
        System.out.println();
        System.out.println("The friend/not friend table : ");
        System.out.println();


        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                if(arr[i][j]) System.out.print("*" + " ");
                else System.out.print("  ");
                if(arr[i][j] == arr[j][i] && i != j) arr[i][j] = false;
            }
            System.out.println();
        }

    }

    public static void countFriend(){
        for(int i = 0; i < 5; i ++){
            for(int j = 0; j < 5; j++){
                if(arr[i][j]) count++;
            }
        }
        System.out.println("Number of Friends : "+ count);
    }

    public static void main(String[] args) {
        inputFriend();
        countFriend();
    }
}*/

//=================transpose matrix=====================
    /*public static void main(String[] args) {
        int arr[][] = {{5, 2,}, {6, 2}};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("for trajetive matrix");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[j][i]+ " ");
            }
            System.out.println();
        }

    }
    }*/

////==================matrix add=====================================
    /*public static void main(String[] args) {
      int arr[][]={{5, 2,}, {6, 2}};
      int arr2[][]={{6,5},{6,9}};
      int arr3[][]=new int[2][2];
        System.out.println("A metrix : ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("B metrix : ");
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length; j++) {
                    System.out.print(arr2[i][j] + " ");
                }
                System.out.println();

            }

        System.out.println("C= A+B metrix : ");
      for (int i=0;i<arr.length;i++){
          for (int j=0;j< arr.length;j++){
             arr3[i][j]=arr[i][j]+arr2[i][j];
              System.out.print(arr3[i][j]+" ");
          }
          System.out.println();
      }


    }}*/

///////////================matrix multiplication=============================

    public static void main(String[] args) {
        int arr[][] = {{5, 2,}, {6, 2}};
        int arr2[][] = {{6, 5}, {6, 9}};
        int arr3[][] = new int[2][2];
        System.out.println("A metrix : ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("B metrix : ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();

        }

        System.out.println("C= A*B metrix : ");

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                 arr3[i][j]=0;
                arr3[i][j] += arr[i][j] * arr2[i][j]+arr[i][j] * arr2[i][j];
                System.out.print(arr3[i][j] + " ");
            }
            System.out.println();
        }
    }
}