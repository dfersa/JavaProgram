public class LogicalOperator {
    public static void main(String[] args) {
        int n1 = 1,a2 = 2, a3 = 3;
        int max;
        max = n1>a2 ? n1:a2;
        max = max>a3?max:a3;
        System.out.println(max);
    }
}
