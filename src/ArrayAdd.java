import java.util.Scanner;
public class ArrayAdd {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3};
        String judgment = " ";
        Scanner object = new Scanner(System.in);
        do {
            int[] arrnew = new int[arr1.length + 1];
            for(int i = 0;i < arr1.length;i++) {
                arrnew[i] = arr1[i];
            }
            System.out.println("请输入您想添加的数");
            int addnum = object.nextInt();
            arrnew[arr1.length] = addnum;
            arr1 = arrnew;
            System.out.println("请输入是否继续\n 是 ：y\t 否：n");
            judgment = object.next();
        }while (judgment.equals("y"));
        System.out.println("数组最后长度为：" + arr1.length);
    }
}

class ArrayReduce {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3};
        Scanner object = new Scanner(System.in);
        char jud = 'a';
        do {
           int[] arrnew = new int[arr1.length - 1];
           for(int i = 0;i < arr1.length - 1;i++) {
               arrnew[i] = arr1[i];
           }
           arr1 = arrnew;
           System.out.println("请输入是否继续 y/n");
           jud = object.next().charAt(0);
           if (arr1.length == 1) {
               System.out.println("已到最小值");
               break;
           }
           if (jud == 'n') {
               break;
           }
        }while(true);
        System.out.println("你跳出了循环");
    }
}