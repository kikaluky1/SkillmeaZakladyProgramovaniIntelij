
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        // Zaklady
        String pozdrav = "Ahoj svete";
        String jmeno = "preje Honza";
        jmeno = pozdrav;

        //Toto je pro vypsani do konzole
        System.out.println(pozdrav + " " + jmeno);
        System.out.println(pozdrav);
        System.out.println(pozdrav);
        */

        //Kalkulacka
        /*double prvniCislo = 5;
        final double druheCislo = 10;
        druheCislo = 40;

        System.out.println(prvniCislo + druheCislo);
        System.out.println(prvniCislo - druheCislo);
        System.out.println(prvniCislo * druheCislo);
        System.out.println(prvniCislo / druheCislo);

        boolean pravdaNepravda = false;*/

        /*float prvniDesCislo = 0.1f;
        String druheDesCislo = "2";
        System.out.println(prvniDesCislo + druheDesCislo);*/

        /*System.out.println("Ahoj, zadej jmeno:");

        Scanner mujScanner = new Scanner(System.in);
        String jmeno = mujScanner.nextLine();

        System.out.println("Preji pekny den " + jmeno);*/

        //Vylepsena kalkulacka
        /*Scanner mujScanner = new Scanner(System.in);

        System.out.println("Zadej prvni cislo:");
        int prvniCislo = mujScanner.nextInt();
        System.out.println("Zadej druhe cislo:");
        int druheCislo = mujScanner.nextInt();

        System.out.println(prvniCislo + druheCislo);
        System.out.println(prvniCislo - druheCislo);
        System.out.println(prvniCislo * druheCislo);
        System.out.println(prvniCislo / druheCislo);
        //System.out.println(prvniCislo % druheCislo);*/

        //String metody
        /*Scanner mujScanner = new Scanner(System.in);
        System.out.println("Zadej svuj text:");
        String mujText = mujScanner.nextLine();

        System.out.println(mujText.length());*/

        /*String textCislo = "55";
        int prevedeneCislo = Integer.parseInt(textCislo);
        System.out.println(prevedeneCislo + 5);*/

        /*int x = 10;
        int y = 9;
        int z = 12;

        System.out.println(!(x > y || z < x) && y > z);*/

        //Podminky
        /*Scanner mujScanner = new Scanner(System.in);

        System.out.println("Zadej vek:");
        int vek = mujScanner.nextInt();

        //Tohle rozhoduje o tom zda je uzivatel dospely/dite/senior
        if(vek >= 18) {
            System.out.println("Uzivatel je dospely");
            if(vek >= 65){
                System.out.println("Uzivatel je senior");
            }
        }
        else if(vek < 18 && vek >= 0){
            System.out.println("Uzivatel je dite");
        }
        else {
            System.out.println("Nelze zadat zaporny vek");
        }*/

        //Vypocet BMI hmotnost(kg)/vyska(m) na druhou
        // (<18.5) - podváha
        // (>=18.5 && <25) - optimální váha
        // (>=25) - nadváha
        /*float vyska;
        float hmotnost;
        float bmi;
        Scanner mujScanner = new Scanner(System.in);

        System.out.println("Zadej vysku(m):");
        vyska = mujScanner.nextFloat();
        System.out.println("Zadej hmotnost(kg):");
        hmotnost = mujScanner.nextFloat();

        bmi = hmotnost / (vyska * vyska);


        if(bmi >= 0 && bmi < 18.5f){
            System.out.println("Uzivatel ma podvahu");
        }
        else if(bmi >= 18.5f && bmi < 25f){
            System.out.println("Uzivatel ma optimalni vahu");
        }
        else if(bmi >= 25f){
            System.out.println("Uzivatel ma nadvahu");
        }
        else {
            System.out.println("Nelze zadat zapornou hmotnost");
        }

        System.out.println("Vypoctene BMI: " + bmi);*/

        //Hra kostky licha=vyhravas, suda=prohravas
        /*int hozeneCislo;
        Random nahodnyGenerator = new Random();

        hozeneCislo = nahodnyGenerator.nextInt(1,7);

        System.out.println("Hozene cislo: " + hozeneCislo);

        if(hozeneCislo % 2 == 1){
            System.out.println("Licha vyhravas");
        }
        else {
            System.out.println("Suda prohravas");
        }*/

        //Vyber dne
        /*Scanner mujScanner = new Scanner(System.in);
        int cisloDne;

        System.out.println("Zadej cislo dne:");
        cisloDne = mujScanner.nextInt();

        switch (cisloDne) {
            case 1:
                System.out.println("Je pondeli");
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Je pracovni den");
                break;
            case 6:
            case 7:
                System.out.println("Je vikend");
                break;
            default:
                System.out.println("Neplatne cislo dne");
        }*/

        //Pole
        /*int[] znamky = new int[5];
        znamky[0] = 3;
        znamky[1] = 5;
        znamky[2] = 2;
        znamky[3] = 3;
        znamky[4] = 1;*/

        /*int[] znamky = new int[] {3, 5, 2, 3, 1};
        System.out.println(znamky[4]);

        String[] jmenaStudentu = new String[] {"Honza", "Lenka", "Petr", "Katka", "Petra"};
        jmenaStudentu[3] = jmenaStudentu[0];

        System.out.println(jmenaStudentu[2].length());

        int[][] viceDimPole = new int[2][2];
        viceDimPole[0][0] = 83;*/

        //Smycky
        //For

        /*for(int i = 1; i <= 5; i++) {
            System.out.println(i * 5);
        }*/

        /*String[] jmenaStudentu = new String[] {"Honza", "Lenka", "Petr", "Katka" };

        for(int i = 0; i < jmenaStudentu.length; i++){
            System.out.println(jmenaStudentu[i]);
        }

        //foreach
        for(String jednoJmeno: jmenaStudentu) {
            System.out.println(jednoJmeno);
        }*/

        /*String[] jmenaStudentu = new String[]{"Honza", "Lenka", "Katka", "Petr", "Petra"};

        for (int i = 0; i < jmenaStudentu.length; i++) {
            System.out.println(jmenaStudentu[i]);
        }

        for (String jednoJmeno: jmenaStudentu) {
            System.out.println(jednoJmeno);
        }*/

        /*int[] nasobky = new int[10];

        //Naplneni pole nasobky 10
        for(int i=0; i < nasobky.length; i++){
            nasobky[i] = 10 * i;
        }

        //Vypis pole nasobku
        for(int jedenNasobek: nasobky){
            System.out.println(jedenNasobek);
        }*/

        //Smycka while
        /*int ridiciPromnenna = 0;


        while (ridiciPromnenna !=0) {
            System.out.println(ridiciPromnenna);
            ridiciPromnenna++;
        }
        do {
            System.out.println(ridiciPromnenna);
            //ridiciPromnena++;
        }while(ridiciPromnenna != 0);*/

        //break = ukonceni smycky; continue - ukonceni interace a pokracovani dale
/*
    int ridiciPromnenna = 0;

        while (true){
            System.out.println("Smycka porad jede");

            if(ridiciPromnenna > 5){
            break;
            }
            ridiciPromnenna++;
        }*/

        int hozeneCislo;
        boolean ridiciPromnenna = true;
        Random nahodnyGenerator = new Random();
        Scanner mujScanner = new Scanner(System.in);

        do {
            System.out.println("Pro hru kostkou stiskni enter");
            mujScanner.nextLine();


        }while(ridiciPromnenna);

        hozeneCislo = nahodnyGenerator.nextInt(1,7);
        System.out.println("Hozene cislo: " + hozeneCislo);

        if(hozeneCislo % 2 == 1){
            System.out.println("Licha vyhravas");
        }
        else {
            System.out.println("Suda prohravas");
        }

        }
    }

