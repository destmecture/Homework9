public class Main {
    public static void main(String[] args) {

        System.out.println("Task 1");

        int arr[] = generateRandomArray();
        int totalPaid = 0;
        for (int i = 0; i < arr.length; i++) {
            totalPaid += arr[i];
        }
        System.out.println("Сумма трат за месяц составила  " + totalPaid + " рублей");

        System.out.println("Task 2");

        int maxCache = 0;
        int minCache = 0;

        for (int current : arr) {
            if (current > maxCache) {
                maxCache = current;
            } else {
                minCache = current;
            }

        }
        System.out.println("Минимальная сумма трат за день составила " + minCache + " рублей. Максимальная сумма трат за день составила " + maxCache + " рублей");

        System.out.println("Task 3");

        float sum = 0;
        for (int i : arr) {
            sum += i;
        }
        System.out.println("Средняя сумма трат за месяц составила " + sum / arr.length + " рублей");

        System.out.println("Task 4");

        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }


    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}
