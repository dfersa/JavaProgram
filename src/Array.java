import static java.lang.Math.random;

public class Array {
    public static void main(String[] args) {
        char num1[] = new char[26];
        for (int i = 0 ; i < 26;i++) {
            num1[i] = (char)('A' + i);
            System.out.print(num1[i] + "\t");
        }

    }
}
