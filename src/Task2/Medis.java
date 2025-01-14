package Task2;

abstract class Medis {

    public void turi() {
        if (this instanceof Lapuotis) {
            System.out.println(getClass().getSimpleName() + " turi lapus");
        } else if (this instanceof Spygliuotis) {
            System.out.println(getClass().getSimpleName() + " turi spyglius");
        }
    }
}
