public class Main {

    public static void printLeapYearStatus (int year) {
        if  ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0 )) {
            System.out.println(year + " год - високосный год");
        } else {
            System.out.println(year + " год - невисокосный год");
        }
    }

    public static void suggestApp (int osType, int deviceYear) {
        int currentYear = 2023;

        String osName;
        if (osType == 0) {
            osName = "iOS";
        } else if (osType == 1) {
            osName = "Android";
        } else {
            System.out.println("Неизвестный тип ОС");
            return;
        }

        if (deviceYear < currentYear) {
            System.out.println("Установите облегченную версию приложения для " + osName + " по ссылке");
        } else {
            System.out.println("Установите приложение для " + osName + " по ссылке");
        }
    }

    public static int calculateDeliveryDays(int deliveryDistance) {
        if (deliveryDistance <= 20) {
            return 1;
        } else if (deliveryDistance <= 60) {
            return 2;
        } else if (deliveryDistance <= 100) {
            return 3;
        } else {
            return -1;
        }
    }

    public static void task1() {
        printLeapYearStatus(2024);
    }

    public static void task2() {
        suggestApp(0, 2014);
        suggestApp(1, 2023);
        suggestApp(2, 2015);
    }

    public static void task3() {

        int days = calculateDeliveryDays(55);
        if (days > 0) {
            System.out.println("Потребуется дней: " + days);
        } else {
            System.out.println("Доставки нет");
        }
    }

    public static void main(String[] args) {
        System.out.println("Задача 1");
        task1();
        System.out.println("Задача 2");
        task2();
        System.out.println("Задача 3");
        task3();
    }
}