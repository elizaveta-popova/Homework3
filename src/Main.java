public class Main {
    public static void main(String[] args) {
        //Задача 1
        System.out.println("Задача 1");
        byte a =1;
        System.out.println("Значение переменной с типом byte равно " + a);
        short b = 345;
        System.out.println("Значение переменной с типом short равно " + b);
        long c = 890000000L;
        System.out.println("Значение переменной с типом int равно " + c);
        float d = 2.7f;
        System.out.println("Значение переменной с типом float равно " + d);
        double e = 4.889;
        System.out.println("Значение переменной с типом double равно " + e);
        //Задача 2
        System.out.println("Задача 2");
        float a1 = 27.12f;
        System.out.println(a1);
        long b1 = 987678965549L;
        System.out.println(b1);
        short c1 = 2786;
        System.out.println(c1);
        boolean d1 = false;
        System.out.println(d1);
        short e1 = 569;
        System.out.println(e1);
        short f1 = -159;
        System.out.println(f1);
        short g1 = 27897;
        System.out.println(g1);
        byte h1 = 67;
        System.out.println(h1);
        //Задача 3
        System.out.println("Задача 3");
        byte classLudPav = 23;
        byte classAnnSerg = 27;
        byte classKateAndr = 30;
        short sheets = 480;
        int totalNumberStud = classAnnSerg + classKateAndr + classLudPav;
        System.out.println("На каждого ученика рассчитано " + (sheets / totalNumberStud) + " листов бумаги");
        //Задача 4
        System.out.println("Задача 4");
        byte bottles = 16;
        byte minutes = 2;
        int bottlePerMin = bottles / minutes;
        int bottlePer20Min = bottlePerMin * 20;
        System.out.println("За 20 мин машина произвела бутылок " + bottlePer20Min + " штук.");
        int bottlePerHour = bottlePer20Min * 3;
        System.out.println("За 1 час машина произвела бутылок " + bottlePerHour + " штук.");
        int bottlePerDay = bottlePerHour * 24;
        System.out.println("За сутки машина произвела бутылок " + bottlePerDay + " штук.");
        int bottlePer3Days = bottlePerDay * 3;
        System.out.println("За 3 дня машина произвела бутылок " + bottlePer3Days + " штук.");
        int bottlePerMonth = bottlePer3Days * 10;
        System.out.println("За месяц машина произвела бутылок " + bottlePerMonth + " штук.");

        //Задача 5
        System.out.println("Задача 5");
        byte paintCans = 120;
        byte whitePerClass = 2;
        byte brownPerClass = 4;
        int totalPaintOnClass = whitePerClass + brownPerClass;
        int classes = paintCans / totalPaintOnClass;
        int totalWhite = classes * whitePerClass;
        int totalBrown = classes * brownPerClass;
        System.out.println("В школе, где " + classes + " классов, нужно " + totalWhite + " банок белой краски и " + totalBrown + " банок коричневой краски");
        //Задача 6
        System.out.println("Задача 6");
        int bananas = 5 * 80;
        int milk = 105 * 2;
        int icecream = 2 * 100;
        int eggs = 4 * 70;
        int totalGrams = bananas + milk + icecream + eggs;
        double totalKg = totalGrams * 0.001;
        System.out.println("Вес завтрака в граммах: " + totalGrams + ". Вес завтрака в килограммах: " + totalKg);
        //Задача 7
        System.out.println("Задача 7");
        byte totalWeightToLose = 7;
        int totalWeightToLoseInGrams = totalWeightToLose * 1000;
        int days250 = totalWeightToLoseInGrams / 250;
        int days500 = totalWeightToLoseInGrams / 500;
        int average = (days250 + days500) / 2;
        System.out.println("Если спортсмен будет терять по 250 г, то он похудеет через " + days250 + " дней.");
        System.out.println("Если спортсмен будет терять по 500 г, то он похудеет через " + days500 + " дней.");
        System.out.println("В среднем ему нужно худеть " + average + " дней.");
        //Задача 8
        System.out.println("Задача 8");
        int MashaPerMonth = 67760;
        int DenisPerMonth = 83690;
        int KrisPerMonth = 76230;
        int MashaPerYear = MashaPerMonth * 12;
        int DenisPerYear = DenisPerMonth * 12;
        int KrisPerYear = KrisPerMonth * 12;

        int riseMasha = MashaPerYear / 10;
        int riseDenis = DenisPerYear / 10;
        int riseKris = KrisPerYear / 10;

        int newPerYearMasha = MashaPerYear + riseMasha;
        int newPerYearDenis = DenisPerYear + riseDenis;
        int newPerYearKris = KrisPerYear + riseKris;
        System.out.println("Маша теперь получает " + (newPerYearMasha / 12) + " рублей. Годовой доход вырос на " + (newPerYearMasha - MashaPerYear) + " рублей." );
        System.out.println("Денис теперь получает " + (newPerYearDenis / 12) + " рублей. Годовой доход вырос на " + (newPerYearDenis - DenisPerYear) + " рублей." );
        System.out.println("Кристина теперь получает " + (newPerYearKris / 12) + " рублей. Годовой доход вырос на " + (newPerYearKris - KrisPerYear) + " рублей." );






    }
}