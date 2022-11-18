

public class Main {
    public static void main(String[] args) {
        //Task 1
        System.out.println("Задание 1");
        int year = 2026;
        checkingOnLeapYear(year);

        //Task 2
        System.out.println("Задание 2");
        int clientDeviceYear = 2014;
        int clientOS = 0;
        installBankingApplication(clientOS, clientDeviceYear);

        //Task 3
        System.out.println("Задание 3");
        int deliveryDistance = 19;
        int deliveryPeriod = calculateDeliveryPeriod(deliveryDistance);
        System.out.println("Для доставки вашей банковской карты потребуется дней: " + deliveryPeriod);
    }

    public static void checkingOnLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        }
        else {
            System.out.println(year + " год не является високосным");
        }
    }

    public static void installBankingApplication(int clientOS, int clientDeviceYear) {
        if (clientOS < 0 || clientOS > 1){
            System.out.println("Ошибка определения ОС");
            return;
        }

        if (clientOS == 0) {
            if (clientDeviceYear < 2015){
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
            else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        } else if (clientOS == 1) {
            if ( clientDeviceYear < 2015){
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
            else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }
    }

    public static int calculateDeliveryPeriod(int deliveryDistance) {
        int deliveryPeriod = 0;
        if (deliveryDistance < 20) {
            deliveryPeriod = 1;
        } else if (deliveryDistance >=20 && deliveryDistance < 60) {
            deliveryPeriod = 2;
        } else if (deliveryDistance >= 60 && deliveryDistance <100) {
            deliveryPeriod = 3;
        }
        else {
            System.out.println("Error");
        }
        return deliveryPeriod;
    }

}