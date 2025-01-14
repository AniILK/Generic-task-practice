import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Medis azuolas = new Azuolas();
        Medis egle = new Egle();
        Medis kadagys = new Kadagys();
        Medis berzas = new Berzas();
        Medis pusis = new Pusis();
        Berzas tree1 = new Berzas();
        Berzas tree2 = new Berzas();
        Berzas tree3 = new Berzas();
        Spygliuotis spyg1 = new Spygliuotis();
        Spygliuotis spyg2 = new Spygliuotis();
        Spygliuotis spyg3 = new Spygliuotis();


        ArrayList<Medis> medis = new ArrayList<>();
        medis.add(azuolas);
        medis.add(egle);
        medis.add(kadagys);
        medis.add(berzas);
        medis.add(pusis);

        ArrayList<Berzas> berzai = new ArrayList<>();
        berzai.add(tree1);
        berzai.add(tree2);
        berzai.add(tree3);

        ArrayList<Spygliuotis> spygliuotis = new ArrayList<>();
        spygliuotis.add(spyg1);
        spygliuotis.add(spyg1);
        spygliuotis.add(spyg1);

        Miskas.spygliuociuMiskas(spygliuotis);
        Miskas.ivairusMiskas(medis);
        Miskas.berzuMiskas(berzai);







    }
}