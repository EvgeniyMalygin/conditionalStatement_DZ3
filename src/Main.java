public class Main {
    public static void main(String[] args) {
        //Задание 1
        int clientOS = 0;
        switch (clientOS) {
            case 1: System.out.println("Установите версию приложения для Android по ссылке");
                break;
            case 0: System.out.println("Установите версию приложения для iOS по ссылке");
                break;
            default: System.out.println("Извините, приложения для вашей версии ОС не существует");
        }

        //Задание 2
        int clientDeviceYear = 2016;
        if (clientDeviceYear < 2015){
            if (clientOS == 0){
                System.out.println("Установите облегчённую версию приложения для iOS по ссылке");
            }else {
                System.out.println("Установите облегчённую версию приложения для Android по ссылке");
            }
        }else {
            if (clientOS == 0){
                System.out.println("Установите версию приложения для iOS по ссылке");
            }else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }
    }
}