public class Main {
    public static void main(String[] args) {


    byte abyte = 127;
        System.out.println("Значение переменной  abyte с типом byte равно " + abyte);
    short ashort = 32767;
        System.out.println("Значение переменной  ashort с типом byte равно " + ashort);
    int aint = 1234567;
        System.out.println("Значение переменной  aint с типом byte равно " + aint);
    long along = 123456789;
        System.out.println("Значение переменной  along с типом byte равно " + along);
    float afloat = 1.2f;
        System.out.println("Значение переменной  afoat с типом byte равно " + afloat);
    double adouble = 21333.234;
        System.out.println("Значение переменной  adouble с типом byte равно " + adouble);
/*звадача №2*/
   float Znach1 = 27.12f;
   long Znach2 = 987678965549l;
   float Znach3 = 2.786f;
   boolean Znach4 = false;
   short Znach5 = 569;
   short Znach6 = -159;
   short Znach7 = 27897;
   byte Znach8 = 67;
   //Задача №3//
        byte LudmilaPavlovna = 23;
        byte AnnaSergeevna = 27;
        byte EkaterinaAndreevna = 30;
        int AllPapers = 480;
        int PapersForStudent = AllPapers / (LudmilaPavlovna + AnnaSergeevna + EkaterinaAndreevna);
        System.out.println("На каждого ученика рассчитано " + PapersForStudent+ " листов бумаги");
        //Задача №4//
        byte bottlesInMinute = 16;
        int minuts20 = bottlesInMinute * 10;
        System.out.println("За 20 минут машина произвела бутылок " + minuts20 + " штук");
        int hour = minuts20 * 3;
        int day = hour * 24;
        System.out.println("За день машина произвела бутылок " + day + " штук");
        int days3 = day * 3;
        System.out.println("За 3 дня машина произвела бутылок " + days3 + " штук");
        int mounh = day * 30;
        System.out.println("За месяц машина произвела бутылок " + mounh + " штук");
        //Задача №5//
        byte Colours = 120;
        byte classWhiteColour = 2;
        byte classBraunColour = 4;
        int numberOfClasses = Colours / (classBraunColour + classWhiteColour);
        int numberOfWhiteColour = numberOfClasses * classWhiteColour;
        int numberOfBraunColour = numberOfClasses * classBraunColour;
        System.out.println("В школе, где " + numberOfClasses + " классов, нужно " + numberOfWhiteColour + " банок белой краски и " + numberOfBraunColour + " банок коричневой краски");
//задача №6//
        byte grammBanan = 80;
        byte numberBanan = 5;
        byte grammMilk = 105;
        byte numberMilk = 20;
        byte grammIcecream = 100;
        byte numberIcecream = 2;
        byte grammEgg = 70;
        byte numberEgg = 4;
        int allBananas = grammBanan * numberBanan;
        int allmilk = grammMilk * numberMilk;
        int allIcecream = grammIcecream * numberIcecream;
        int allEggs = grammEgg * numberEgg;
        int allBreakfast = (allIcecream + allBananas + allmilk + allEggs);
        int allBreakfastInKilo = (allIcecream + allBananas + allmilk + allEggs)/1000;
        System.out.println("Спорт-завтрак весит " + allBreakfastInKilo + " килограмма");
        //Задача №7//
        byte newRules = 7;
        float minimalProgramm = 0.250f;
        float maximumProgramm = 0.500f;
        float firstRelultDays = newRules/minimalProgramm;
        float secondResultDays = newRules/maximumProgramm;
        System.out.println("В первом случае дней для похудения уйдет " + firstRelultDays + ", во втором случае дней уйдет " + secondResultDays);
        //Задача №8//
        int Masha = 67760;
        int Denis = 83760;
        int Kristina = 76230;
        float update = 1.1f;
        float updateMasha = Masha * update;
        float updateDenis = Denis * update;
        float updateKristina = Kristina * update;
        float MashaPoint = updateMasha - Masha;
        float DenisPoint = updateDenis - Denis;
        float KristinaPoint = updateKristina - Kristina;
        System.out.println("Маша теперь получает " + updateMasha + " рублей. Годовой доход вырос на " + MashaPoint + " рублей");
        System.out.println("Денис теперь получает " + updateDenis + " рублей. Годовой доход вырос на " + DenisPoint + " рублей");
        System.out.println("Кристина теперь получает " + updateKristina + " рублей. Годовой доход вырос на " + KristinaPoint + " рублей");

}
}
