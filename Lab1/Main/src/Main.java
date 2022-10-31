import java.util.*;
import java.util.Scanner;

class RabotnaNedela {

    private int[] casovi;
    private int brNedela;

    public RabotnaNedela(int[] casovi, int brNedela)
    {
        super();
        this.casovi = casovi;
        this.brNedela = brNedela;
    }

    public int sumOfCasovi()
    {
        int sum = 0;
        for (int i=0;i<5;i++)
        {
            sum+=this.casovi[i];
        }
        return sum;
    }
    public void setCasovi(int[]casovi)
    {
        this.casovi=casovi;
    }
    public int getBrNedela()
    {
        return brNedela;
    }


    @Override
    public String toString()
    {
        return sumOfCasovi() +  "   ";
    }

}

class Rabotnik {

    private String ime;
    private RabotnaNedela[] nedeli;

    public Rabotnik(String ime, RabotnaNedela[] nedeli) {
        super();
        this.ime = ime;
        this.nedeli = nedeli;
    }

    public String getIme()
    {
        return ime;
    }
    public void setIme(String ime)
    {
        this.ime=ime;
    }

    public int workhoursOfNedela() {
        int sum = 0;
        for (int i = 0; i < 4; i++) {
            sum += this.nedeli[i].sumOfCasovi();
        }
        return sum;
    }

    @Override
    public String toString() {
        return ime +  "   " + nedeli[0].toString() +
                nedeli[1].toString() + nedeli[2].toString() + nedeli[3].toString() +
                this.workhoursOfNedela();
    }

}

public class Main {


    public static Rabotnik najvreden_rabotnik(Rabotnik[] niza) {
        Rabotnik r = niza[0];
        for (int i = 0; i < niza.length; i++) {
            if (r.workhoursOfNedela() < niza[i].workhoursOfNedela()) {
                r = niza[i];
            }
        }
        return r;
    }

    public static void table(Rabotnik[] niza) {
        System.out.println("Rab   1   2   3   4   Vkupno");
        for (int i = 0; i < niza.length; i++) {
            System.out.println(niza[i].toString());
        }
        System.out.println("");
    }

    public static void main(String[] args) {

        int n;
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        Rabotnik[] niza = new Rabotnik[n];
        for (int i = 0; i < n; i++) {
            input.nextLine();
            String s = input.nextLine();
            RabotnaNedela[] rn = new RabotnaNedela[4];

            for (int j=0;j<4;j++)
            {
                int[] niza1 = new int[5];
                for (int z=0;z<5;z++)
                {
                    niza1[z]=input.nextInt();
                }
                rn[j]=new RabotnaNedela(niza1, 4);
            }
            niza[i]=new Rabotnik(s, rn);
        }

        table(niza);
        System.out.println("NAJVREDEN RABOTNIK: " + najvreden_rabotnik(niza).getIme());

    }
}