import java.util.Scanner;
public class Homework01 {
    public static void main(String[] args) {
        double count = 100000;
        int frequency = 0;
        while (count >= 1000) {
            if(count > 50000) {
                count *=0.95;
                frequency++;
            }
            else {
                count -= 1000;
                frequency++;
            }
        }
        System.out.println(frequency);
    }
}

class Homework02 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int num = myScanner.nextInt();
        if(num > 0) {
            System.out.println("正数");
        } else if (num == 0) {
            System.out.println("零");
        } else{
            System.out.println("负数");
        }
    }
}

class Homework03 {
    public static void main(String[] args) {
        int year;
        Scanner scanf = new Scanner(System.in);
        year = scanf.nextInt();
        if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("闰年");
        }
        else{
            System.out.println("不是闰年");
        }
    }
}

class Homework04 {
    public static void main (String[] args) {
        Scanner scanf = new Scanner(System.in);
        int num = scanf.nextInt(),num1,num2,num3;
        num1 = num % 10;
        num2 = num / 10 % 10;
        num3 = num / 10 / 10 % 10;
        if(num == num1*num1*num1 + num2*num2*num2 + num3*num3*num3) {
            System.out.println("是水仙花数");
        }
        else System.out.println("不是水仙花数");
    }
}

//如果第二个if 不在第一个if里在运行到24时 因为第一个不运行 judgment不增加再次换行；
class Homework06 {
    public static void main(String[] args) {
        int num = 1;
        int judgment = 0;
        for(;num<101;num++) {
            if (num % 5 != 0) {
                System.out.print(num +"\t");
                judgment++;
                if (judgment % 5 == 0) {
                    System.out.println();
                }
            }
        }
    }
}

class Homework07 {
    public static void main(String[] args) {
        char char1 = 'a',char2 = 'Z';
        for (int i = 0;i < 26;i++) {
            System.out.print(char1 + "\t");
            char1 += 1;
        }
        System.out.println();
        for (int i = 0;i < 26;i++) {
            System.out.print(char2 + "\t");
            char2 -= 1;
        }
    }
}

class Homework08 {
    public static void main(String[] args) {
        double sum = 0;
        for(double i = 1;i < 101; i++) {
            sum += (1 / i);
            sum = -1 * sum;
        }
        System.out.println(sum);
    }
}

class Homework09 {
    public static void main(String[] args) {
        int num = 0,sum = 0;
            for (int j = 1;j < 101;j++) {
                num += j;
                sum += num;
            }
        System.out.println(sum);
    }
}