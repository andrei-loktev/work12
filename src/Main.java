public class Main {
    public static void main(String[] args) {
        printYear(2021);
        task2();
        checkOS(2020, 0);

    }

    public static void printYearResult(int year, boolean yearIsLeap) {
        if (yearIsLeap) {
            System.out.println(year + " год високосный");
        } else {
            System.out.println(year + " год не високосный");
        }
    }

    public static void printYear(int year) {
        boolean yearIsLeap = isLeap(year);
        printYearResult(year, yearIsLeap);
    }

    public static boolean isLeap(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }

    public static void task2() {
        System.out.println("задание 2");
        }
    public static void checkOS( int deviceYear,int clientOS) {
        boolean deviceIsOld = deviceOld(deviceYear);
        if (deviceIsOld) {
            System.out.print("Установите облегченную версию приложения ");
        } else {
            System.out.print("Установите обычную версию приложения ");
        }
        if (clientOS == 0) {
            System.out.print("для IOS по ссылке");
        } else {
            System.out.print("для Android по ссылке");
        }
    }
        public static boolean deviceOld(int deviceYear) {
        int currentYear = 2015;
        return deviceYear <= currentYear;
        }
}