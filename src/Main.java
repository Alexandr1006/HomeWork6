public class Main {
    public static void main(String[] args) {

//OneTask
        int clientOS = 0;
        String client = (clientOS == 1) ? "Установите версию приложения для Android по ссылке" : "Установите версию приложения для iOS по ссылке";
        System.out.println(client);

//TwoTask
        int clientDeviceYear = 2016;
        int system = 1;
        if (clientDeviceYear >= 2015 && system == 1) {
            System.out.println("Установи новую версию для Android");
        } else if (clientDeviceYear < 2015 && system == 1) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientDeviceYear >= 2015 && system == 0) {
            System.out.println("Установи новую версию для IOS");
        }else
            System.out.println("Установите облегченную версию приложения для IOS по ссылке");

//ThreeTask
        int year = 2001;
        String newYear = (year % 4 == 0) || (year % 400 ==0) ? year + " является високосным." : year + " не является високосным.";
            System.out.println(newYear);

//FourTask
        int deliveryDistance = 95;
        if (deliveryDistance > 0 && deliveryDistance < 20) {
            System.out.println("Доставим за 1 день");
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            System.out.println("Доставим за 2 дня");
        }
        else if (deliveryDistance >= 60 && deliveryDistance < 100){
            System.out.println("Доставим за 3 дня");
        }

//FiveTask
        int monthNumber = 6;
        switch (monthNumber){
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            case 13:
                System.out.println("В году 12 месяцев!");
        }
    }
}