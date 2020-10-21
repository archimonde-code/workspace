public class circulation {
    public static void main(String[] args){

    }
    public class WhileCirculation{
        public void whileCirculation(){
            int sum = 0;
            int i = 1;
            while (i <= 10){
                sum = sum + i;
                i++;
            }
            System.out.println("1~10的累加之和为：" + sum);
        }

        public int circulation(){
            int x = 1;
            int count = 0;
            while (x <= 100){
                if(x % 6 == 0){
                    System.out.println("count=" + count);
                }
            }
            return count;
        }
    }
    public class ForCirculation{
        public void forCirculation(){
            //打印5行递增三角形的*号图案
            for(int x = 1; x <= 5; x++){
                for (int y = 1; y <= x; y++){
                    System.out.print("*");
                }
                System.out.println();
            }
            //-----------------------------------------
            //打印九九乘法表
            for (int x = 1; x < 10; x++){
            for (int y = 1; y <= x; y++){
                System.out.print(y + " * " + x + " = " + (x * y) + "\t");
            }
            System.out.println();
            }
            //打印倒三角形
            for(int x = 1; x <= 5; x++){
                for(int y = 1; y < x; y++){
                    System.out.print(" ");
                }
                for (int z = x; z<=5; z++){
                    System.out.print("* ");
                }
                System.out.println();
        }

        }
    }
}

