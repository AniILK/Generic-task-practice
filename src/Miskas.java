import java.util.ArrayList;


 public class Miskas {

    public static void ivairusMiskas(ArrayList<? extends Medis> medziai) {
        System.out.println("-".repeat(30));
        System.out.println("IVAIRUS MIKAS: ");
        for (Medis medis : medziai) {
            medis.turi();
        }
    }

    public static void spygliuociuMiskas(ArrayList<? extends Spygliuotis> medziai) {
        System.out.println("-".repeat(30));
        System.out.println("SPYGLIUOCIU MISKAS: ");
        for (Spygliuotis medis : medziai) {
            medis.turi();
        }
    }

    public static void berzuMiskas(ArrayList<Berzas> medziai) {
        System.out.println("-".repeat(30));
        System.out.println("BERZU MISKAS:");
        System.out.println("Berzu miskas");
        for (Berzas medis : medziai) {
            medis.turi();
        }
    }

}
