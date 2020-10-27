package code;

import java.util.Arrays;

public class ObjectFile {
    public static void main(String[] args){
        int[] arrayList = {1,2,3,45,6,89,99};
        NewObject classes = new NewObject();
        classes.getArray(arrayList);
        System.out.println();
        System.out.println(classes.getArray(arrayList).length);
    }
}
class NewObject{
    public int[] getArray(int[] arrayList){
        for (int i : arrayList) {
            System.out.print(i + " ");
        }
        Arrays.sort(arrayList);
        return arrayList;
    }
}