public class Main {
    public static void main(String[] args) {
        // задание 1
        int[] arr = generateRandomArray();
    }
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int sum = 0;
        int maxCashe = 5;
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
            sum = sum + arr[i];
            //задание 2
            if (arr[i] > maxCashe) {
                maxCashe = arr[i];
            }
        }
        System.out.println(maxCashe);
        System.out.println("Сумма затрат за месяц составила " + sum + " рублей");

        return arr;
    }

}





