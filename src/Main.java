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
    }
}