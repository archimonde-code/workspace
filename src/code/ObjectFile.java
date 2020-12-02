package code;

import java.util.Arrays;

public class ObjectFile {
    public static void main(String[] args){
        /*
         *成员变量与局部变量的区别：
         * 1、
         * 成员变量定义在类中，整个类都可以访问；
         * 局部变量定义在函数、语句、代码块中，只在定义范围内生效
         * 2、
         * 成员变量存在堆内存中的对象中
         * 局部变量存在栈内存的方法中
         * 3、
         * 成员变量随对象的创建而存在，随对象的消失而消失
         * 局部变量随所属区域的执行而存在，随所属区域的结束而释放
         * 4、
         * 成员变量都有默认的初始化值
         * 局部变量没有默认的初始化值
         */
        int[] arrayList = {1,2,3,45,6,89,99};
        NewObject classes = new NewObject();
        classes.getArray(arrayList);
        System.out.println();
        System.out.println(classes.getArray(arrayList).length);
    }
}

class NewObject{
    /*
    *构造函数和一般函数的区别：
    * 构造函数：对象创建时就会调用与之对应的构造函数，对对象进行初始化；
    * 一般函数：只有对象创建后，需要调用时，才会被调用；
    * 构造函数：对象创建时只会调用一次
    * 一般函数：对象创建后，可以被多次调用
    * */
    public int[] getArray(int[] arrayList){
        for (int i : arrayList) {
            System.out.print(i + " ");
        }
        Arrays.sort(arrayList);
        return arrayList;
    }

}