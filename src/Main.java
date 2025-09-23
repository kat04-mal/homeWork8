//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Задача 1
        System.out.println("\nЗадача 1");
        int firstFriday;
        for (firstFriday = 4; firstFriday <= 31; firstFriday +=7){
                System.out.println("Сегодня пятница " + firstFriday + " число. Необходимо подготовить отчёт");
        }

        //Задача 2
        System.out.println("\nЗадача 2");
        System.out.println("\nЦикл do-while");
        int distance = 42195;
        int distanceTravel = 0;
        distance = distance - 500;
        distanceTravel = distanceTravel + 500;
        do {
            System.out.println("Держитесь. Осталось " + distance + " метров" );
            distance = distance - 500;
            distanceTravel = distanceTravel + 500;
        }
        while (distanceTravel <= 42195);
        System.out.println("\nЦикл for");
        int totalDistance = 42195 - 500;
        for (; totalDistance >= 0; totalDistance = totalDistance - 500){
            System.out.println("Держитесь. Осталось " + totalDistance + " метров");
        }
        //Задача 3
        System.out.println("\nЗадача 3");
        System.out.println("\nЦикл for");
        int budget = 1100;
        int currentDay = 1; //текущий день
        int days = 0;
        while (budget > 0){
            currentDay ++;
            budget -= 100;
            days ++;
            if(currentDay % 5 == 0) {
                days ++;
                continue;
            }

        }
        System.out.println("Бюджета хватит на " + days + " дней");
        System.out.println("\nЦикл for");
        int day = 1;
        for (int i = 1100; i >= 0; i-=100){
            day ++;
            if (day % 5 == 0){
                continue;
            }
        }
        System.out.println("Бюджета хватит на " + day + " дней");

        //Задача 4
        System.out.println("\nЗадача 4");
        int month = 0;
        int total = 0;
        while (true){
            if (total >= 12000000){
                break;
            }
            month ++;
            total = total + 15000;
            System.out.println("Месяц " + month + " Сумма " + total);
            if(month % 6 == 0){
                total = total + 7 * (total/100);
            }
        }

        //Задача 5
        System.out.println("\nЗадача 5");
        int charge = 20;
        int minute = 0;
        int overheats = 0;
        while (charge < 100 && overheats <= 3){
            charge += 2;
            minute ++;
            if (overheats == 3){
                break;
            }
            if (minute % 10 == 0){
                overheats ++;
                minute += 2;
                System.out.println("Устройство перегрелось " + overheats + " раз");
                continue;
            }
        }
        System.out.println("Зарядка устройства до " + charge + "% заняла " +  minute + " минут");
    }
}