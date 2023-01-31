public class ArrayExercise {
    public static void main(String[] args) {
        int array[] = new int[10];
        int max = 0, index = 0;
        for (int i = 0; i < 10; i++) {
            array[i] = (int) (Math.random() * 100);
            System.out.print(array[i] + "\t");
        }
        for (int i = 0; i < 10; i++) {
            if (max < array[i]) {
                max = array[i];
                index = i;
            }
        }
        System.out.println("\n" + index);
    }
}
