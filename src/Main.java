public class Main {
    public static void main(String[] args) {


        int clientOS = 1;
        if (clientOS == 1) {
            System.out.println(" Установите версию приложения для iOs по ссылке ");
        } else if (clientOS == 0) {
            System.out.println(" Установите версию приложения для Android по ссылке ");
        }

        int clientDeviceYear = 2011;
        if (clientDeviceYear < 2015 && clientOS == 0) {
            System.out.println(" Установите облегченную версию для Android по ссылке");
        } else if (clientDeviceYear >= 2015 && clientOS == 0) {
            System.out.println(" Установите версию для Android по ссылке ");
        }
        if (clientDeviceYear < 2015 && clientOS == 1) {
            System.out.println(" Установите облегченную версию для iOs по ссылке");
        } else if (clientDeviceYear >= 2015 && clientOS == 1) {
            System.out.println(" Установите версию приложения для iOs по ссылке");
        }

        int year = 1961;
        boolean yearLeap = year > 1584 && (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0));
        if (yearLeap) {
            System.out.println(+year + " год является висококосным");
        } else {
            System.out.println(+year + " год не является висококосным");
        }

        int deliveryDistance = 70;
        int minDelivery = 1;
        if (deliveryDistance <= 20) {
            System.out.println(" Доствка займет 1 сутки");
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
                System.out.println(" Доставка займет 2 суток ");
            }
            if (deliveryDistance > 60 && deliveryDistance <= 100) {
                System.out.println(" Доставка займет 3 суток");
            } else if (deliveryDistance > 100) {
                System.out.println(" Доставка не осущевстляется");
            }
            int monthNumber = 7;
            switch (monthNumber) {
        case 12, 1, 2:
            System.out.println(" Зима ");
            break;
        case 3, 4, 5:
            System.out.println(" Весна ");
            break;
        case 6, 7, 8:
            System.out.println(" Лето пришло ");
            break;
        case 9, 10, 11:
            System.out.println(" Золотая осень ");
            break;
        default:
            System.out.println(" Такого месяца не существует ");
            break;

            }

        }
    }
































