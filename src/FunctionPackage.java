import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FunctionPackage {
    public static void main(String[] args){

        int[] listes = {91, 82, 34, 46, 53, 10};
        System.out.println("排序前的id：" + listes);
        Arrays.sort(listes);

        for(int i = 0; i < listes.length; i++){
            // 遍历当前数组
            System.out.println(listes[i]);

        }
        List <Integer> liste = new ArrayList<Integer>();
        liste.add(56);
        liste.add(89);
        liste.add(139);

        System.out.println(liste);
    }
}
