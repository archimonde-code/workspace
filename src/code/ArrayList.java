package code;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

public class ArrayList {
    public static void main(String[] args){
        int[] myArrayList = {10, 9, 15, 8, 24, 36, 42, 56, 1, 99};
        System.out.println("选择排序：");
        arraySort(myArrayList);
        traverse(myArrayList);
        System.out.println();
        System.out.println("冒泡排序");
        bubbleSort(myArrayList);
        traverse(myArrayList);
        System.out.println();
        Arrays.sort(myArrayList);
        traverse(myArrayList);
        doubleArray();
    }
    /*
    * 遍历数组*/
    public static void traverse(int @NotNull  [] myArray){
        for (int j : myArray) {
            System.out.print(j + " ");
        }
    }
    /*
    * 获取数组最大值*/
    public static int arrayList(int @NotNull [] myArray){
        int max = myArray[0];
        for(int i = 1; i < myArray.length; i++){
            System.out.println("myArrayList["+ i + "]" + "=" +myArray[i]);
            if (myArray[i] > max) {
                max = myArray[i];
            }
        }
        return max;
    }

    /*
    * 选择排序*/
    public static int[] arraySort(int[] myArray){
        int[] copyArray = Arrays.copyOf(myArray, myArray.length);
        for(int x = 0; x < myArray.length - 1; x++){
            int min = x;
            for (int y = x + 1; y < myArray.length; y++){
                if (myArray[min] > myArray[y]){
                    min = y;
                }
            }
            if (myArray[x] > myArray[min]){
                int temp = myArray[x];
                myArray[x] = myArray[min];
                myArray[min] = temp;
            }
        }
        return copyArray;
    }
    /*
    * 冒泡排序*/
    public static void bubbleSort(int[] myArray){
        for (int i = 0; i < myArray.length - 1; i++){
            for (int x = 0; x < myArray.length - 1 - i; x++){
                if(myArray[x] > myArray[x + 1]){
                    int temp = myArray[x];
                    myArray[x] = myArray[x + 1];
                    myArray[x + 1] = temp;
                }
            }
        }
    }
    public static void doubleArray(){
        int[][] arrays = {{1,2,3,4,5},{5,4,3,2,1},{6,7,8,9,10},{10, 9, 8, 7, 6, 5}};
        for (int[] array : arrays) {
            for (int y = 0; y < arrays[1].length; y++) {
                System.out.print(array[y] + " ");
            }
        }
    }
}
