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

        int year = 1917;
        boolean yearLeap = (year > 1584 && ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)));
        if (yearLeap) {
            System.out.println(+year + " год является висококосным");
        } else {
            System.out.println(+year + " год не является висококосным");
        }

        int deliveryDistance = 55;
        int minDelivery = 1;
        if (deliveryDistance > 100) {
            System.out.println("Доставки нет");
            return;
        }
        if (deliveryDistance > 20) {
            minDelivery++;
        }
        if (deliveryDistance > 60) {
            minDelivery++;
        }
        System.out.println("Доставка займет " + minDelivery + " суток");

        int monthNumber = 13;
        switch (monthNumber) {
            case 1:
                System.out.println(" Зима ");
                break;
            case 2:
                System.out.println(" Зима ");
                break;
            case 3:
                System.out.println(" Весна ");
                break;
            case 4:
                System.out.println(" Весна ");
                break;
            case 5:
                System.out.println(" Весна ");
                break;
            case 6:
                System.out.println(" Лето пришло ");
                break;
            case 7:
                System.out.println(" Лето ");
                break;
            case 8:
                System.out.println(" Лето ");
                break;
            case 9:
                System.out.println(" Золотая осень ");
                break;
            case 10:
                System.out.println(" Осень ");
                break;
            case 11:
                System.out.println(" Зима пришла ");
                break;
            case 12:
                System.out.println(" Зима ");
                break;
            default:
                System.out.println(" Такого месяца не существует ");
                break;}

    }
}































