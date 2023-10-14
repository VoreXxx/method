import java.time.LocalDate;

public class Main {
    public static void printIsLeapYearResult(int year, boolean yearIsLeap) {
        if (yearIsLeap) {
            System.out.println(year + " високосный");
        } else {
            System.out.println(year + " не является високосным");
        }
    }
    public static void printIsLeapYear (int year) {
        boolean yearIsLeap = isLeap(year);
        printIsLeapYearResult(year, yearIsLeap);
    }
    public static boolean isLeap (int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }
    //Task2
    public static void recommendApplicationVersion(int clientOS, int deviceYear) {
        boolean deviceIsOld = isDeviceOld(deviceYear);
        System.out.print("Установите ");
        if (deviceIsOld) {
            System.out.print("Lite ");
        }
        System.out.print("версию для ");
        if (clientOS == 0) {
            System.out.println("IOS");
        } else {
            System.out.println("Android");
        }
    }

    public static void printSetSystem(int clientDeviceYear, int clientDevice) {
        String version = "";
        if (clientDevice < 2015) {
            version = "облегченную";
        }
        String device = "";
        if (clientDevice == 0) {
            device = "IOS";
        } else if (clientDevice == 1) {
            device = "Android";
        }
        System.out.printf("Установите %s версию приложения для %s по ссылке", version, device);
    }

    public static boolean isDeviceOld(int deviceYear) {
        int currentYear = LocalDate.now().getYear();
        return deviceYear <= currentYear;
    }

    public static void choosingVersion(int OS, int yearManufacture) {
        String osType = "";
        switch (OS) {
            case 0:
                osType = "IOS";
                break;
            case 1:
                osType = "Anroid";
        }
        System.out.printf("Установите %s версию приложения для %s по ссылке", getVersionByYear(yearManufacture), osType);
    }

    public static String getVersionByYear(int year) {
        return year < LocalDate.now().getYear() ? "Lite" : "";
    }

    //Task3
    public static String calculateDeliveryDays(int deliveryDistance) {
        int deliveryDays = 1;
        if (deliveryDays > 20) {
            deliveryDays++;
        }
        if (deliveryDistance > 60 && deliveryDistance <= 100) {
            deliveryDays++;
        } else if (deliveryDistance > 100) {
            return "Не возможно расичитать срок доставки";
        }
        return "Потребуется дней: " + deliveryDays;
    }

    public static void main(String[] args) {
        //Task1
        printIsLeapYear(2023);
        //Task2
        recommendApplicationVersion(0, 2023);
        //Task3
        System.out.println(calculateDeliveryDays(4));
    }
}