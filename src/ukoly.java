import java.util.Scanner;

public class ukoly {
    static Scanner sc = new Scanner(System.in);

    public int cislo;
    public String slovo;
    public int prvocislo;
    public int cislo1;
    public int cislo2;
    public int cislo3;
    public int vetsi;
    public int mensi;
    public int necxo;


    public void neco() {
        for (int i = 1; i <= 30; i++) {
            System.out.println(i + " Ahoj podsvětí");
        }
    }


    public void setnecxo(int necxo) {
        this.necxo = necxo;
    }


    public void vypiscislo() {
        System.out.println(cislo);
    }

    public void cisilka() {
        System.out.println("Zadej číslo: ");
        cislo = sc.nextInt();

        switch (cislo) {
            case 1 -> System.out.println("Jedna");
            case 2 -> System.out.println("Dva");
            case 3 -> System.out.println("tři");
            case 4 -> System.out.println("Čtyři");
            case 5 -> System.out.println("Pět");
            case 6 -> System.out.println("Šest");
            case 7 -> System.out.println("Sedm");
            case 8 -> System.out.println("Osm");
            case 9 -> System.out.println("Devět");
            case 10 -> System.out.println("Deset");
            case 11 -> System.out.println("Jedenáct");
            case 12 -> System.out.println("Dvanáct");
            default -> System.out.println("Zadej jiné číslo");


        }


    }

    public void nasobky() {
        System.out.println("Zadej násobek");
        for (int nasobek = 1; nasobek <= 20; nasobek++) {
            System.out.println(5 * nasobek);
        }
    }

    public void prvocsilo() {
        System.out.println("Zadej nějaké prvočíslo:");
        prvocislo = sc.nextInt();

        if (prvocislo <= 1) {
            System.out.println("Číslo není prvočíslo");
            return;
        }

        for (int j = 2; j * j <= prvocislo; j++) {
            if (prvocislo % j == 0) {
                System.out.println("Číslo není prvočíslo");
                return;
            }
        }

        System.out.println("Číslo je prvočíslo");
    }

    public void poznejto() {
        System.out.println("Zadej 1 číslo: ");
        cislo1 = sc.nextInt();
        System.out.println("Zadej 2 číslo: ");
        cislo2 = sc.nextInt();
        System.out.println("Zadej 3 číslo: ");
        cislo3 = sc.nextInt();


        if ((cislo1 > cislo2) && (cislo1 > cislo3)) {
            vetsi = cislo1;
        }
        if ((cislo2 > cislo3) && (cislo2 > cislo1)) {
            vetsi = cislo2;
        }
        if ((cislo3 > cislo1) && (cislo3 > cislo2)) {
            vetsi = cislo3;
        }

        if ((cislo1 < cislo2) && (cislo1 < cislo3)) {
            mensi = cislo1;
        }
        if ((cislo2 < cislo3) && (cislo2 < cislo1)) {
            mensi = cislo2;
        }
        if ((cislo3 < cislo1) && (cislo3 < cislo2)) {
            mensi = cislo3;
        }

        double deleni = (double) vetsi / mensi;

        System.out.println(mensi);
        System.out.println(vetsi);
        System.out.println(deleni);
    }


    public void textmenu() {




        for(boolean a = true; a;) {
            System.out.println("Jaký úkol chceš prověst od 1-10" );
            necxo=sc.nextInt();

            switch (necxo) {
                case 1 -> neco();
                case 2 -> cisilka();
                case 3 -> prvocsilo();
                case 4 -> poznejto();
                case 5 -> vypiscislo();
                case 6 -> nasobky();
                default -> System.out.println("úkol zde není");

            }
            System.out.println("Chceš pokračovat ANO/NE");
            sc.nextLine();
            String k = sc.nextLine();
          if(k.equals("NE")){
              a=false;
          }



            }

        }
    }



