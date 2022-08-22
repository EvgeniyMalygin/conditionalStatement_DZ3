public class Main {
    public static void main(String[] args) {
        //Задание 1
        int clientOS = 0;
        System.out.println("================Задание 1======================");
        switch (clientOS) {
            case 1: System.out.println("Установите версию приложения для Android по ссылке");
                break;
            case 0: System.out.println("Установите версию приложения для iOS по ссылке");
                break;
            default: System.out.println("Извините, приложения для вашей версии ОС не существует");
        }

        //Задание 2
        System.out.println("================Задание 2======================");
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

        //Задание 3
        System.out.println("================Задание 3======================");
        int year = 2022;
        if (year % 100 == 0 && year % 400 == 0)
        {
          System.out.println(year + " год високосный");
        } else
        {
            if (year % 4 == 0 && year % 100 !=0)
            {
                System.out.println(year + " год високосный");
            }else
            {
                System.out.println(year + " год невисокосный");
            }
        }
        //Задание 4
        System.out.println("================Задание 4======================");
        int deliveryDistance = 95;
        int quantityDayForDelivery = 1;
        if (deliveryDistance <= 20){
            System.out.println("Потребуется дней: " + quantityDayForDelivery);
        }else
        {
          if (20 < deliveryDistance && deliveryDistance < 60)
          {
              System.out.println("Потребуется дней: " + (quantityDayForDelivery + 1));
          }else
            {
                if (60 <= deliveryDistance && deliveryDistance <= 100)
                {
                 System.out.println("Потребуется дней: " + (quantityDayForDelivery + 2));
                }else
                    {
                        System.out.println("В данный адрес доставка неосуществляется");
                    }
            }
        }
        //Задание 5
        System.out.println("================Задание 5======================");
        int monthNumber = 12;
        switch (monthNumber)
        {
            case 1: System.out.println("Месяц " + monthNumber + " (январь) принадлежит зимнему сезону");
                break;
            case 2: System.out.println("Месяц " + monthNumber + " (февраль) принадлежит зимнему сезону");
                break;
            case 3: System.out.println("Месяц " + monthNumber + " (март) принадлежит весеннему сезону");
                break;
            case 4: System.out.println("Месяц " + monthNumber + " (апрель) принадлежит весеннему сезону");
                break;
            case 5: System.out.println("Месяц " + monthNumber + " (май) принадлежит весеннему сезону");
                break;
            case 6: System.out.println("Месяц " + monthNumber + " (июнь) принадлежит летнему сезону");
                break;
            case 7: System.out.println("Месяц " + monthNumber + " (июль) принадлежит летнему сезону");
                break;
            case 8: System.out.println("Месяц " + monthNumber + " (август) принадлежит летнему сезону");
                break;
            case 9: System.out.println("Месяц " + monthNumber + " (сентябрь) принадлежит осеннему сезону");
                break;
            case 10: System.out.println("Месяц " + monthNumber + " (октябрь) принадлежит осеннему сезону");
                break;
            case 11: System.out.println("Месяц " + monthNumber + " (ноябрь) принадлежит осеннему сезону");
                break;
            case 12: System.out.println("Месяц " + monthNumber + " (декабрь) принадлежит зимнему сезону");
                break;
            default:  System.out.println("Месяца с номером " + monthNumber + " несуществует");
        }
    }
}