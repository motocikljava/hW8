public class Main {
    public static void main(String[] args) {
        // задание 1
        int[] arr = generateRandomArray();
    }
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int minCashe = 5;
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
            //задание 3
            if (arr[i] < arr[i] + 1) {
                minCashe = arr[i];
            }
        }
        System.out.println(minCashe);

        return arr;
    }
}





