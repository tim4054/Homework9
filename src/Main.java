public class Main {
    public static void main(String[] args) {
        System.out.println("task1");
        int pays[] = {22000, 25000, 21000, 30000, 15000};
        int sum = 0;
        for (int element : pays) {
            sum += element;
        }
        System.out.printf("Сумма трат за месяц составила %s рублей%n", sum);
        System.out.println("______________________");

        System.out.println("task2");
        int[] arrayOne = {1000, 1500, 1800, 1620, 8630};
        int maxPay = -1;
        for (int i = 0; i < arrayOne.length; i++) {
            if (arrayOne[i] > maxPay) {
                maxPay = arrayOne[i];
            }
        }
        System.out.println(maxPay);

        int maxPayCopy = maxPay;
        for (int i = 0; i < arrayOne.length; i++) {
            if (arrayOne[i] < maxPayCopy) {
                maxPayCopy = arrayOne[i];
            }
        }
        int minPay = maxPayCopy;
        System.out.printf("Минимальная сумма трат за неделю составила %s рублей." +
                " Максимальная сумма трат за неделю составила %s рублей%n", minPay, maxPay);
        System.out.println("______________________");

        System.out.println("task3");
        double[] arrayTwo = {1016, 3560, 1578.45, 2500, 1200};
        double sumMonth = 0;
        for (int i = 0; i < arrayTwo.length; i++) {
            sumMonth += arrayTwo[i];
        }
        double average = sumMonth / arrayTwo.length;
        System.out.println("Средняя сумма трат за месяц составила " + average + " рублей");
        System.out.println("______________________");

        System.out.println("task4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
        System.out.println();
        System.out.println("______________________");

    }
}