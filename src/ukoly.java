public class ukoly {

    public int cislo;
    public String slovo;
    public int prvocislo;
    public int cislo1;
    public int cislo2;
    public int cislo3;
    public int vetsi;
    public int mensi;


    public void neco() {
        for (int i = 1; i <= 30; i++) {
            System.out.println(i + " Ahoj podsvětí");
        }
    }

    public void setcislo(int cislo) {
        this.cislo = cislo;
    }

    public void setslovo(String slovo) {
        this.slovo = slovo;
    }

    public void setprvocislo(int prvocislo) {
        this.prvocislo = prvocislo;
    }

    public void setCislo1(int cislo1) {
        this.cislo1 = cislo1;
    }

    public void setCislo2(int cislo2) {
        this.cislo1 = cislo2;
    }

    public void setCislo3(int cislo3) {
        this.cislo1 = cislo3;
    }

    public void vypisslovo() {
        System.out.println(slovo);
    }

    public void vypiscislo() {
        System.out.println(cislo);
    }

    public void cisilka() {
        if (cislo < 0) {
            System.out.println("bylo zadáno záporné číslo");
        } else if (cislo == 0) {
            System.out.println("bya zadána 0");
        } else if (cislo > 12) {
            System.out.println("bylo zadáno moc velké číslo");
        } else if (cislo == 1) {
            System.out.println("Jedna");
        } else if (cislo == 2) {
            System.out.println("Dva");
        } else if (cislo == 3) {
            System.out.println("tři");
        } else if (cislo == 4) {
            System.out.println("Čtyři");
        } else if (cislo == 5) {
            System.out.println("Pět");
        } else if (cislo == 6) {
            System.out.println("Šest");
        } else if (cislo == 7) {
            System.out.println("Sedm");
        } else if (cislo == 8) {
            System.out.println("Osm");
        } else if (cislo == 9) {
            System.out.println("Devět");
        } else if (cislo == 10) {
            System.out.println("Deset");
        } else if (cislo == 11) {
            System.out.println("Jedenáct");
        }


    }

    public void nasobky() {
        for (int nasobek = 1; nasobek <= 20; nasobek++) {
            System.out.println(5 * nasobek);
        }
    }

    public void prvocsilo() {
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

        double deleni = (double) vetsi /mensi;

        System.out.println(mensi);
        System.out.println(vetsi);
        System.out.println(deleni);
    }


}

